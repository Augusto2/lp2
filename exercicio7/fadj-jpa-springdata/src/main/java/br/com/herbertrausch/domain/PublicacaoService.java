package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}
	
	// Lista todas publicacoes do banco de dados
		public List<Publicacao> getPublicacao() {
			try {
				
				List<Publicacao> publicacoes = (List<Publicacao>) db.findAll();
						
				return publicacoes;
				
			} catch (Exception e) {
				e.printStackTrace();
				return new ArrayList<Publicacao>();

			}
		}
	
		public Publicacao getPublicacao(Long id) {
			try {
				
				
				return db.findOne(id);
				
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public List<Publicacao> getByTexto(String a){
			return db.findByTexto(a);
		}

}
