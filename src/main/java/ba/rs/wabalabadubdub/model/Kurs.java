package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name = "Kurs")
public class Kurs {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    protected Long ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="predmet_id")
    private Predmet predmet;

    @Column(name = "ucionica")
    private String ucionica;

    @Column(name = "opisKursa")
    private String opisKursa;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "kurs_ucenik",
                joinColumns = @JoinColumn(name = "kurs_id"),
                inverseJoinColumns = @JoinColumn(name = "ucenik_id"))
    private List<Ucenik> ucenici;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "kurs_predavaci",
                joinColumns = @JoinColumn(name = "kurs_id"),
                inverseJoinColumns = @JoinColumn(name = "predavac_id"))
    private List<Predavac> predavaci;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "kurs_literatura",
                joinColumns = @JoinColumn(name = "kurs_id"),
                inverseJoinColumns = @JoinColumn(name = "dokument_id"))
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
