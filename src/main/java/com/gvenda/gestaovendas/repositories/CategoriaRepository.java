package com.gvenda.gestaovendas.repositories;

import com.gvenda.gestaovendas.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {



}
