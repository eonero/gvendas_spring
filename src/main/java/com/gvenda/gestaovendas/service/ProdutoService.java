package com.gvenda.gestaovendas.service;

import com.gvenda.gestaovendas.entities.Produto;
import com.gvenda.gestaovendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodas() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long codigo) {
        return produtoRepository.findById(codigo);

    }



}