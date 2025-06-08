package co2123.hw2.model;

import jakarta.persistence.*;

@Entity

public class Ingredient {
    @Id
    @GeneratedValue
    private int identifier;//primary key
    private int amount;
    @ManyToOne
    @JoinColumn
    private Pizza pizza;

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "amount=" + amount +
                ", identifier=" + identifier +
                '}';
    }
}