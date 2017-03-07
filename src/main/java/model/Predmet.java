package model;

import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Predmet {

    private String naziv;

    private String brojCasova;

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
