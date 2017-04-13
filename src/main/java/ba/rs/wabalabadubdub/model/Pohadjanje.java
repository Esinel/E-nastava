package ba.rs.wabalabadubdub.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alligator on 21.3.17..
 */
@Entity(name="Pohadjanje")
public class Pohadjanje {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private Long ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kurs_id")
    private Kurs kurs;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ucenik_id")
    private Ucenik ucenik;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "predavac_id")
    private Predavac predavac;

    @OneToMany
    @JoinColumn(name = "polaganje_id")
    private List<Polaganje> polaganja;
}
