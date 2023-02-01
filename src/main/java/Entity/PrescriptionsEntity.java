package Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Prescriptions", schema = "public", catalog = "Medicines")
public class PrescriptionsEntity {
    private int id;
    private int idNameOfBall;
    private int idUser;
    private Date endPrescriptions;
    private Date startPrescriptions;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_name_of_ball", nullable = false)
    public int getIdNameOfBall() {
        return idNameOfBall;
    }

    public void setIdNameOfBall(int idNameOfBall) {
        this.idNameOfBall = idNameOfBall;
    }

    @Basic
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "end_prescriptions", nullable = false)
    public Date getEndPrescriptions() {
        return endPrescriptions;
    }

    public void setEndPrescriptions(Date endPrescriptions) {
        this.endPrescriptions = endPrescriptions;
    }

    @Basic
    @Column(name = "start_prescriptions", nullable = false)
    public Date getStartPrescriptions() {
        return startPrescriptions;
    }

    public void setStartPrescriptions(Date startPrescriptions) {
        this.startPrescriptions = startPrescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescriptionsEntity that = (PrescriptionsEntity) o;

        if (id != that.id) return false;
        if (idNameOfBall != that.idNameOfBall) return false;
        if (idUser != that.idUser) return false;
        if (endPrescriptions != null ? !endPrescriptions.equals(that.endPrescriptions) : that.endPrescriptions != null)
            return false;
        if (startPrescriptions != null ? !startPrescriptions.equals(that.startPrescriptions) : that.startPrescriptions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idNameOfBall;
        result = 31 * result + idUser;
        result = 31 * result + (endPrescriptions != null ? endPrescriptions.hashCode() : 0);
        result = 31 * result + (startPrescriptions != null ? startPrescriptions.hashCode() : 0);
        return result;
    }
}
