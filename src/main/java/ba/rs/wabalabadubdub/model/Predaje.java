package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by alligator on 28.3.17..
 */
@Entity(name = "Predaje")
public class Predaje implements Serializable{

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "predavac_id")
    private Predavac predavac;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "kurs_id")
    private Kurs kurs;

    @ManyToOne
    @JoinColumn(name = "tipAngazmana_id")
    private TipAngazmana tipAngazmana;


    public Predaje() {}

    public Predaje(Predavac predavac, Kurs kurs, TipAngazmana tipAngazmana) {
        this.predavac = predavac;
        this.kurs = kurs;
        this.tipAngazmana = tipAngazmana;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public TipAngazmana getTipAngazmana() {
        return tipAngazmana;
    }

    public void setTipAngazmana(TipAngazmana tipAngazmana) {
        this.tipAngazmana = tipAngazmana;
    }
}
