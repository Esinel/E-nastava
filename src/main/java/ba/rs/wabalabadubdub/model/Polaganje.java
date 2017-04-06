package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by stefan on 3/6/17.
 */
@Entity
@Table(name = "Polaganje")
public class Polaganje {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int ID;

    @OneToOne
    @JoinColumn(name = "tipPolaganja_id")
    private TipPolaganja tipPolaganja;

    @Column(name = "datumPolaganja")
    private Date datumPolaganja;

    @Column(name = "ocena")
    private int ocena;

    @Column(name = "bodovi")
    private int bodovi;

    @Column(name = "komentar")
    private String komentar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pohadjanje_id")
    private Pohadjanje pohadjanje;


    public Polaganje() {}

    public Polaganje(Date datumPolaganja, int ocena,
                     String komentar, int bodovi) {
        this.datumPolaganja = datumPolaganja;
        this.ocena = ocena;
        this.komentar = komentar;
        this.bodovi = bodovi;
    }


    public Date getDatumPolaganja() {
        return datumPolaganja;
    }

    public void setDatumPolaganja(Date datumPolaganja) {
        this.datumPolaganja = datumPolaganja;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public int getBodovi() {
        return bodovi;
    }

    public void setBodovi(int bodovi) {
        this.bodovi = bodovi;
    }
}
