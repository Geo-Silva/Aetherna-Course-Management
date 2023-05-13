package br.com.minos.aetherna.curso;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repository;

	public List<Curso> findAll() {
		
		if(repository.findAll().isEmpty()) {
			
			throw new RuntimeException("Lista vazia!");
			
		} else {
			
			List<Curso> response = repository.findAll();
			return response;
			
		}

	}
	
	public Optional<Curso> findById(int param) {
		
		if(repository.findById(param).isPresent() == true) {
			
			return repository.findById(param);
			
		} else {
			
			throw new RuntimeException("Id não encontrado!");
			
		}

	}
	
	public Curso create(Curso curso) {

		if (curso.getNome().length() > 50) {

			throw new IllegalArgumentException("Nome do curso excede o limite de 50 caracteres!");

		} else {

			return repository.save(curso);

		}

	}

	public Optional<Curso> update(int param, Curso novoCurso) {

		if (repository.findById(param).isPresent()) {

			Curso atualizado = repository.findById(param).get();
			atualizado.setNome(novoCurso.getNome());
			atualizado.setDescricao(novoCurso.getDescricao());
			atualizado.setModelo(novoCurso.getModelo());
			repository.save(atualizado);

			return repository.findById(param);

		} else {

			throw new RuntimeException("Curso não encontrado!");

		}

	}
	
	public boolean delete(int id) {
		
		if (repository.findById(id).isPresent()) {
			
			repository.deleteById(id);
			
			return true;
			
		} else {
			
			throw new RuntimeException("Curso inexistente!");
			
		}
		
	}

}
