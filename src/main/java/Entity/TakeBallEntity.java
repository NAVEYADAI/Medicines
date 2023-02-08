package Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "take_ball", schema = "public", catalog = "Medicines")
public class TakeBallEntity {
    private int id;
    private int idNameOfBall;
    private int idRestrictions;
    private int idUser;
    private Date time;

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
    @Column(name = "id_restrictions", nullable = false)
    public int getIdRestrictions() {
        return idRestrictions;
    }

    public void setIdRestrictions(int idRestrictions) {
        this.idRestrictions = idRestrictions;
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
    @Column(name = "time", nullable = false)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TakeBallEntity that = (TakeBallEntity) o;

        if (id != that.id) return false;
        if (idNameOfBall != that.idNameOfBall) return false;
        if (idRestrictions != that.idRestrictions) return false;
        if (idUser != that.idUser) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idNameOfBall;
        result = 31 * result + idRestrictions;
        result = 31 * result + idUser;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
