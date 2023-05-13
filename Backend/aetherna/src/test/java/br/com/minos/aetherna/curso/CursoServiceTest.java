package br.com.minos.aetherna.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CursoServiceTest {

	// Nota: Meu Coverage por alguma razão não funciona
	// Logo estou indo no olho para saber se está com boa cobertura de testes
	// Isso leva a exaustão que pode induzir ao erro

	@Mock
	private CursoRepository repository;

	@InjectMocks
	private CursoService service;

	@BeforeEach
	public void load() {

		MockitoAnnotations.openMocks(this);

	}

	@Test
	void deveLancarExcecaoPorListaVazia() {

		when(repository.findAll()).thenReturn(new ArrayList<Curso>());

		try {

			service.findAll();
			fail("Deveria ter lançado uma exceção!");

		} catch (RuntimeException e) {

			assertEquals("Lista vazia!", e.getMessage());

		}

	}
	
	@Test
	void deveRetornarOIdBuscado() {
		
		Curso curso = new Curso();
		curso.setId(1);
		curso.setNome("Desenvolvimento Web");
		
		when(repository.findById(1)).thenReturn(Optional.of(curso));
		
		assertEquals(service.findById(1), Optional.of(curso));
		
	}
	
	@Test
	void deveLancarExcecaoPorIdInexistente() {
		
		Curso curso = new Curso();
		curso.setId(2);
		curso.setNome("Desenvolvimento Web");
		
		when(repository.findById(1)).thenReturn(Optional.empty());
		
		assertThrows(RuntimeException.class, () -> service.findById(1));
		
	}

	@Test
	void deveMostrarUmaListaComDoisItens() {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1, "Desenvolvimento Web", "Do zero ao mestre em HTML", "modelo1"));
		cursos.add(new Curso(2, "Conhecendo Angular", "Angular explicado de maneira simples", "modelo2"));
		when(repository.findAll()).thenReturn(cursos);

		List<Curso> response = service.findAll();
		assertEquals(cursos, response);

	}

	@Test
	void deveSalvarDevidoANomeCorreto() {

		Curso curso = new Curso();
		curso.setNome("Desenvolvimento Web");

		service.create(curso);

		verify(repository).save(curso);

	}

	@Test
	void naoDeveSalvarPorNomeMuitoGrande() {

		Curso curso = new Curso();
		curso.setNome("Este nome e grande demais para atender ao limite de 50 caracteres");

		assertThrows(IllegalArgumentException.class, () -> service.create(curso));

	}

	@Test
	void deveAtualizarOCurso() {

		Curso novoCurso = new Curso(1, "Novo Nome", "Nova Descricao", "modelo1");
		Curso cursoExistente = new Curso(1, "Nome Antigo", "Descricao Antiga", "modelo2");

		when(repository.findById(1)).thenReturn(Optional.of(cursoExistente));

		Optional<Curso> cursoAtualizado = service.update(1, novoCurso);

		assertTrue(cursoAtualizado.isPresent());
		// esses outros asserts não são necessários, visto que se haver diferenças
		// o assert acima irá dar erro, mas fiz mesmo assim por segurança
		assertEquals(cursoAtualizado.get().getId(), 1);
		assertEquals(cursoAtualizado.get().getNome(), "Novo Nome");
		assertEquals(cursoAtualizado.get().getDescricao(), "Nova Descricao");

	}

	@Test
	void falhaComCursoNaoEncontrado() {

		Curso novoCurso = new Curso();

		// ao não definir o que o repository deve retornar, ele não vai encontrar o id 1
		// e isso leva ao lançamento da exceção
		assertThrows(RuntimeException.class, () -> service.update(1, novoCurso));

	}

	@Test
	void deveDeletar() {

		int id = 1;
		when(repository.findById(id))
				.thenReturn(Optional.of(new Curso(1, "Do zero ao mestre em HTML", "Torne-se o melhor", "modelo3")));

		boolean response = service.delete(id);
		assertTrue(response);
		verify(repository).deleteById(id);

	}

	@Test
	void naoDeveDeletarDevidoIdInexistente() {

		int id = 1;
		when(repository.findById(id)).thenReturn(Optional.empty());

		try {
			
			service.delete(id);
			fail("Deveria ter lançado uma exceçao!");
			
		} catch (RuntimeException e) {
			
			assertEquals("Curso inexistente!", e.getMessage());
			
		}

	}

}
