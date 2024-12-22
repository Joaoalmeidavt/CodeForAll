package ManyToOne;

import OneToOne.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("store");

        EntityManager em = emf.createEntityManager();

        Category category = new Category();
        category.setName("Beauty");

        Product product1 = new Product();
        product1.setCategory(category);
        product1.setName("Blush");

        Product product2 = new Product();
        product2.setCategory(category);
        product2.setName("Eyeliner");

        Product product3 = new Product();
        product3.setCategory(category);
        product3.setName("Foundation");

        em.getTransaction().begin();
        em.persist(category);
        em.persist(product1);
        em.persist(product2);
        em.persist(product3);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
