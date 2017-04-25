package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.TipAngazmana;
import ba.rs.wabalabadubdub.repository.TipAngazmanaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class TipAngazmanaService {

    @Autowired
    TipAngazmanaRepo tipAngazmanaRepo;

    public TipAngazmana findOne(Long id) {
        return tipAngazmanaRepo.findOne(id);
    }

    public List<TipAngazmana> findAll() {
        return tipAngazmanaRepo.findAll();
    }

    public Page<TipAngazmana> findAll(Pageable page) {
        return tipAngazmanaRepo.findAll(page);
    }

    public TipAngazmana save(TipAngazmana tipAngazmana) {
        return tipAngazmanaRepo.save(tipAngazmana);
    }

    public void delete(Long id) {
        tipAngazmanaRepo.delete(id);
    }
}
