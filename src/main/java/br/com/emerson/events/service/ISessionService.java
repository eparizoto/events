package br.com.emerson.events.service;

import java.util.List;

import br.com.emerson.events.model.Session;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Integer id);
    public List<Session> getAllSessions();
}
