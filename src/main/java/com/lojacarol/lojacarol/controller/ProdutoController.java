package com.lojacarol.lojacarol.controller;

import com.lojacarol.lojacarol.model.Produto;
import com.lojacarol.lojacarol.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos() {
        List<Produto> produtos = produtoService.listarTodos();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        Produto salva = produtoService.salvar(produto);
        return ResponseEntity.status(201).body(salva);
    }
}
