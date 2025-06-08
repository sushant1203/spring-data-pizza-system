package co2123.hw2.repo;

import co2123.hw2.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
    public Ingredient findByAmount(int amount);
}
