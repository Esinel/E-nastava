package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Kurs;
import ba.rs.wabalabadubdub.model.Pohadjanje;
import ba.rs.wabalabadubdub.repository.KursRepo;
import ba.rs.wabalabadubdub.repository.PohadjanjeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
@Service
public class PohadjanjeService {

    @Autowired
    PohadjanjeRepo pohadjanjeRepo;

    public Pohadjanje findOne(Long id) {return pohadjanjeRepo.findOne(id);}

    public List<Pohadjanje> findAll() {return pohadjanjeRepo.findAll();}

    public Page<Pohadjanje> findAll(Pageable page) {return pohadjanjeRepo.findAll(page);}

    public Pohadjanje save (Pohadjanje pohadjanje) {return pohadjanjeRepo.save(pohadjanje);}

    public void delete (Long id) {pohadjanjeRepo.delete(id);}
}
