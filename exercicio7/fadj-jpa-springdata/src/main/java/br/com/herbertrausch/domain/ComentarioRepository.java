package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComentarioRepository extends CrudRepository<Comentario, Long> {

	public List<Comentario> findByComentario(String comentario);
}