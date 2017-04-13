package ba.rs.wabalabadubdub.web.DTO;

import ba.rs.wabalabadubdub.model.Ucenik;

/**
 * Created by alligator on 13.4.17..
 */
public class UcenikDTO {

    public Long ID;

    public String biografija;

    public String adresa;

    public String ime;

    public String prezime;

    public String email;

    public String password;

    public UcenikDTO(Ucenik ucenik) {
        this(ucenik.getID(), ucenik.getBiografija(), ucenik.getAdresa(), ucenik.getIme(), ucenik.getPrezime(), ucenik.getEmail(), ucenik.getPassword());
    }

    public UcenikDTO(Long ID, String biografija, String adresa, String ime, String prezime, String email, String password) {
        this.ID = ID;
        this.biografija = biografija;
        this.adresa = adresa;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.password = password;
    }
}
