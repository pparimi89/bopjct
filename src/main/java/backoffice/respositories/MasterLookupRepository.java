package backoffice.respositories;

import com.aidiva.backoffice.entity.MastLookup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterLookupRepository extends JpaRepository<MastLookup, String> {

    List<MastLookup> findByMastLookupType(String mastLookupType);

}