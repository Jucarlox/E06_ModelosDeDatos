package com.example.E06Modelosdedatos01.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder

public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreProducto;
    private Integer pvp;


    @ManyToOne
    private Categoria categoria;

    public void addCategoria (Categoria c){
        this.categoria=c;
        c.getProductos().add(this);
    }

    public void deleteCategoria(Categoria c){
        c.getProductos().remove(this);
        this.categoria=null;
    }

}
