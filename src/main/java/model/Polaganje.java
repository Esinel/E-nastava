package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by stefan on 3/6/17.
 */
@Entity
@Table(name = "Polaganje")
public class Polaganje {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int ID;

    @OneToOne
    @JoinColumn(name = "tipPolaganja_id")
    private TipPolaganja tipPolaganja;

    @Column(name = "datumPolaganja")
    private Date datumPolaganja;

    @Column(name = "ocena")
    private int ocena;

    @Column(name = "bodovi")
    private int bodovi;

    @Column(name = "komentar")
    private String komentar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kurs_id")
    private Kurs kurs;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ucenik_id")
    private Ucenik ucenik;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "predavac_id")
    private Predavac predavac;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pohadjanje_id")
    private Pohadjanje pohadjanje;


    public Polaganje() {}

    public Polaganje(Kurs kurs, Ucenik ucenik, Predavac predavac,
                     Date datumPolaganja, int ocena,
                     String komentar, int bodovi) {
        this.kurs = kurs;
        this.ucenik = ucenik;
        this.predavac = predavac;
        this.datumPolaganja = datumPolaganja;
        this.ocena = ocena;
        this.komentar = komentar;
        this.bodovi = bodovi;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public Ucenik getUcenik() {
        return ucenik;
    }

    public void setUcenik(Ucenik ucenik) {
        this.ucenik = ucenik;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPolaganja() {
        return datumPolaganja;
    }

    public void setDatumPolaganja(Date datumPolaganja) {
        this.datumPolaganja = datumPolaganja;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public int getBodovi() {
        return bodovi;
    }

    public void setBodovi(int bodovi) {
        this.bodovi = bodovi;
    }
}
