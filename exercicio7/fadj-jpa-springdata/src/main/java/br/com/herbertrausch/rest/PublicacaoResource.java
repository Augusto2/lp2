package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Cliente;
import br.com.herbertrausch.domain.ClienteService;
import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;
@Path("/publicacoes")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class PublicacaoResource {
	
	public PublicacaoService publicacaoService = new PublicacaoService();
	

	@GET
	public List<Publicacao> get() {
		List<Publicacao> publicacoes = publicacaoService.getPublicacao();
		return publicacoes;
	}

	
	@GET
	@Path("{id}")
	public Publicacao getById(@PathParam("id") long id) {
		Publicacao p = publicacaoService.getPublicacao(id);
		return p;
	}

	
	@GET
	@Path("/texto/{texto}")
	public List<Publicacao> getByTexto(@PathParam("texto") String texto) {
		List<Publicacao> publicacoes = publicacaoService.getByTexto(texto);
		return publicacoes;
	}

}
