import Entity.TakeBallEntity;
import Entity.UserEntity;
import control.TakeBall;
import control.User;
import control.jpaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Date;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try {
            transaction.begin();
            TakeBallEntity data = new TakeBallEntity();
            data.setIdNameOfBall(1);
            data.setIdRestrictions(1);
            data.setIdUser(1);
            //data.setTime(Date.valueOf(LocalDate.now()));
            entityManager.persist(data);

            transaction.commit();
        }
        finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }



        jpaEntity p = new jpaEntity();
        p.upConnect();
        TakeBall.insert(1,1,1, Date.valueOf(LocalDate.now()));
        TakeBall.printTable();
        p.closeConnect();
    }
}
