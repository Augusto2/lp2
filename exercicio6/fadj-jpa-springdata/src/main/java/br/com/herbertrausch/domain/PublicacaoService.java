package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	
	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Publicacao> getPublicacaos() {
		List<Publicacao> publicacaos = (List<Publicacao>) db.findAll();
		 return publicacaos;
      }
	
	public List<Publicacao> getByTexto(String a){
		return db.findByTexto(a);
	}

	}

