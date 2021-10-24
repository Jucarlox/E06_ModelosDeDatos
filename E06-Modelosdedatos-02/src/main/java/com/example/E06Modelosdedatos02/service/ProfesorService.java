package com.example.E06Modelosdedatos02.service;

import com.example.E06Modelosdedatos02.model.Profesor;
import com.example.E06Modelosdedatos02.repository.ProfesorRepository;
import com.example.E06Modelosdedatos02.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
}
