package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Pizza {
    @Id
    private String name; //primary key
    @ManyToMany(mappedBy = "pizzas")
    private List<Pizzeria> pizzerias;
    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Ingredient> ingredients;
    @OneToOne
    @JoinColumn
    private Ingredient flavour;

    public List<Pizzeria> getPizzerias() {
        return pizzerias;
    }

    public void setPizzerias(List<Pizzeria> pizzerias) {
        this.pizzerias = pizzerias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient getFlavour() {
        return flavour;
    }

    public void setFlavour(Ingredient flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", flavour=" + flavour +
                '}';
    }
}