package com.example.E06Modelosdedatos01.repository;

import com.example.E06Modelosdedatos01.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
