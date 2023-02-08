package control;
import Entity.InventoryEntity;


public class Inventory {
    /*
    get: id, countOfBall, idNameOfBall and idUser
    set: InventoryEntity for insert to InventoryTable
    how to ues:
    entityManager.persist(Inventory.insert(id, countOfBall, idNameOfBall, idUser)
     */

    public static InventoryEntity insertNameTable(int id, int countOfBall, int idNameOfBall, int idUser){
        InventoryEntity dataEntity=new InventoryEntity();
        dataEntity.setId(id);
        dataEntity.setCountOfBall(countOfBall);
        dataEntity.setIdNameOfBall(idNameOfBall);
        dataEntity.setIdUser(idUser);
        return dataEntity;
    }
}
