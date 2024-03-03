package com.github.ConnectionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionFactory {

    public static EntityManager GetConnection(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Teste");

        return emf.createEntityManager();

    }

}
