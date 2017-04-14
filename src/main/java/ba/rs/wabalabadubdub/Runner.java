package ba.rs.wabalabadubdub;

import ba.rs.wabalabadubdub.model.Ucenik;
import ba.rs.wabalabadubdub.repository.UcenikRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by alligator on 14.4.17..
 */
@Component
public class Runner implements CommandLineRunner {

    @Autowired
    UcenikRepo ucenikRepo;

    public void run(String... args) {
        Ucenik ucenik = new Ucenik();
        ucenik.setIme("Stefanos");
        ucenik.setPrezime("Lalic");
        ucenik.setAdresa("Moja");
        ucenikRepo.save(ucenik);
    }
}
