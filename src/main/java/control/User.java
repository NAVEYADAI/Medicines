package control;

import Entity.UserEntity;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class User extends jpaEntity {
    /*
        get:l_name and f_name
        set:UserEntity to insert into the table
        use:put next line in jpa template
        User.insert(fName_variable,fName_variable);
     */
    public static void insert(String fname , String lname){
        UserEntity data = new UserEntity();
        data.setfName(fname);
        data.setlName(lname);
        entityManager.persist(data);
    }
    /*
        set:UserEntity to insert into the table
        use:put next line in jpa template in try after ->  transaction.begin();
        User.insert(fName_variable,fName_variable);
     */
    public static List<UserEntity> select(){
        TypedQuery<UserEntity> query = entityManager.createQuery(
                "SELECT e FROM UserEntity e", UserEntity.class);
        List<UserEntity> resultList = query.getResultList();
        return resultList;
    }
    /*
        use: print this user table
        User.printTable();
     */
    public static void printTable(){
        List<UserEntity> list = select();
        for (UserEntity i:list) {
            System.out.println(i);
        }
    }
    /*
        get:user for update
        use:update row with id user in table
        User.updateUser(user);
     */
    public static void updateUser(UserEntity user){
        UserEntity person = entityManager.find(UserEntity.class, user.getId());
        person.setlName(user.getlName());
        person.setfName(user.getfName());
        entityManager.merge(person);

    }

}
