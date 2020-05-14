package br.com.intelbras.provedor.aplicacao.local;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AplicacaoService {

	@Autowired
	private AplicacaoRepository aplicacaoRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private SecurityService securityService;
	
	public Aplicacao registraAplicacao(Aplicacao aplicacao) {
		geraUsuarioParaAAplicacao(aplicacao);
		aplicacao.setRegistradaNaNuvem(true);
		return aplicacaoRepository.save(aplicacao);   
	}

	private void geraUsuarioParaAAplicacao(Aplicacao aplicacao) {
		usuarioService.geraUsuarioParaAAplicacao(aplicacao);
	}

	public void getPermissaoParaSincronizar(Aplicacao aplicacao) {
		securityService.autoLogin(aplicacao.getId(), aplicacao.getId());
	}

}
