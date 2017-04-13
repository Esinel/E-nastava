package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Dokument;
import ba.rs.wabalabadubdub.model.Kurs;
import ba.rs.wabalabadubdub.repository.DokumentRepo;
import ba.rs.wabalabadubdub.repository.KursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
@Service
public class KursService {

    @Autowired
    KursRepo kursRepo;

    public Kurs findOne(Long id) {return kursRepo.findOne(id);}

    public List<Kurs> findAll() {return kursRepo.findAll();}

    public Page<Kurs> findAll(Pageable page) {return kursRepo.findAll(page);}

    public Kurs save (Kurs kurs) {return kursRepo.save(kurs);}

    public void delete (Long id) {kursRepo.delete(id);}
}
