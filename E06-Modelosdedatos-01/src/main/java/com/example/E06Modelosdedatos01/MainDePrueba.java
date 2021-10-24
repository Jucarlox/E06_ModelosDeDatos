package com.example.E06Modelosdedatos01;

import com.example.E06Modelosdedatos01.model.Categoria;
import com.example.E06Modelosdedatos01.model.Producto;
import com.example.E06Modelosdedatos01.service.CategoriaService;
import com.example.E06Modelosdedatos01.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void test(){
        Categoria categoria= Categoria.builder()
                .nombreCategoria("Limpieza")
                .categoriaPadre(null)
                .build();

        categoriaService.save(categoria);

        Categoria categoriaHija = Categoria.builder()
                .nombreCategoria("Articulos limpieza")
                .categoriaPadre(categoria)
                .build();

        categoriaService.save(categoriaHija);

        Producto producto = Producto.builder()
                .nombreProducto("Fregona")
                .pvp(700)
                .build();

        producto.addCategoria(categoriaHija);

        productoService.save(producto);

        categoriaService.
                findAll()
                .forEach(c -> System.out.printf("%s %s %s\n", c.getId(),c.getNombreCategoria(), c.getCategoriaPadre() ));

        producto.addCategoria(categoriaHija);

                productoService.save(producto);
                productoService. findAll(). forEach(p -> System.out.printf("%s %s %s %s\n",p.getId(), p.getNombreProducto(), p.getPvp(), p.getCategoria().getNombreCategoria()));

        /*  Prueba de borrado de Categorias
                producto.deleteCategoria(categoriaHija);
        productoService.save(producto);

        productoService. findAll(). forEach(p -> System.out.printf("%s %s %s %s\n",p.getId(), p.getNombreProducto(), p.getPvp(), p.getCategoria().getNombreCategoria()));
        */
    }
}
