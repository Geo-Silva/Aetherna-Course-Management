package br.com.minos.aetherna.curso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //normalmente eu utilizo o UUID, por questão de simplicidade irei usar um Int
	private String nome;
	private String descricao;
	
	//estou criando esse construtor completo para caso seja necessário, no futuro, alterar a forma
	//que as informações são recebidas e manipuladas, caso contrário teria utilizado o Lombok
	public Curso(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		
	}
	
}
