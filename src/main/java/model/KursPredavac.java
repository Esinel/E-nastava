package model;

import javax.persistence.*;

/**
 * Created by alligator on 28.3.17..
 */
@Entity(name = "KursPredavac")
public class KursPredavac {

    @ManyToOne
    @JoinColumn(name = "predavac_id")
    private Predavac predavac;

    @ManyToOne
    @JoinColumn(name = "kurs_id")
    private Kurs kurs;

    @OneToOne
    @JoinColumn(name = "tipAngazmana_id")
    private TipAngazmana tipAngazmana;
}
