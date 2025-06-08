package co2123.hw2.controller;

import co2123.hw2.repo.IngredientRepository;
import co2123.hw2.repo.PizzaRepository;
import co2123.hw2.repo.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ListController {
    @Autowired
    private PizzeriaRepository repo1;
    @Autowired
    private PizzaRepository repo2;
    @Autowired
    private IngredientRepository repo3;

    @RequestMapping("/listPizzeria")
    public String listPizzeria(Model model) {
        model.addAttribute("data", repo1.findAll());
        return "list";
    }

    @RequestMapping("/listPizza")
    public String listPizza(Model model) {
        model.addAttribute("data", repo2.findAll());
        return "list";
    }

    @RequestMapping("/listIngredient")
    public String listIngredient(Model model) {
        model.addAttribute("data", repo3.findAll());
        return "list";
    }
}