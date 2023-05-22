package com.java.POS;
import java.util.Arrays;
import java.util.List;

class CoffeeType {
    private String name;
    private double cost;

    public CoffeeType(String name, double cost) {
        this.name = name;
        this.cost = cost;
    } 
   

    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public static List<CoffeeType> getAllValues() {
		return Arrays.asList(CoffeeType.values());
	}
}