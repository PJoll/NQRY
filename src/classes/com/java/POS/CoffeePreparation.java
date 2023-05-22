package com.java.POS;
import java.util.Arrays;
import java.util.List;

class PreparationStyle {
    private String name;
    private double cost;

    public PreparationStyle(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public static List<PreparationStyle> getAllValues() {
		return Arrays.asList(CoffeePreparationStyle.values());
	}
}