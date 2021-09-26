package com.example.DeveloperCafe.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="EVENTS")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_ID")
    private int eventId;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "EVENT_DATE")
    private Date eventDate;

    @Column(name = "EVENT_LOCATION")
    private String location;

    @Column(name = "EVENT_ORGANIZER")
    private String organizer;

    public Events(){

    }
    public Events(int eventsId, String eventName, Date eventDate, String location, String organizer) {
        this.eventId = eventsId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.organizer = organizer;
    }

    public int getEventsId() {
        return eventId;
    }

    public void setEventsId(int eventId) {
        this.eventId = eventId;
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
}
