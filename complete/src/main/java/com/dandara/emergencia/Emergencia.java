package com.dandara.emergencia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emergencia {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Boolean enviarLocalizacaoSms;
	private String mensagemTextoSms;
	private Boolean enviarLocalizacaoEmail;
	private String mensagemTextoEmail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEnviarLocalizacaoSms() {
		return enviarLocalizacaoSms;
	}

	public void setEnviarLocalizacaoSms(Boolean enviarLocalizacaoSms) {
		this.enviarLocalizacaoSms = enviarLocalizacaoSms;
	}

	public String getMensagemTextoSms() {
		return mensagemTextoSms;
	}

	public void setMensagemTextoSms(String mensagemTextoSms) {
		this.mensagemTextoSms = mensagemTextoSms;
	}

	public Boolean getEnviarLocalizacaoEmail() {
		return enviarLocalizacaoEmail;
	}

	public void setEnviarLocalizacaoEmail(Boolean enviarLocalizacaoEmail) {
		this.enviarLocalizacaoEmail = enviarLocalizacaoEmail;
	}

	public String getMensagemTextoEmail() {
		return mensagemTextoEmail;
	}

	public void setMensagemTextoEmail(String mensagemTextoEmail) {
		this.mensagemTextoEmail = mensagemTextoEmail;
	}
}
