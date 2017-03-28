package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alligator on 28.3.17..
 */
@Entity(name = "TipDokumenta")
public class TipDokumenta {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int ID;

    @Column(name = "naziv")
    private String naziv;


    public TipDokumenta(){}

    public TipDokumenta(String naziv) {
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
