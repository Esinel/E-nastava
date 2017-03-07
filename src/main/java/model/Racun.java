package model;

import java.util.List;

/**
 * Created by stefan on 3/6/17.
 */
public class Racun {

    private String brojRacuna;
    private List<Uplata> transakcije;
    private double stanjeRacuna;

    public Racun() {}

    public Racun(String brojRacuna, List<Uplata> transakcije, double stanjeRacuna) {
        this.brojRacuna = brojRacuna;
        this.transakcije = transakcije;
        this.stanjeRacuna = stanjeRacuna;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public List<Uplata> getTransakcije() {
        return transakcije;
    }

    public void setTransakcije(List<Uplata> transakcije) {
        this.transakcije = transakcije;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }
}
