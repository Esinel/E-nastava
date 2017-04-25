package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.TipPolaganja;
import ba.rs.wabalabadubdub.repository.TipPolaganjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class TipPolaganjaService {

    @Autowired
    TipPolaganjaRepo tipPolaganjaRepo;

    public TipPolaganja findOne(Long id) {
        return tipPolaganjaRepo.findOne(id);
    }

    public List<TipPolaganja> findAll() {
        return tipPolaganjaRepo.findAll();
    }

    public Page<TipPolaganja> findAll(Pageable page) {
        return tipPolaganjaRepo.findAll(page);
    }

    public TipPolaganja save(TipPolaganja tipPolaganja) {
        return tipPolaganjaRepo.save(tipPolaganja);
    }

    public void delete(Long id) {
        tipPolaganjaRepo.delete(id);
    }
}
