package com.cognizant.ormlearn;

import jakarta.persistence.*;

public class JPAMain {
    public static void main(String[] args) throws InterruptedException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Employee emp = new Employee("Rita", "Joseph", 50000);
        em.persist(emp);

        Employee found = em.find(Employee.class, emp.getId());
        System.out.println("Found: " + found);

        em.remove(found);
        tx.commit();

        em.close();
        emf.close();
    com.mysql.cj.jdbc.AbandonedConnectionCleanupThread.checkedShutdown();
}

    }

