package com.gvenda.gestaovendas.repositories;

import com.gvenda.gestaovendas.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
