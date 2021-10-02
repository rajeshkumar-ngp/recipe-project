package rajesh.springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import rajesh.springframework.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
