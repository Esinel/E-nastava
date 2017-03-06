package model;

import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Ucenik extends Korisnik {

    private List<Predmet> predmeti;
    private List<Dokument> dokumenti;
    private String biografija;

    public Ucenik() {}

    public Ucenik(String ime, String prezime, String email, String password,
                  Uloga uloga, List<Predmet> predmeti,
                  List<Dokument> dokumenti, String biografija) {
        super(ime, prezime, email, password, uloga);
        this.predmeti = predmeti;
        this.dokumenti = dokumenti;
        this.biografija = biografija;
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
}
