package com.java.POS;
import java.util.Arrays;
import java.util.List;

class Condiment{
    private String name;
    private double cost;

    public Condiment(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public static List<Condiment> getAllValues() {
		return Arrays.asList(Condiment.values());
	}
 }