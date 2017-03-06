package model;

import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
public class Kurs {

    private Predmet predmet;

    private List<Ucenik> ucenici;

    private List<Predavac> predavaci;

    private String ucionica;

    private String opisKursa;

    private List<Dokument> literatura;

    public Kurs() {
    }

    public Kurs(Predmet predmet, List<Ucenik> ucenici, List<Predavac> predavaci, String ucionica, String opisKursa, List<Dokument> literatura) {
        this.predmet = predmet;
        this.ucenici = ucenici;
        this.predavaci = predavaci;
        this.ucionica = ucionica;
        this.opisKursa = opisKursa;
        this.literatura = literatura;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public List<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(List<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public List<Predavac> getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(List<Predavac> predavaci) {
        this.predavaci = predavaci;
    }

    public String getUcionica() {
        return ucionica;
    }

    public void setUcionica(String ucionica) {
        this.ucionica = ucionica;
    }

    public String getOpisKursa() {
        return opisKursa;
    }

    public void setOpisKursa(String opisKursa) {
        this.opisKursa = opisKursa;
    }

    public List<Dokument> getLiteratura() {
        return literatura;
    }

    public void setLiteratura(List<Dokument> literatura) {
        this.literatura = literatura;
    }
}
