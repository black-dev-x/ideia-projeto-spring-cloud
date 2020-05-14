package br.com.intelbras.provedor.shared;

import java.time.LocalDateTime;

public class Sincronizavel {

	protected Status status = Status.CRIANDO;

	protected Boolean precisaDeSincronizacao = true;

	protected String idDaAplicacao;

	protected String ultimaModificacao = LocalDateTime.now().toString();

	public Status getStatus() {
		return status;
	}

	public String getUltimaModificacao() {
		return ultimaModificacao;
	}

	public void setStatus(Status status) {
		this.ultimaModificacao = LocalDateTime.now().toString();
		this.status = status;
		this.precisaDeSincronizacao = true;
	}

	public void processado() {
		precisaDeSincronizacao = false;
	}

	public void setPrecisaDeSincronizacao(Boolean precisaDeSincronizacao) {
		this.precisaDeSincronizacao = precisaDeSincronizacao;
	}

	public Boolean getPrecisaDeSincronizacao() {
		return precisaDeSincronizacao;
	}

	public void setUltimaModificacao(String ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}

	public boolean precisaSerProcessado() {
		return status == Status.CRIANDO || status == Status.DELETANDO || status == Status.EDITANDO;
	}

	public String getIdDaAplicacao() {
		return idDaAplicacao;
	}

	public void setIdDaAplicacao(String idDaAplicacao) {
		this.idDaAplicacao = idDaAplicacao;
	}

}
