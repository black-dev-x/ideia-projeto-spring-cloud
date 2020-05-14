package br.com.intelbras.provedor.cliente.local;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.intelbras.provedor.shared.Sincronizavel;

@Document(collection = "clientes")
public class Cliente extends Sincronizavel {

	@Id
	private String id;

	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
