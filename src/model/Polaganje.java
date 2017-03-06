package model;

import java.util.Date;

/**
 * Created by stefan on 3/6/17.
 */
public class Polaganje {

    private Kurs kurs;
    private Ucenik ucenik;
    private Predavac predavac;
    private Date datumPolaganja;
    private int ocena;
    private String opisnaOcena;
    private String komentar;
    private int bodovi;

    public Polaganje() {}

    public Polaganje(Kurs kurs, Ucenik ucenik, Predavac predavac,
                     Date datumPolaganja, int ocena, String opisnaOcena,
                     String komentar, int bodovi) {
        this.kurs = kurs;
        this.ucenik = ucenik;
        this.predavac = predavac;
        this.datumPolaganja = datumPolaganja;
        this.ocena = ocena;
        this.opisnaOcena = opisnaOcena;
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

    public String getOpisnaOcena() {
        return opisnaOcena;
    }

    public void setOpisnaOcena(String opisnaOcena) {
        this.opisnaOcena = opisnaOcena;
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
