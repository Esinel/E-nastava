package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name = "Predavac")
public class Predavac extends Korisnik {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    protected Long ID;

    @Column(name = "biografija")
    private String biografija;

    @Column(name = "kabinet")
    private String kabinet;

    @ManyToMany(mappedBy = "predavaci")
    private List<Kurs> kursevi;

    public Predavac() {
    }

    public Predavac(String ime, String prezime, String email, String password, Uloga uloga, List<Dokument> dokumenti, String biografija, String kabinet) {
        super(ime, prezime, email, password, uloga);
        this.dokumenti = dokumenti;
        this.biografija = biografija;
        this.kabinet = kabinet;
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

    public String getKabinet() {
        return kabinet;
    }

    public void setKabinet(String kabinet) {
        this.kabinet = kabinet;
    }

    public List<Kurs> getKursevi() {
        return kursevi;
    }

    public void setKursevi(List<Kurs> kursevi) {
        this.kursevi = kursevi;
    }
}
