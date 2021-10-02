package rajesh.springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import rajesh.springframework.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
