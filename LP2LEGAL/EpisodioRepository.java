package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepository  extends MongoRepository<Episodio, String> {

	List<Episodio>findByNomeEpisodio(String nomeEpisodio);
	List<Episodio>findByIdTemporada(int idTemporada);

}
