package br.com.emerson.events.service;

import java.util.List;

import br.com.emerson.events.model.Session;
import br.com.emerson.events.model.Subscription;
import br.com.emerson.events.model.User;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
