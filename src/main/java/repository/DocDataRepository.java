package repository;

import com.arbadak.dbapi.entity.DocData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocDataRepository extends JpaRepository <DocData, Integer> {
}
