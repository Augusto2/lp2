package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Episodio;
import br.com.herbertrausch.spring.mongo.EpisodioService;


@Path("/episodios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class EpisodioResource {

	EpisodioService service = new EpisodioService();
	
	@GET
	public List<Episodio> get() {
		
		return service.getAll();
		
	}
	
		
	@GET
	@Path("/Episodio/{nomeEpisodio}")
	public List<Episodio> getByNomeEpisodio(@PathParam("Nome") String nomeEpisodio) {
		return service.getByNomeEpisodio(nomeEpisodio);
	}
	
	
	
	@POST
	public Episodio save(Episodio e){
		
		service.insert(e);
		return e;
		
	}
    
}
