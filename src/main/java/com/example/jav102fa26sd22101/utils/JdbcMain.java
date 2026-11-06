package com.example.jav102fa26sd22101.utils;

import jakarta.persistence.EntityManager;

public class JdbcMain {

    public static void main(String[] args) {


        try (EntityManager em = EntityManagerUtils.getEntityManager()) {

            System.out.println("Connected, created tables, ...");

        } catch (Exception e) {

            System.out.println("Failed to create EntityManager");
            e.printStackTrace();
        }
    }

}
