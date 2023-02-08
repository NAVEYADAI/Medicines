package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restrictions_of_user", schema = "public", catalog = "Medicines")
public class RestrictionsOfUserEntity {
    private int id;
    private int idRestrictions;
    private int idUser;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestrictionsOfUserEntity that = (RestrictionsOfUserEntity) o;

        if (id != that.id) return false;
        if (idRestrictions != that.idRestrictions) return false;
        if (idUser != that.idUser) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idRestrictions;
        result = 31 * result + idUser;
        return result;
    }
}
