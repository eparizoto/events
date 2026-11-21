package br.com.emerson.events.repository;

import org.springframework.data.repository.ListCrudRepository;

import br.com.emerson.events.model.Conference;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer>{

}
