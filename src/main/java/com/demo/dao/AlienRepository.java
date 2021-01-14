package com.demo.dao;

import com.demo.models.Alien;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlienRepository extends MongoRepository<Alien, String> {

}
