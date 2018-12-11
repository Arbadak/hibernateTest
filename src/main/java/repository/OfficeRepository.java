package repository;

import com.arbadak.dbapi.entity.Office;
import com.arbadak.dbapi.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficeRepository extends JpaRepository<Office, Integer> {
    List<Office> findByOrgID(Organization orgClassId);

}
