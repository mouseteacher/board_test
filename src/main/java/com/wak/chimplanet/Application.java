package com.wak.chimplanet;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@SpringBootApplication
public class Application {


//    @PersistenceUnit
//    EntityManagerFactory emf;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}