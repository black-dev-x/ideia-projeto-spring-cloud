package br.com.intelbras.provedor.cliente.local;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping(path = "/")
	public List<Cliente> getClientes() {
		return clienteService.getClientes();
	}
	
	@PostMapping(path="/")
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
		return clienteService.cadastrarCliente(cliente);
	}
}
