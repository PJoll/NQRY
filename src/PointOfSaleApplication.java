import java.util.List;
import java.util.ArrayList;
import java.lang.String;



class CoffeeType {
    private String name;
    private double basePrice;

    public CoffeeType(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    } 
   

    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }
}

class PreperationStyle {
    private String name;
    private double additionalCost;

    public PreperationStyle(String name, double additionalCost) {
        this.name = name;
        this.additionalCost = additionalCost;
    }
    public String getName() {
        return name;
    }
    public double getAdditionalCost() {
        return additionalCost;
    }

}

class CoffeeSize{
    private String name;
    private double multiplier;

    public CoffeeSize(String name, double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
    public String getName() {
        return name;
    }
    public double getMultiplier() {
        return multiplier;
    }
}

class Condiment{
    private String name;
    private double additionalCost;

    public Condiment(String name, double additionalCost) {
        this.name = name;
        this.additionalCost = additionalCost;
    }
    public String getName() {
        return name;
    }
    public double getAdditionalCost() {
        return additionalCost;
    }
 }


 class Order {
    private List<CoffeeType> coffeeTypes;
    private List<PreperationStyle> preparationStyles;
    private List<CoffeeSize> coffeeSizes;
    private List<Condiment> condiments;

    public Order() {
        coffeeTypes = new ArrayList<>();
        preparationStyles = new ArrayList<>();
        coffeeSizes = new ArrayList<>();
        condiments = new ArrayList<>();
    }

    public void addCoffeeType(CoffeeType coffeeType) {
        coffeeTypes.add(coffeeType);
    }

    public void addPreparationStyle(PreperationStyle preparationStyle) {
        preparationStyles.add(preparationStyle);
    }

    public void addCoffeeSize(CoffeeSize coffeeSize) {
        coffeeSizes.add(coffeeSize);
    }

    public void addCondiment(Condiment condiment) {
        condiments.add(condiment);
    }

    public double calculateFinalCost() {
        double totalCost = 0.0;

        // Calculate the base cost based on selected coffee types
        for (CoffeeType coffeeType : coffeeTypes) {
            totalCost += coffeeType.getBasePrice();
        }

        // Calculate the cost based on selected preparation style
        if (!preparationStyles.isEmpty()) {
            PreperationStyle preparationStyle = preparationStyles.get(0);
            totalCost += preparationStyle.getAdditionalCost();
        }

        // Calculate the cost based on selected size
        if (!coffeeSizes.isEmpty()) {
            CoffeeSize coffeeSize = coffeeSizes.get(0);
            totalCost *= coffeeSize.getMultiplier();
        }

        // Calculate the cost based on selected condiments
        for (Condiment condiment : condiments) {
            totalCost += condiment.getAdditionalCost();
        }

        return totalCost;
    }
}

public class PointOfSaleApplication {
    public  PointOfSaleApplication(String[] args){
        // Creating the coffee types 
        CoffeeType houseBlend = new CoffeeType("House Blend", 1.0);
        CoffeeType darkRoast = new CoffeeType("Dark roast", 1.5);
        CoffeeType robusta = new CoffeeType("Robusta", 2.0);
        CoffeeType arabica = new CoffeeType("Arabica", 2.5);

        // Creating the preperation styles
        PreperationStyle espresso = new PreperationStyle("Espresso", 1.0);
        PreperationStyle latte = new PreperationStyle("Latte", 1.25);
        PreperationStyle cappuccino = new PreperationStyle("Cappuccino", 1.5);
        PreperationStyle macchiato = new PreperationStyle("Macchiato", 1.75);
        PreperationStyle mocha = new PreperationStyle("Mocha", 2.0);

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