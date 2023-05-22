package classes.com.java.POS;



public abstract class CoffeeType {
    String name = "Unkown Coffee Type";
    public String getName() {
        return name;
    }
    public abstract double cost();
}