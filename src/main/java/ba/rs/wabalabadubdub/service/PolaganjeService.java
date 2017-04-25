package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Polaganje;
import ba.rs.wabalabadubdub.repository.PolaganjeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class PolaganjeService {

    @Autowired
    PolaganjeRepo polaganjeRepo;

    public Polaganje findOne(Long id) {
        return polaganjeRepo.findOne(id);
    }

    public List<Polaganje> findAll() {
        return polaganjeRepo.findAll();
    }

    public Page<Polaganje> findAll(Pageable page) {
        return polaganjeRepo.findAll(page);
    }

    public Polaganje save(Polaganje polaganje) {
        return polaganjeRepo.save(polaganje);
    }

    public void delete(Long id) {
        polaganjeRepo.delete(id);
    }
}
