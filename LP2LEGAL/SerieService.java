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
    public void deletarSerie(String nomeSerie){
    	db.deleteByNomeSerie(nomeSerie);
    	
    }
	

}
