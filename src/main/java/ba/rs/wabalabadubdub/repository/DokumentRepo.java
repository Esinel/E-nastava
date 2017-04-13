package ba.rs.wabalabadubdub.repository;

import ba.rs.wabalabadubdub.model.Dokument;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alligator on 13.4.17..
 */
public interface DokumentRepo extends JpaRepository<Dokument, Long> {
}
