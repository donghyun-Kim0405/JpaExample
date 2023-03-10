package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {


        //persistenceUnitName -> META-INF에서 설정한 name
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Member member = new Member();

        member.setId(1L);
        member.setName("HellowA");

        em.persist(member);

        tx.commit();
        em.close();
        emf.close();
    }
}