package control;
import Entity.RestrictionsEntity;

public class Restrictions {
    /*
    get: id and name of restrictions
    set: RestrictionsEntity for insert to RestrictionsTable
    how to ues:
    entityManager.persist(Restrictions.insert(id, nameOfRestrictions)
     */

    public static RestrictionsEntity insertNameTable(int id, String name){
        RestrictionsEntity dataEntity=new RestrictionsEntity();
        dataEntity.setId(id);
        dataEntity.setNameOfRestrictions(name);
        return dataEntity;
    }
}

///*
///*
//        get: last name and first name
//        set: NameEntity for insert to EmployeeTable
//        use him them
//        entityManager.persist(tmp.insertNameTable(fName,lName));
//     */
//public static NameEntity insertNameTable(String FName , String LName){
//    NameEntity dataEntity=new NameEntity();
//    dataEntity.setfName(FName);
//    dataEntity.setlName(LName);
//    return dataEntity;
//}
// */
