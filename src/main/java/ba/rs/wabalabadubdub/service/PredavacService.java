package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Kurs;
import ba.rs.wabalabadubdub.model.Predavac;
import ba.rs.wabalabadubdub.repository.KursRepo;
import ba.rs.wabalabadubdub.repository.PredavacRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
@Service
public class PredavacService {

    @Autowired
    PredavacRepo predavacRepo;

    public Predavac findOne(Long id) {return predavacRepo.findOne(id);}

    public List<Predavac> findAll() {return predavacRepo.findAll();}

    public Page<Predavac> findAll(Pageable page) {return predavacRepo.findAll(page);}

    public Predavac save (Predavac predavac) {return predavacRepo.save(predavac);}

    public void delete (Long id) {predavacRepo.delete(id);}
}
