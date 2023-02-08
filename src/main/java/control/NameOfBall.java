package control;
import Entity.NameOfBallEntity;

public class NameOfBall {
    /*
    get: id and nameBall
    set: NameOfBallEntity for insert to NameOfBallTable
    how to ues:
    entityManager.persist(NameOfBall.insert(id, nameBall)
     */

    public static NameOfBallEntity insertNameTable(int id, String nameBall){
        NameOfBallEntity dataEntity=new NameOfBallEntity();
        dataEntity.setId(id);
        dataEntity.setNameBall(nameBall);
        return dataEntity;
    }
}
