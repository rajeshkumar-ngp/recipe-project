package rajesh.springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import rajesh.springframework.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
