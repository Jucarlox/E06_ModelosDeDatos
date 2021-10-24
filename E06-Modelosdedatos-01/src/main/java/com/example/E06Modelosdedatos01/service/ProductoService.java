package com.example.E06Modelosdedatos01.service;

import com.example.E06Modelosdedatos01.model.Producto;
import com.example.E06Modelosdedatos01.repository.ProductoRepository;
import com.example.E06Modelosdedatos01.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService <Producto, Long, ProductoRepository> {
}
