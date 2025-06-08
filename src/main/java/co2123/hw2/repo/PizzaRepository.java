package co2123.hw2.repo;

import co2123.hw2.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, String> {
    public Pizza findByName(String name);
}
