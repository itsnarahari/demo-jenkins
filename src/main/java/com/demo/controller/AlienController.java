package com.demo.controller;

import com.demo.models.Alien;
import com.demo.services.AlienServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AlienController {

    @Autowired
    AlienServiceImpl service;

    @RequestMapping("/")
    public ResponseEntity<?> helloWOrld() throws JsonProcessingException {
        Map map = new HashMap();
        map.put("message","Hello world");
        return new ResponseEntity<>(new ObjectMapper().writeValueAsString(map),HttpStatus.OK);
    }

    @PostMapping("alien")
    public ResponseEntity<?> saveUser(@RequestBody Alien alien)
    {
        return new ResponseEntity<>(service.saveAlien(alien), HttpStatus.OK);
    }

    @GetMapping("alien")
    public ResponseEntity<?> getAlien()
    {
        return new ResponseEntity<>(service.getAllAliens(), HttpStatus.OK);
    }
}
