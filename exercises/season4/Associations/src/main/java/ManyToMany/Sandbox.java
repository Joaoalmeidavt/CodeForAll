package ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("security");

        EntityManager em = emf.createEntityManager();

        User user1 = new User();
        user1.setUsername("CodeCadet");
        user1.setPassword("cenas");

        User user2 = new User();
        user2.setUsername("Margret");
        user2.setPassword("osdfoiwov");

        User user3 = new User();
        user3.setUsername("Frida");
        user3.setPassword("sdf0ivp");

        SecurityGroup sGroup1 = new SecurityGroup();
        sGroup1.addUser(user1);
        sGroup1.addUser(user2);

        user1.addSgroups(sGroup1);
        user2.addSgroups(sGroup1);

        SecurityGroup sGroup2 = new SecurityGroup();
        sGroup2.addUser(user3);

        user3.addSgroups(sGroup2);

        em.getTransaction().begin();
        em.persist(user1);
        em.persist(user2);
        em.persist(user3);
        em.persist(sGroup1);
        em.persist(sGroup2);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
