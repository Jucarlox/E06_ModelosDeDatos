package com.example.E06Modelosdedatos01.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreCategoria;


    @ManyToOne
    private Categoria categoriaPadre;

    @Builder.Default
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos= new ArrayList<>();

    public Categoria(String nombreCategoria, Categoria categoriaPadre, List<Producto> productos) {
        this.nombreCategoria = nombreCategoria;
        this.categoriaPadre = categoriaPadre;
        this.productos = productos;
    }
}
