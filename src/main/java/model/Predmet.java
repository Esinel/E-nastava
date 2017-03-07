package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name="Predmet")
public class Predmet {

    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    private int ID;

    @Column(name="naziv")
    private String naziv;

    @Column(name="brojCasova")
    private String brojCasova;

    @Column(name="sadrzajPredmeta")
    private String sadrzajPredmeta;

    public Predmet() {
    }

    public Predmet(String naziv, String brojCasova, String sadrzajPredmeta) {
        this.naziv = naziv;
        this.brojCasova = brojCasova;
        this.sadrzajPredmeta = sadrzajPredmeta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(String brojCasova) {
        this.brojCasova = brojCasova;
    }

    public String getSadrzajPredmeta() {
        return sadrzajPredmeta;
    }

    public void setSadrzajPredmeta(String sadrzajPredmeta) {
        this.sadrzajPredmeta = sadrzajPredmeta;
    }
}
