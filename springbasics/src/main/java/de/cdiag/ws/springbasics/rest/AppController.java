package de.cdiag.ws.springbasics.rest;

import de.cdiag.ws.springbasics.dao.AppRepository;
import de.cdiag.ws.springbasics.domain.App;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class AppController implements CrudController<App> {

    private final AppRepository appRepository;

    public HttpEntity<Iterable<App>> all() {
        Iterable<App> result = appRepository.findAll();
        return new HttpEntity<>(result);
    }

    public HttpEntity<App> create(@RequestBody App entity) {
        App result = appRepository.save(entity);
        return ResponseEntity.ok(result);
    }

    public HttpEntity<App> get(@PathVariable("id") Long id) {
        return null;
    }

    public HttpEntity<App> update(@PathVariable("id") Long id, @RequestBody App entity) {
        return null;
    }

    public HttpEntity<?> delete(@PathVariable("id") Long id) {
        return null;
    }
}
