package com.lojacarol.lojacarol.controller;

import com.lojacarol.lojacarol.model.Categoria;
import com.lojacarol.lojacarol.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarTodas() {
        List<Categoria> categorias = categoriaService.listarTodas();
        return ResponseEntity.ok(categorias);
    }

    @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
        Categoria salva = categoriaService.salvar(categoria);
        return ResponseEntity.status(201).body(salva);
    }
}
