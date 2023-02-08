package control;
import Entity.NeedToTakeEntity;

public class NeedToTake {
    /*
    get: id, count, idNameOfBall, idUser and idRestrictions
    set: NeedToTakeEntity for insert to NeedToTakeTable
    how to ues:
    entityManager.persist(NeedToTake.insert(id, count, idNameOfBall, idUser, idRestrictions)
     */

    public static NeedToTakeEntity insertNameTable(int id, int count, int idNameOfBall, int idUser, int idRestrictions){
        NeedToTakeEntity dataEntity=new NeedToTakeEntity();
        dataEntity.setId(id);
        dataEntity.setCount(count);
        dataEntity.setIdNameOfBall(idNameOfBall);
        dataEntity.setIdUser(idUser);
        dataEntity.setIdRestrictions(idRestrictions);
        return dataEntity;
    }
}
