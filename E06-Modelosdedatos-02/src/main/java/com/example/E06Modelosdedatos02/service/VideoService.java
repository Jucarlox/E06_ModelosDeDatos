package com.example.E06Modelosdedatos02.service;

import com.example.E06Modelosdedatos02.model.Video;
import com.example.E06Modelosdedatos02.repository.VideoRepository;
import com.example.E06Modelosdedatos02.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class VideoService extends BaseService <Video, Long, VideoRepository> {
}
