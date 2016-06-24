package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;


public class EpisodioService {
	
	private EpisodioRepository db;
	
	public EpisodioService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(EpisodioRepository.class);
	}
	
	public void insert(Episodio e){
		db.save(e);
	}
	
	public List<Episodio> getAll(){
		
		return db.findAll();
	}
	
		
	public List<Episodio> getAll(int idTemporada){		
		return db.findByIdTemporada(idTemporada);
	}

	public List<Episodio> getByNomeEpisodio(String nomeEpisodio) {
		// TODO Auto-generated method stub
		return db.findByNomeEpisodio(nomeEpisodio);
	}
}
