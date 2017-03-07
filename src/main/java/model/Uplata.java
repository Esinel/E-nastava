package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name="Uplata")
public class Uplata {

    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    private int ID;

    @Column(name="datunPlacanja")
    private Date datumPlacanja;

    @Column(name="uplatilac")
    private String uplatilac;

    @Column(name="primalac")
    private String primalac;

    @Column(name="racunPrimaoca")
    private Racun racunPrimaoca;

    @Column(name="racunUplatioca")
    private Racun racunUplatioca;

    @Column(name="svrhaUplate")
    private String svrhaUplate;

    @Column(name="iznos")
    private double iznos;

    public Uplata() {}

    public Uplata(Date datumPlacanja, String uplatilac,
                  String primalac, Racun racunPrimaoca,
                  Racun racunUplatioca, String svrhaUplate,
                  double iznos) {
        this.datumPlacanja = datumPlacanja;
        this.uplatilac = uplatilac;
        this.primalac = primalac;
        this.racunPrimaoca = racunPrimaoca;
        this.racunUplatioca = racunUplatioca;
        this.svrhaUplate = svrhaUplate;
        this.iznos = iznos;
    }

    public Date getDatumPlacanja() {
        return datumPlacanja;
    }

    public void setDatumPlacanja(Date datumPlacanja) {
        this.datumPlacanja = datumPlacanja;
    }

    public String getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(String uplatilac) {
        this.uplatilac = uplatilac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }
}
