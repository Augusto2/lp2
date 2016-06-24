package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends MongoRepository<Usuario, String> {

	List<Usuario>findByNome(String nome);
	List<Usuario>findByNickname(String nickname);

}
