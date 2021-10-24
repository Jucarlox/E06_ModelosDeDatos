package com.example.E06Modelosdedatos02.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@Builder
@NoArgsConstructor@AllArgsConstructor
public class CursoOnline {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Double puntuacion;

    @ManyToOne
    private Profesor profesor;

    @OneToMany
    private List<Video> listaVideos = new ArrayList<>();

    public void addProfesor(Profesor p){
        this.profesor = p;
        p.getCursosOnline().add(this);
    }

    public void deleteProfesor(Profesor p){
        p.getCursosOnline().remove(this);
        this.profesor=null;
    }
}
