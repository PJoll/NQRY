package com.yourcompany;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<CoffeeType> coffeeTypes;
    private List<PreparationStyle> preparationStyle;
    private List<CoffeeSize> coffeeSize;
    private List<Condiment> condiments;

    public Order() {
        coffeeTypes = new ArrayList<>();
        condiments = new ArrayList<>();
    }

    public void addCoffeeType(CoffeeType coffeeType) {
        coffeeTypes.add(coffeeType);
    }

    public void setPreparationStyle(PreparationStyle preparationStyle) {
        this.preparationStyle = preparationStyle;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public void addCondiment(Condiment condiment) {
        condiments.add(condiment);
    }

    public double calculateFinalCost() {
        // Calculate the final cost based on selected options
        double cost = coffeeTypes.stream().mapToDouble(CoffeeType::getBasePrice).sum();
        double preparationStyleCost = preparationStyle != null ? preparationStyle.getAdditionalPrice() : 0.0;
        double sizeMultiplier = coffeeSize != null ? coffeeSize.getSizeMultiplier() : 1.0;
        double condimentCost = condiments.stream().mapToDouble(Condiment::getAdditionalPrice).sum();

        return (cost + preparationStyleCost) * sizeMultiplier + condimentCost;
    }
    
    // Other methods, getters, and setters

    public List<CoffeeType> getCoffeeTypes() {
        return coffeeTypes;
    }

    public PreparationStyle getPreparationStyle() {
        return preparationStyle;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    public void setCoffeeTypes(List<CoffeeType> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public void setCondiments(List<Condiment> condiments) {
        this.condiments = condiments;
    }
}