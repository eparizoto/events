package br.com.emerson.events.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import br.com.emerson.events.model.Session;
import br.com.emerson.events.model.Subscription;
import br.com.emerson.events.model.SubscriptionID;
import br.com.emerson.events.model.User;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID>{
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}

