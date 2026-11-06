package com.example.jav102fa26sd22101.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtils {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("default");

    public static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }
}
