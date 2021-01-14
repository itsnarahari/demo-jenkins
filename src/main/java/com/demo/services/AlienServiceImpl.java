package com.demo.services;

import com.demo.dao.AlienRepository;
import com.demo.models.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienServiceImpl {

    @Autowired
    @Qualifier("alienRepository")
    AlienRepository alienRepository;

    public Alien saveAlien(Alien alien){
        alienRepository.save(alien);
        return alien;
    }

    public List<Alien> getAllAliens()
    {
        return alienRepository.findAll();
    }
}
