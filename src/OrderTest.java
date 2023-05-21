
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    @Test
    public void testCalculateFinalCost() {
        // Create coffee types
        CoffeeType houseBlend = new CoffeeType("House blend", 1.0);
        CoffeeType darkRoast = new CoffeeType("Dark roast", 1.5);

        // Create preparation styles
        PreperationStyle latte = new PreperationStyle("Latte", 1.25);
        PreperationStyle cappuccino = new PreperationStyle("Cappuccino", 1.5);

        // Create coffee sizes
        CoffeeSize standard = new CoffeeSize("Standard", 1.0);
        CoffeeSize large = new CoffeeSize("Large", 1.5);

        // Create condiments
        Condiment milk = new Condiment("Milk", 1.0);
        Condiment sugar = new Condiment("Sugar", 0.25);

        // Create an order with selected options
        List<Condiment> orderCondiments = new ArrayList<>();
        orderCondiments.add(milk);
        orderCondiments.add(sugar);

        Order order1 = new Order(houseBlend, latte, standard, orderCondiments);
        Order order2 = new Order(darkRoast, cappuccino, large, orderCondiments);

        // Calculate the final cost
        double finalCost1 = order1.calculateFinalCost();
        double finalCost2 = order2.calculateFinalCost();

        // Assert the expected final costs
        Assert.assertEquals(3.25, finalCost1, 0.001);
        Assert.assertEquals(5.75, finalCost2, 0.001);
    }
}
 
