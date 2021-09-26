package com.example.DeveloperCafe.business;

import com.example.DeveloperCafe.dataAccess.EventDao;
import com.example.DeveloperCafe.entities.Events;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventManager implements EventService{
    private EventDao eventDao;

    @Override
    public List<Events> getAllEvents() {
        return this.eventDao.findAll();
    }
}
