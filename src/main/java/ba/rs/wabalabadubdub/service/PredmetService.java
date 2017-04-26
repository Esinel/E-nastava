package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Predmet;
import ba.rs.wabalabadubdub.repository.PredmetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class PredmetService {

    @Autowired
    PredmetRepo predmetRepo;

    public Predmet findOne(Long id) {
        return predmetRepo.findOne(id);
    }

    public List<Predmet> findAll() {
        return predmetRepo.findAll();
    }

    public Page<Predmet> findAll(Pageable page) {
        return predmetRepo.findAll(page);
    }

    public Predmet save(Predmet predmet) {
        return predmetRepo.save(predmet);
    }

    public void delete(Long id) {
        predmetRepo.delete(id);
    }
}
