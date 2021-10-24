package com.example.E06Modelosdedatos02.repository;

import com.example.E06Modelosdedatos02.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
