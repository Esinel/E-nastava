package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 6.3.17..
 */
@Entity
@Table(name = "Korisnik")
public abstract class Korisnik {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    protected Long ID;

    @Column(name = "ime")
    protected String ime;

    @Column(name = "prezime")
    protected String prezime;

    @Column(name = "email")
    protected String email;

    @Column(name = "password")
    protected String password;

    @Column(name = "uloga")
    protected  Uloga uloga;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "vlasnici")
    protected List<Dokument> dokumenti;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String email, String password, Uloga uloga) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.password = password;
        this.uloga = uloga;
    }

    protected enum Uloga {
        ADMIN, UCENIK, PROFESOR, ASISTENT, DEMONSTATOR
    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga = uloga;
    }

    public List<Dokument> getDokumenti() {
        return dokumenti;
    }

    public void setDokumenti(List<Dokument> dokumenti) {
        this.dokumenti = dokumenti;
    }
}
