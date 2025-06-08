package co2123.hw2.repo;

import co2123.hw2.model.Pizzeria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzeriaRepository extends CrudRepository<Pizzeria, Integer> {
    public Pizzeria findByDescription(String description);
    public List<Pizzeria> findByPopularName (String name);
}