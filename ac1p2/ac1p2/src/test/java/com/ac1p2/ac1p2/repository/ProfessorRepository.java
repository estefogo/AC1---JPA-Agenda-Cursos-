package com.ac1p2.ac1p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac1p2.ac1p2.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
    
}
