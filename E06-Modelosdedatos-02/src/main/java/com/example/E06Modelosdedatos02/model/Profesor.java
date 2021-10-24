package com.example.E06Modelosdedatos02.model;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String email;
    private Double puntuacion;

    @Builder.Default
    @OneToMany
    private List<CursoOnline> cursosOnline = new ArrayList<>();

}
