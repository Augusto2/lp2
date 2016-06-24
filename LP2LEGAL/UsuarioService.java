package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	private static final String String = null;
	private UsuarioRepository db;

	
	public UsuarioService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(UsuarioRepository.class);
		
	}

	public List<Usuario> getAll() {
		
		return db.findAll();
	}

	public void insert(Usuario e) {
		db.save(e);
		
	}

	public List<Usuario> getByNickname(String nickname) {
		// TODO Auto-generated method stub
		return db.findByNickname(nickname);
	}
	


}
