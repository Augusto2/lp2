package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Serie implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomeSerie;
	private String generoSerie;
	private String emissoraSerie;

	public String getNomeSerie() {
		return nomeSerie;
	}
	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}
	public String getGeneroSerie() {
		return generoSerie;
	}
	public void setGeneroSerie(String generoSerie) {
		this.generoSerie = generoSerie;
	}
	public String getEmissoraSerie() {
		return emissoraSerie;
	}
	public void setEmissoraSerie(String emissoraSerie) {
		this.emissoraSerie = emissoraSerie;
	}

	@Override
	public String toString() {
		return "Serie [Nome=" + nomeSerie + ", Gênero=" + generoSerie + ", Emissora original=" + emissoraSerie +  "]";
	}
}
