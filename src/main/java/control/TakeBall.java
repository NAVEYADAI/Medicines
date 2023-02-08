package control;

import Entity.TakeBallEntity;
import jakarta.persistence.TypedQuery;

import java.sql.Date;
import java.util.List;

public class TakeBall extends jpaEntity{


    /*
        get:idNameOfBall idRestrictions idUser time
        set:insert into the table
        use:put next line in jpa template
        TakeBall.insert(fName_variable,fName_variable);
     */
    public static void insert(TakeBallEntity takeBall){
        entityManager.persist(takeBall);
    }
    public static void insertt(int  idNameOfBall, int idRestrictions, int idUser , Date time){
        TakeBallEntity data = new TakeBallEntity();
        data.setIdNameOfBall(idNameOfBall);
        data.setIdRestrictions(idRestrictions);
        data.setIdUser(idUser);
        data.setTime(time);
        entityManager.persist(data);
    }
    /*
        set:TakeBallEntity to insert into the table
        use:put next line in jpa template in try after ->  transaction.begin();
        User.insert(fName_variable,fName_variable);
     */
    public static List<TakeBallEntity> select(){
        TypedQuery<TakeBallEntity> query = entityManager.createQuery(
                "SELECT e FROM TakeBallEntity e", TakeBallEntity.class);
        List<TakeBallEntity> resultList = query.getResultList();
        return resultList;
    }
    /*
        use: print this user table
        User.printTable();
     */
    public static void printTable(){
        System.out.println("work");
        List<TakeBallEntity> list = select();
        for (TakeBallEntity i:list) {
            System.out.println(i);
        }
    }
    /*
        get:user for update
        use:update row with id user in table
        User.updateUser(user);
     */
    public static void updateUser(TakeBallEntity takeBall){
        TakeBallEntity data = entityManager.find(TakeBallEntity.class, takeBall.getId());
        data.setIdNameOfBall(takeBall.getIdNameOfBall());
        data.setIdRestrictions(takeBall.getIdRestrictions());
        data.setIdUser(takeBall.getIdUser());
        data.setTime(takeBall.getTime());
        entityManager.merge(data);

    }
}
