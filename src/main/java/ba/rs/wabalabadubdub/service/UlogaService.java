package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Uloga;
import ba.rs.wabalabadubdub.repository.UlogaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class UlogaService {

    @Autowired
    UlogaRepo ulogaRepo;

    public Uloga findOne(Long id) {
        return ulogaRepo.findOne(id);
    }

    public List<Uloga> findAll() {
        return ulogaRepo.findAll();
    }

    public Page<Uloga> findAll(Pageable page) {
        return ulogaRepo.findAll(page);
    }

    public Uloga save(Uloga uloga) {
        return ulogaRepo.save(uloga);
    }

    public void delete(Long id) {
        ulogaRepo.delete(id);
    }
}
