package com.example.E06Modelosdedatos01.repository;

import com.example.E06Modelosdedatos01.model.Categoria;
import com.example.E06Modelosdedatos01.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoria (Categoria categoria);

}
