package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String nickname;
	private String email;
	private String senha;
	
	@DBRef
	private List<Serie> series;

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [senha=" + senha + ", Nome=" + nome + ", nickname=" + nickname + ", email=" + email +  "]";
	}
}