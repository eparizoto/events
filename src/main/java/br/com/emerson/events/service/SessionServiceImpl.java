package br.com.emerson.events.service;

import br.com.emerson.events.exception.NotFoundException;
import br.com.emerson.events.model.Session;
import br.com.emerson.events.repository.SessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService{

    private SessionRepo repo;


    public SessionServiceImpl(SessionRepo repo) {
        super();
        this.repo = repo;
    }

    @Override
    public Session addSession(Session session) {
        // TODO Auto-generated method stub
        return repo.save(session);
    }

    @Override
    public Session getSessionById(Integer id) {
        // TODO Auto-generated method stub
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Session "+id+" not found"));
    }

    @Override
    public List<Session> getAllSessions() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

}

