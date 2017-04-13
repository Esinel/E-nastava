package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Dokument;
import ba.rs.wabalabadubdub.repository.DokumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
@Service
public class DokumentService {

    @Autowired
    DokumentRepo dokumentRepo;

    public Dokument findOne(Long id) {return dokumentRepo.findOne(id);}

    public List<Dokument> findAll() {return dokumentRepo.findAll();}

    public Page<Dokument> findAll(Pageable page) {return dokumentRepo.findAll(page);}

    public Dokument save (Dokument dokument) {return dokumentRepo.save(dokument);}

    public void delete (Long id) {dokumentRepo.delete(id);}
}
