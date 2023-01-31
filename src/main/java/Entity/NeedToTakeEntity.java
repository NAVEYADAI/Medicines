package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "NeedToTake", schema = "public", catalog = "Medicines")
public class NeedToTakeEntity {
    private int id;
    private int count;
    private int idNameOfBall;
    private int idUser;
    private int idRestrictions;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "count", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
    @Column(name = "id_restrictions", nullable = false)
    public int getIdRestrictions() {
        return idRestrictions;
    }

    public void setIdRestrictions(int idRestrictions) {
        this.idRestrictions = idRestrictions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeedToTakeEntity that = (NeedToTakeEntity) o;

        if (id != that.id) return false;
        if (count != that.count) return false;
        if (idNameOfBall != that.idNameOfBall) return false;
        if (idUser != that.idUser) return false;
        if (idRestrictions != that.idRestrictions) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + count;
        result = 31 * result + idNameOfBall;
        result = 31 * result + idUser;
        result = 31 * result + idRestrictions;
        return result;
    }
}
