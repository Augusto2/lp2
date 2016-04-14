package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;
import br.com.herbertrausch.domain.Response;

@Path("/publicacaos")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PublicacaoResource {
	
	public PublicacaoService publicacaoService = new PublicacaoService();
	

	@GET
	public List<Publicacao> get() {
		List<Publicacao> publicacaos = publicacaoService.getPublicacaos();
		return publicacaos;
	}

	@GET
	@Path("/texto/{texto}")
	public List<Publicacao> getByNome(@PathParam("texto") String texto) {
		List<Publicacao> publicacaos = publicacaoService.getByTexto(texto);
		return publicacaos;
	}
	
}