
import java.util.List;


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
    private CoffeeType coffeeType;
    private PreperationStyle preperationStyle;
    private CoffeeSize coffeeSize;
    private List<Condiment> condiments;

    public Order(CoffeeType coffeeType, PreperationStyle preperationStyle, CoffeeSize coffeeSize, List<Condiment> condiments) {
        this.coffeeType = coffeeType;
        this.preperationStyle = preperationStyle;
        this.coffeeSize = coffeeSize;
        this.condiments = condiments;
    }
    public double calculateFinalCost() {
        double basePrice = coffeeType.getBasePrice();
        double additionalCost = preperationStyle.getAdditionalCost() + coffeeSize.getMultiplier();

        for (Condiment condiment : condiments) {
            additionalCost += condiment.getAdditionalCost();
        }
        return basePrice * additionalCost;
    }
 }
