package com.example.DeveloperCafe.dataAccess;

import com.example.DeveloperCafe.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository<Events,Integer> {
}
