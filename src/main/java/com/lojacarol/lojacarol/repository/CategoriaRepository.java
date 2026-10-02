package com.lojacarol.lojacarol.repository;

import com.lojacarol.lojacarol.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
