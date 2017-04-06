package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by alligator on 21.3.17..
 */
@Entity(name="Pohadjanje")
public class Pohadjanje {


    @OneToMany
    @JoinColumn(name = "polaganje_id")
    private List<Polaganje> polaganja;
}
