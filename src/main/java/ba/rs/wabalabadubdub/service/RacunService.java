package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Racun;
import ba.rs.wabalabadubdub.repository.RacunRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class RacunService {

    @Autowired
    RacunRepo racunRepo;

    public Racun findOne(Long id) {
        return racunRepo.findOne(id);
    }

    public List<Racun> findAll() {
        return racunRepo.findAll();
    }

    public Page<Racun> findAll(Pageable page) {
        return racunRepo.findAll(page);
    }

    public Racun save(Racun racun) {
        return racunRepo.save(racun);
    }

    public void delete(Long id) {
        racunRepo.delete(id);
    }
}
