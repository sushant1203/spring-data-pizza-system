package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Pizzeria {
    @Id
    @GeneratedValue
    private int id; //primary key
    private String description;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Pizza> pizzas;
    @ManyToOne
    private Pizza popular;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Pizza getPopular() {
        return popular;
    }

    public void setPopular(Pizza popular) {
        this.popular = popular;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", pizzas=" + pizzas +
                ", popular=" + popular +
                '}';
    }
}