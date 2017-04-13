package ba.rs.wabalabadubdub.service;

import ba.rs.wabalabadubdub.model.Predavac;
import ba.rs.wabalabadubdub.model.Ucenik;
import ba.rs.wabalabadubdub.repository.UcenikRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
public class UcenikService {

    @Autowired
    UcenikRepo ucenikRepo;

    public Ucenik findOne(Long id) {return ucenikRepo.findOne(id);}

    public List<Ucenik> findAll() {return ucenikRepo.findAll();}

    public Page<Ucenik> findAll(Pageable page) {return ucenikRepo.findAll(page);}

    public Ucenik save (Ucenik ucenik) {return ucenikRepo.save(ucenik);}

    public void delete (Long id) {ucenikRepo.delete(id);}
}
