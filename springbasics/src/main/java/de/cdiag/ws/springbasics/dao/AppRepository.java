package de.cdiag.ws.springbasics.dao;

import de.cdiag.ws.springbasics.domain.App;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppRepository extends CrudRepository<App, Long> {

    List<App> findByName(String name);

}
