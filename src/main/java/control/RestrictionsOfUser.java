package control;
import Entity.RestrictionsOfUserEntity;

public class RestrictionsOfUser {
    /*
    get: id, idRestrictions of restrictions and idUser of users
    set: RestrictionsOfUserEntity for insert to RestrictionsOfUserTable
    how to ues:
    entityManager.persist(RestrictionsOfUser.insert(id, idRestrictions, idUser)
     */

    public static RestrictionsOfUserEntity insertNameTable(int id, int idRestrictions, int idUser){
        RestrictionsOfUserEntity dataEntity=new RestrictionsOfUserEntity();
        dataEntity.setId(id);
        dataEntity.setIdRestrictions(idRestrictions);
        dataEntity.setIdUser(idUser);
        return dataEntity;
    }
}
