


public class Mocha extends Condiment {
    CoffeeType coffeeType;
    public Mocha(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }
    public String getName() {
        return coffeeType.getName() + ", Mocha";
    }
    public double cost() {
        return 2.00 + coffeeType.cost();
    }
}