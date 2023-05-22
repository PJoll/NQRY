import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import classes.com.java.POS.CoffeeType;
import classes.com.java.POS.PreparationStyle;
import classes.com.java.POS.CoffeeSize;
import classes.com.java.POS.Condiment;


public class PointOfSaleApplication {
    public  static void main(String[] args){
        // Creating the coffee types 
        CoffeeType houseBlend = new CoffeeType("House Blend", 1.0);
        CoffeeType darkRoast = new CoffeeType("Dark roast", 1.5);
        CoffeeType robusta = new CoffeeType("Robusta", 2.0);
        CoffeeType arabica = new CoffeeType("Arabica", 2.5);

        // Creating the preperation styles
        PreparationStyle espresso = new PreparationStyle("Espresso", 1.0);
        PreparationStyle latte = new PreparationStyle("Latte", 1.25);
        PreparationStyle cappuccino = new PreparationStyle("Cappuccino", 1.5);
        PreparationStyle macchiato = new PreparationStyle("Macchiato", 1.75);
        PreparationStyle mocha = new PreparationStyle("Mocha", 2.0);

        // Creating the coffee sizes
        CoffeeSize standard = new CoffeeSize("Standard", 1.0);
        CoffeeSize child = new CoffeeSize("Child", 0.75);
        CoffeeSize large = new CoffeeSize("Large", 1.5);
        CoffeeSize addict = new CoffeeSize("Addict", 2.0);

        // Creating the condiments
        Condiment milk = new Condiment("Milk", 1.0);
        Condiment sugar = new Condiment("Sugar", 0.25);
        Condiment cocoPowder = new Condiment("Coco Powder", 0.10);

       

        // Creating the orders with selected options
        List<Condiment> orderCondiments = new ArrayList<>();
        orderCondiments.add(milk);
        orderCondiments.add(sugar);
        Order order1 = new Order(houseBlend,latte,addict,orderCondiments);

        // Calculating the final cost
        double finalCost = order1.calculateFinalCost();

        // Printing the final cost
        System.out.println("Final cost: $" + finalCost);

    }
}