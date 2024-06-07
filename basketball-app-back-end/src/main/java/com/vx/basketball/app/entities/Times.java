package com.vx.basketball.app.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_times")
public class Times {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	@NotNull
	private String conferencia;
	@NotNull
	private String titulos;
	@NotNull
	private String melhorJogador;
	
	public Times() {
		
	}
	

	public Times(Long id, String nome, String conferencia, String titulos, String melhorJogador) {
		super();
		this.id = id;
		this.nome = nome;
		this.conferencia = conferencia;
		this.titulos = titulos;
		this.melhorJogador = melhorJogador;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getMelhorJogador() {
		return melhorJogador;
	}

	public void setMelhorJogador(String melhorJogador) {
		this.melhorJogador = melhorJogador;
	}
	
	

}
