package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Episodio implements Serializable {

	private static final long serialVersionUID = 1L;

	private int temporada;
	private String nomeEpisodio;	

	public String getNomeEpisodio() {
		return nomeEpisodio;
	}
	public void setNomeEpisodio(String nomeEpisodio) {
		this.nomeEpisodio = nomeEpisodio;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	@Override
	public String toString() {
		return "Episodio [Nome=" + nomeEpisodio + ", Temporada=" + temporada +  "]";
	}
}