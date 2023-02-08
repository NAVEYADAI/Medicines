package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restrictions", schema = "public", catalog = "Medicines")
public class RestrictionsEntity {
    private int id;
    private String nameOfRestrictions;

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
    @Column(name = "name_of_restrictions", nullable = false, length = -1)
    public String getNameOfRestrictions() {
        return nameOfRestrictions;
    }

    public void setNameOfRestrictions(String nameOfRestrictions) {
        this.nameOfRestrictions = nameOfRestrictions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestrictionsEntity that = (RestrictionsEntity) o;

        if (id != that.id) return false;
        if (nameOfRestrictions != null ? !nameOfRestrictions.equals(that.nameOfRestrictions) : that.nameOfRestrictions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameOfRestrictions != null ? nameOfRestrictions.hashCode() : 0);
        return result;
    }
}
