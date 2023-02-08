package control;
import Entity.PrescriptionsEntity;

import java.sql.Date;

public class Prescriptions {
    /*
    get: id, idNameOfBall, idUser, endPrescriptions and startPrescriptions
    set: PrescriptionsEntity for insert to PrescriptionsTable
    how to ues:
    entityManager.persist(Prescriptions.insert(id, idNameOfBall, idUser, endPrescriptions, startPrescriptions)
     */

    public static PrescriptionsEntity insertNameTable(int id, int idNameOfBall, int idUser, Date endPrescriptions, Date startPrescriptions){
        PrescriptionsEntity dataEntity=new PrescriptionsEntity();
        dataEntity.setId(id);
        dataEntity.setIdNameOfBall(idNameOfBall);
        dataEntity.setIdUser(idUser);
        dataEntity.setEndPrescriptions(endPrescriptions);
        dataEntity.setStartPrescriptions(startPrescriptions);
        return dataEntity;
    }
}
