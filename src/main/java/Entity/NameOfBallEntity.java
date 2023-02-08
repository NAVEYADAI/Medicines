package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "name_of_ball", schema = "public", catalog = "Medicines")
public class NameOfBallEntity {
    private int id;
    private String nameBall;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nameball", nullable = false, length = -1)
    public String getNameBall() {
        return nameBall;
    }

    public void setNameBall(String nameBall) {
        this.nameBall = nameBall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameOfBallEntity that = (NameOfBallEntity) o;

        if (id != that.id) return false;
        if (nameBall != null ? !nameBall.equals(that.nameBall) : that.nameBall != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameBall != null ? nameBall.hashCode() : 0);
        return result;
    }
}
