package br.com.intelbras.provedor.aplicacao.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicacaoController {

	@Autowired
	private AplicacaoService aplicacaoService;

	@PostMapping(path = "/aplicacao")
	public Aplicacao registraAplicacao(@RequestBody Aplicacao aplicacao) {
		return aplicacaoService.registraAplicacao(aplicacao); 
	}
	
	@PostMapping(path = "/sincronizar/login")
	public void getPermissaoParaSincronizar(@RequestBody Aplicacao aplicacao) {
		aplicacaoService.getPermissaoParaSincronizar(aplicacao);
	}
	}
}
