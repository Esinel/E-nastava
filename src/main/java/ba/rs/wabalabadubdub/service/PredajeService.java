package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Predaje;
import ba.rs.wabalabadubdub.repository.PredajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class PredajeService {

    @Autowired
    PredajeRepo predajeRepo;

    public Predaje findOne(Long id) {
        return predajeRepo.findOne(id);
    }

    public List<Predaje> findAll() {
        return predajeRepo.findAll();
    }

    public Page<Predaje> findAll(Pageable page) {
        return predajeRepo.findAll(page);
    }

    public Predaje save(Predaje predaje) {
        return predajeRepo.save(predaje);
    }

    public void delete(Long id) {
        predajeRepo.delete(id);
    }
}
