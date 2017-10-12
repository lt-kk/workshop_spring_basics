package de.cdiag.ws.springbasics.dao;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


public interface CrudDao<T> {

	@Transactional
	T store(T entity);

	@Transactional(readOnly = true)
	List<T> all();

	@Transactional(readOnly = true)
	Optional<T> get(Long id);

	@Transactional
	int delete(Long id);

}
