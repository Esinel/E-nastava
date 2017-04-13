package ba.rs.wabalabadubdub.model;

import javax.persistence.*;

/**
 * Created by stefan on 3/28/17.
 */
@Entity
@Table(name = "Uloga")
public class Uloga {

    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    private Long ID;

    @Column(name="naziv")
    private String naziv;

    public Uloga() {}

    public Uloga(Long id, String naziv) {
        super();
        this.ID = id;
        this.naziv = naziv;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
