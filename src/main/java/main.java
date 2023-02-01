import Entity.NameOfBallEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction= entityManager.getTransaction();

        try{
            transaction.begin();

            NameOfBallEntity name=new NameOfBallEntity();
            name.setNameBall("yadai");
            entityManager.persist(name);

            transaction.commit();
        }finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
