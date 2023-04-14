package com.ac1p2.ac1p2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    
    @Column(length = 200, nullable = false)
    private String nome;


@OneToMany(mappedBy = "curso")
    List<Agenda> agendas;

    @Column
    private int cargaHoraria;
    @Column
    private String descricao;
    @Column
    private String objetivos;
    @Column
    private String ementa;
  
}
