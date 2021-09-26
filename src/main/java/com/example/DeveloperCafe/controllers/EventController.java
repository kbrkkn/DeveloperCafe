package com.example.DeveloperCafe.controllers;

import com.example.DeveloperCafe.business.EventService;
import com.example.DeveloperCafe.entities.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private EventService eventService;

    @Autowired
     public EventController(EventService eventService){
        this.eventService=eventService;
    }

    @GetMapping("/getall")
    public List<Events> getAll(){
        return this.eventService.getAllEvents();
    }
}
