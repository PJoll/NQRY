



public class Soy extends Condiment {
    CoffeeType coffeeType;
    public Soy(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }
    public String getName() {
        return coffeeType.getName() + ", Soy";
    }
    public double cost() {
        return 1.00 + coffeeType.cost();
    }
}