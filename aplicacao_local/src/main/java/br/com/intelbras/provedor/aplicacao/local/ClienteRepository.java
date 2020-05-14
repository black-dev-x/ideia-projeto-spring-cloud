package br.com.intelbras.provedor.aplicacao.local;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Aplicacao, String>{

}
