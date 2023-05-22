package com.java.POS;
import java.util.Arrays;
import java.util.List;

class CoffeeSize{
    private String name;
    private double cost;

    public CoffeeSize(String name, double cost) {
        this.name = name;
        this.multiplier = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public static List<CoffeeSize> getAllValues() {
		return Arrays.asList(CoffeeSize.values());
	}
}