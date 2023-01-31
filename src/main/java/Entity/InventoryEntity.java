package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Inventory", schema = "public", catalog = "Medicines")
public class InventoryEntity {
    private int id;
    private int countOfBall;
    private int idNameOfBall;
    private int idUser;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "count_of_ball", nullable = false)
    public int getCountOfBall() {
        return countOfBall;
    }

    public void setCountOfBall(int countOfBall) {
        this.countOfBall = countOfBall;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDNameOfBall", nullable = false)
    public int getIdNameOfBall() {
        return idNameOfBall;
    }

    public void setIdNameOfBall(int idNameOfBall) {
        this.idNameOfBall = idNameOfBall;
    }

    @Basic
    @Column(name = "IDUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InventoryEntity that = (InventoryEntity) o;

        if (id != that.id) return false;
        if (countOfBall != that.countOfBall) return false;
        if (idNameOfBall != that.idNameOfBall) return false;
        if (idUser != that.idUser) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + countOfBall;
        result = 31 * result + idNameOfBall;
        result = 31 * result + idUser;
        return result;
    }
}
