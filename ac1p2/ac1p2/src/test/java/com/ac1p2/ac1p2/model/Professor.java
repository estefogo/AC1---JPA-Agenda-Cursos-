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

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Professor {

    
    @OneToMany(mappedBy = "professor")
    List<Agenda> agendas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_professor;
    
    @Column
    private int cpf;
    @Column
    private int rg;
    @Column
    private String endereco;
    @Column
    private int celular;
    @Column
    private String nome;

}
