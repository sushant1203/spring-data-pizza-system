package co2123.hw2;

import co2123.hw2.model.Ingredient;
import co2123.hw2.model.Pizza;
import co2123.hw2.model.Pizzeria;
import co2123.hw2.repo.IngredientRepository;
import co2123.hw2.repo.PizzaRepository;
import co2123.hw2.repo.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private PizzeriaRepository repo1;
    @Autowired
    private PizzaRepository repo2;
    @Autowired
    private IngredientRepository repo3;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Pizzeria p = new Pizzeria();
        p.setDescription("PizzaNapoletana");
        p = repo1.save(p);

        Pizza pz = new Pizza();
        pz.setName("SkibidiPizza");
        pz = repo2.save(pz);

        Ingredient ing = new Ingredient();
        ing.setAmount(2);
        ing.setPizza(pz);
        ing = repo3.save(ing);

        pz.setIngredients(new ArrayList<>());
        pz.getIngredients().add(ing);
        pz.setFlavour(ing);

        p.setPizzas(new ArrayList<>());
        p.getPizzas().add(pz);
        p.setPopular(pz);

        repo1.save(p);
    }
}