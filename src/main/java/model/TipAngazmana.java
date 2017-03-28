package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by stefan on 3/28/17.
 */
public class TipAngazmana {

    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    private int ID;

    @Column(name="naziv")
    private String naziv;

    public TipAngazmana() {}

    public TipAngazmana(int id, String naziv) {
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