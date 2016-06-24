package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository  extends MongoRepository<Serie, String> {

	List<Serie>findByNomeSerie(String nomeSerie);
	List<Serie>findByGeneroSerie(String generoSerie );
	void deleteByNomeSerie(String nomeSerie);

}
