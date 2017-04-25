package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.TipDokumenta;
import ba.rs.wabalabadubdub.repository.TipDokumentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stefan on 4/25/17.
 */
@Service
public class TipDokumentaService {

    @Autowired
    TipDokumentaRepo tipDokumentaRepo;

    public TipDokumenta findOne(Long id) {
        return tipDokumentaRepo.findOne(id);
    }

    public List<TipDokumenta> findAll() {
        return tipDokumentaRepo.findAll();
    }

    public Page<TipDokumenta> findAll(Pageable page) {
        return tipDokumentaRepo.findAll(page);
    }

    public TipDokumenta save(TipDokumenta tipDokumenta) {
        return tipDokumentaRepo.save(tipDokumenta);
    }

    public void delete(Long id) {
        tipDokumentaRepo.delete(id);
    }
}
