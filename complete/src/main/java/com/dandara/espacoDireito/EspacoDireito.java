package com.dandara.espacoDireito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EspacoDireito {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nomeLei;
	private String numeroLei;
	private String conteudoLei;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeLei() {
		return nomeLei;
	}

	public void setNomeLei(String nomeLei) {
		this.nomeLei = nomeLei;
	}

	public String getNumeroLei() {
		return numeroLei;
	}

	public void setNumeroLei(String numeroLei) {
		this.numeroLei = numeroLei;
	}

	public String getConteudoLei() {
		return conteudoLei;
	}

	public void setConteudoLei(String conteudoLei) {
		this.conteudoLei = conteudoLei;
	}
}
