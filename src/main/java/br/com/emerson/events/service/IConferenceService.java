package br.com.emerson.events.service;

import java.util.List;

import br.com.emerson.events.model.Conference;

public interface IConferenceService {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}
