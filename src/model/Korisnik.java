package model;

/**
 * Created by alligator on 6.3.17..
 */
public class Korisnik {

    protected int ID;

    protected String ime;

    protected String prezime;

    protected String email;

    protected String password;

    protected  Uloga uloga;

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


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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
}
