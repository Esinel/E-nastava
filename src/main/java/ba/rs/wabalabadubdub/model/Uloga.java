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
    private int ID;

    @Column(name="naziv")
    private String naziv;

    public Uloga() {}

    public Uloga(int id, String naziv) {
        super();
        this.ID = id;
        this.naziv = naziv;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
