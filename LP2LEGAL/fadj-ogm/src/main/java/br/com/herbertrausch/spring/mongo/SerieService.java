package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class SerieService {

	private SerieRepository db;

	
	public SerieService(){ 
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(SerieRepository.class);
		
	}

	public List<Serie> getAll() {
		
		return db.findAll();
	}

	public void insert(Serie e) {
		db.save(e);
		
	}
	public void deleteByDeletarSerie(String nomeSerie){
 		db.deleteByDeletarSerie(nomeSerie);
 	}

	public List<Serie> getByNomeSerie(String nomeSerie) {
		
		return db.findByNomeSerie(nomeSerie);
		
	}
     public List<Serie> getByGeneroSerie(String generoSerie) {
		
		return db.findByGeneroSerie(generoSerie);
		
	}
     public List<Serie> getByEpisodiosNomeEpisodio(String nomeEpisodio) {
 		
 		return db.findByEpisodiosNomeEpisodio(nomeEpisodio);
 		
 	}
     public List<Serie> getByDataExibicao(String dataExibicao) {
  		
  		return db.findByDataExibicao(dataExibicao); 
  		
  	}
     

}