package com.ac1p2.ac1p2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Agenda { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_agenda;
    
    @ManyToOne
    @JoinColumn (name = "curso_id")
    private Curso curso;


    @ManyToOne
    @JoinColumn (name = "professor_id")
    private Professor professor;
    @Column
    private String dataInicio;
    @Column
    private String dataFim;
    @Column
    private String horarioInicio;
    @Column
    private String horarioFim;
    @Column
    private String cidade;
    @Column
    private String cep;
    @Column
    private String uf;
}