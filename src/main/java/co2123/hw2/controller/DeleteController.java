package co2123.hw2.controller;

import co2123.hw2.model.Ingredient;
import co2123.hw2.model.Pizza;
import co2123.hw2.model.Pizzeria;
import co2123.hw2.repo.IngredientRepository;
import co2123.hw2.repo.PizzaRepository;
import co2123.hw2.repo.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class DeleteController {

    @Autowired
    private PizzeriaRepository repo1;
    @Autowired
    private PizzaRepository repo2;
    @Autowired
    private IngredientRepository repo3;

    @GetMapping("/deletePizzeria")
    public String deletePizzeria(@RequestParam("id") int id) {
        repo1.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deletePizza")
    public String deletePizza(@RequestParam("name") String name) {
        Pizza pizza = repo2.findByName(name);
        if (pizza != null) {
            List<Pizzeria> allPizzerias = (List<Pizzeria>) repo1.findAll();
            for(Pizzeria p : allPizzerias) {
                p.getPizzas().remove(pizza);
                if(p.getPopular() != null && p.getPopular().equals(pizza)) {
                    p.setPopular(null);
                }
                repo1.save(p);
            }
            repo2.delete(pizza);
        }
        return "redirect:/";
    }

    @GetMapping("/deleteIngredient")
    public String deleteIngredient(@RequestParam("identifier") int identifier) {
        Ingredient ingredient = repo3.findById(identifier).orElse(null);
        if (ingredient != null) {
            Pizza pizza = ingredient.getPizza();
            if (pizza != null) {
                if (pizza.getIngredients() != null) {
                    pizza.getIngredients().remove(ingredient);
                }
                if (pizza.getFlavour() != null && pizza.getFlavour().getIdentifier() == ingredient.getIdentifier()) {
                    pizza.setFlavour(null);
                }
                repo2.save(pizza);
            }
            repo3.delete(ingredient);
        }
        return "redirect:/";
    }
}