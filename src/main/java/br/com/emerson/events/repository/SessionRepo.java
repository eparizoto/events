package br.com.emerson.events.repository;

import org.springframework.data.repository.ListCrudRepository;

import br.com.emerson.events.model.Session;

public interface SessionRepo extends ListCrudRepository<Session, Integer>{

}
