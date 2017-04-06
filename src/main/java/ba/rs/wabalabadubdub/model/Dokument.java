package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name = "Dokument")
public class Dokument {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int ID;

    @OneToOne
    @JoinColumn(name = "tipDokumenta_id")
    private TipDokumenta tipDokumenta;

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "opis")
    private String opis;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "dokument_vlasnik",
            joinColumns = @JoinColumn(name = "dokument_id"),
            inverseJoinColumns = @JoinColumn(name = "vlasnik_id"))
    private List<Korisnik> vlasnici;




    public Dokument() {
    }

    public Dokument(String opis, String filepath, List<Korisnik> vlasnici) {
        this.opis = opis;
        this.filepath = filepath;
        this.vlasnici = vlasnici;
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

    public List<Korisnik> getVlasnici() {
        return vlasnici;
    }

    public void setVlasnici(List<Korisnik> vlasnik) {
        this.vlasnici = vlasnici;
    }
}
