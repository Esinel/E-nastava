package model;

import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Predavac extends Korisnik {

    private List<Predmet> predmeti;

    private List<Dokument> dokumenti;

    private String biografija;

    private String kabinet;

    public Predavac() {
    }

    public Predavac(String ime, String prezime, String email, String password, Uloga uloga, List<Predmet> predmeti, List<Dokument> dokumenti, String biografija, String kabinet) {
        super(ime, prezime, email, password, uloga);
        this.predmeti = predmeti;
        this.dokumenti = dokumenti;
        this.biografija = biografija;
        this.kabinet = kabinet;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public List<Dokument> getDokumenti() {
        return dokumenti;
    }

    public void setDokumenti(List<Dokument> dokumenti) {
        this.dokumenti = dokumenti;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getKabinet() {
        return kabinet;
    }

    public void setKabinet(String kabinet) {
        this.kabinet = kabinet;
    }
}
