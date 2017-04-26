package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Uplata;
import ba.rs.wabalabadubdub.repository.UplataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class UplataService {

    @Autowired
    UplataRepo uplataRepo;

    public Uplata findOne(Long id) {
        return uplataRepo.findOne(id);
    }

    public List<Uplata> findAll() {
        return uplataRepo.findAll();
    }

    public Page<Uplata> findAll(Pageable page) {
        return uplataRepo.findAll(page);
    }

    public Uplata save(Uplata uplata) {
        return uplataRepo.save(uplata);
    }

    public void delete(Long id) {
        uplataRepo.delete(id);
    }
}
