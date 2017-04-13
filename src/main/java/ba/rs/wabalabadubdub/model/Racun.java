package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by stefan on 3/6/17.
 */
@Entity
@Table(name = "Racun")
public class Racun {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private Long ID;

    @Column(name = "brojRacuna")
    private String brojRacuna;

    @Column(name = "stanjeRacuna")
    private double stanjeRacuna;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "transakcija_id")
    private List<Uplata> transakcije;

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
