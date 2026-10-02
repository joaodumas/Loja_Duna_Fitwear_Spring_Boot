package com.lojacarol.lojacarol.service;

import com.lojacarol.lojacarol.model.Categoria;

import com.lojacarol.lojacarol.repository.CategoriaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
