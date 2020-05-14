package br.com.intelbras.provedor.aplicacao.local;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "app")
public class Aplicacao {

	@Id
	private String id = UUID.randomUUID().toString();

	private boolean registradaNaNuvem = false; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isRegistradaNaNuvem() {
		return registradaNaNuvem;
	}

	public void setRegistradaNaNuvem(boolean registradaNaNuvem) {
		this.registradaNaNuvem = registradaNaNuvem;
	}

}
