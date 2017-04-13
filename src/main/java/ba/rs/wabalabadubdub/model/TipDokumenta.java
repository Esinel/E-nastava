package ba.rs.wabalabadubdub.model;

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
    private Long ID;

    @Column(name = "naziv")
    private String naziv;


    public TipDokumenta(){}

    public TipDokumenta(String naziv) {
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
