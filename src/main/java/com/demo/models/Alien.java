package com.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Alien")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Alien {

    @Id
    private String id;
    private String name;
    private String planet;
}
