package model;

import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Ucenik extends Korisnik {

    private List<Kurs> kursevi;
    private List<Dokument> dokumenti;
    private String biografija;
    private String adresa;

    public Ucenik() {}

    public Ucenik(String ime, String prezime, String email, String password,
                  Uloga uloga, List<Dokument> dokumenti,
                  String adresa, String biografija,
                  List<Kurs> kursevi) {
        super(ime, prezime, email, password, uloga);
        this.dokumenti = dokumenti;
        this.biografija = biografija;
        this.adresa = adresa;
        this.kursevi = kursevi;
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
}
