package com.ac1p2.ac1p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac1p2.ac1p2.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
    
}
