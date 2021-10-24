package com.example.E06Modelosdedatos02;

import com.example.E06Modelosdedatos02.model.CursoOnline;
import com.example.E06Modelosdedatos02.model.Profesor;
import com.example.E06Modelosdedatos02.model.Video;
import com.example.E06Modelosdedatos02.service.CursoOnlineService;
import com.example.E06Modelosdedatos02.service.ProfesorService;
import com.example.E06Modelosdedatos02.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final VideoService videoService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void test(){
        Profesor profesor = Profesor.builder()
                .nombre("Luismi")
                .email("prueba@gmail.com")
                .puntuacion(4.5)
                .build();

        profesorService.save(profesor);

        CursoOnline curso1 = CursoOnline.builder()
                .nombre("Docker")
                .puntuacion(4.9)
                .build();
        curso1.addProfesor(profesor);

        cursoOnlineService.save(curso1);

        Video video1 = Video.builder().orden(1).titulo("Video numero 1").descripcion("Descripcion del video 1").url("a").build();
        Video video2 = Video.builder().orden(2).titulo("Video numero 2").descripcion("Descripcion del video 2").url("b").build();

        videoService.save(video1);
        videoService.save(video2);

        profesorService.
                findAll()
                .forEach(p -> System.out.printf("%s %s %s\n", p.getNombre(),p.getEmail(), p.getPuntuacion() ));

        cursoOnlineService.
                findAll()
                .forEach(c -> System.out.printf("%s %s %s\n", c.getNombre(), c.getPuntuacion(), c.getProfesor().getNombre() ));

        videoService.
                findAll()
                .forEach(v -> System.out.printf("%s %s %s %s\n", v.getOrden(), v.getTitulo(), v.getDescripcion(), v.getUrl() ));

    }

}
