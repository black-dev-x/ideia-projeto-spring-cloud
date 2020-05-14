package br.com.intelbras.provedor.cliente.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClienteLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteLocalApplication.class, args);
	}

}
