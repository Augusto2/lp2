package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Episodio implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idTemporada;
	private String nomeEpisodio;

	public String getNomeEpisodio() {
		return nomeEpisodio;
	}
	public void setNomeEpisodio(String nomeEpisodio) {
		this.nomeEpisodio = nomeEpisodio;
	}
	public int getIdTemporada() {
		return idTemporada;
	}
	public void setIdTemporada(int idTemporada) {
		this.idTemporada = idTemporada;
	}
	
	@Override
	public String toString() {
		return "Episodio [Nome=" + nomeEpisodio + ", Temporada=" + idTemporada +  "]";
	}
}
