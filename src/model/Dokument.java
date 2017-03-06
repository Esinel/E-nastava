package model;

/**
 * Created by alligator on 6.3.17..
 */
public class Dokument {

    private String filepath;

    private String opis;

    private Korisnik vlasnik;


    public Dokument() {
    }

    public Dokument(String opis, String filepath, Korisnik vlasnik) {
        this.opis = opis;
        this.filepath = filepath;
        this.vlasnik = vlasnik;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Korisnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Korisnik vlasnik) {
        this.vlasnik = vlasnik;
    }
}
