package com.ac1p2.ac1p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ac1p2.ac1p2.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long>{
    
    @Query("select cc from CursoRepository cc left join fetch cc.cursos c where cc.id = :id ")
    CursoRepository findCategoriaCursoFetchCursos(@Param("id") Long id);

}
