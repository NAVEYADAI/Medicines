import Entity.TakeBallEntity;
import Entity.UserEntity;
import control.TakeBall;
import control.User;
import control.jpaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;
//import java.time.LocalDate;

import static control.TakeBall.insert;
import static org.joda.time.LocalDate.now;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try {
            transaction.begin();

//            TakeBallEntity data = new TakeBallEntity();
//            data.setIdNameOfBall(1);
//            data.setIdRestrictions(1);
//            data.setIdUser(1);
//            data.setTime(Date.valueOf(LocalDate.now()));
            long millis = System.currentTimeMillis();

            // creating sql date object
            java.sql.Date sqlDate = new java.sql.Date(millis);

            // creating util date object by passing gettime()
            // method of sql date class
            java.util.Date utilDate = new java.util.Date(sqlDate.getTime());


            // converting the util date into string format
            //Date utilDate=new Date();
            insert(1,1,1,  sqlDate);
//            LocalDate myObj = now();
//            entityManager.persist(new TakeBallEntity
//                    (1,1,1,1,Date.v(myObj)));

            transaction.commit();
        }
        finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }



    }
    public static void jpa(){
        jpaEntity p = new jpaEntity();
        p.upConnect();

        //Calendar sqlDate = null;
        long millis = System.currentTimeMillis();

        // creating sql date object
        java.sql.Date sqlDate = new java.sql.Date(millis);

        // creating util date object by passing gettime()
        // method of sql date class
        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());


        // converting the util date into string format
        //Date utilDate=new Date();
        insert(1,1,1,  sqlDate);
        //TakeBall.printTable();
        p.closeConnect();
    }
}
