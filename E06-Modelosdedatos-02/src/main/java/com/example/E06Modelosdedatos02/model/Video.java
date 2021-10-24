package com.example.E06Modelosdedatos02.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder
public class Video {
    @Id
    @GeneratedValue
    private Long id;

    private int orden;
    private String titulo;
    private String descripcion;
    private String url;

    @ManyToOne
    private CursoOnline cursosOnline;



}
