package com.dandara.historias;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Historia {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String autor;
	private String titulo;
	private Boolean anonimo;
	private Boolean permitirComentario;
	private String descricaoHistoria;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getAnonimo() {
		return anonimo;
	}

	public void setAnonimo(Boolean anonimo) {
		this.anonimo = anonimo;
	}

	public Boolean getPermitirComentario() {
		return permitirComentario;
	}

	public void setPermitirComentario(Boolean permitirComentario) {
		this.permitirComentario = permitirComentario;
	}

	public String getDescricaoHistoria() {
		return descricaoHistoria;
	}

	public void setDescricaoHistoria(String descricaoHistoria) {
		this.descricaoHistoria = descricaoHistoria;
	}

}
