package br.com.minos.aetherna.curso;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Curso> listarTodos(){
		
		List<Curso> response = service.findAll();
		
		return response;
		
	}
	
	@GetMapping("/buscar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Optional<Curso> buscarPorId(@PathVariable("id") int param){
		
		Optional<Curso> response = service.findById(param);
		
		return response;
		
	}

	@PostMapping("/criar")
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Curso adicionar(@RequestBody Curso curso) {
		
		return service.create(curso);
		
	}
	
	@PutMapping("/atualizar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Optional<Curso> atualizar(@PathVariable("id") int param,
			@RequestBody Curso novoCurso) {
		
		return service.update(param, novoCurso);
		
	}
	
	@DeleteMapping("/deletar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody boolean deletar(@PathVariable("id") int param) {
		
		return service.delete(param);
		
	}
	
}
