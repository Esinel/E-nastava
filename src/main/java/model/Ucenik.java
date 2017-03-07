package model;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Ucenik extends Korisnik {

    private String biografija;
    private String adresa;
    private Racun racun;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "ucenici")
    private List<Kurs> kursevi;

    public Ucenik() {}

    public Ucenik(String ime, String prezime, String email, String password,
                  Uloga uloga, List<Dokument> dokumenti,
                  String adresa, String biografija,
                  List<Kurs> kursevi, Racun racun) {
        super(ime, prezime, email, password, uloga);
        this.dokumenti = dokumenti;
        this.biografija = biografija;
        this.adresa = adresa;
        this.kursevi = kursevi;
        this.racun = racun;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<Kurs> getKursevi() {
        return kursevi;
    }

    public void setKursevi(List<Kurs> kursevi) {
        this.kursevi = kursevi;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
}
