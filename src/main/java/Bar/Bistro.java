package Bar;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Bistro {
    private static Bistro bistro;

    private Bistro() {
    }
    public Bistro getInstance() {
        if (bistro == null)
            bistro = new Bistro();
            return bistro;

    }
        List <Dish> Dishes;
        List <Order> Orders;
        List <Waiter> Waiters;


        //
        public void addDish(Dish dish){
            Dishes.add(dish);
        }
        public void addOrder(Order order){
            Orders.add(order);
        }
        public void addWaiter (Waiter waiter){
            Waiters.add(waiter);
        }
        public void addDecorateDish(Dish dish, SideDish sideDish) {
            Orders.add(new Order(dish, sideDish));

        }

        //Exception attempt
       /* if (Ingredient == Vege)
            throw new Exception("Danie Vege nie moze zawierac miesa !")
            else

        */
       ArrayList<Dish> dishes = new ArrayList<>();

    public List<Dish> getDishes() {
        return Dishes;
    }

    ArrayList<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return Orders;
    }

    ArrayList<Waiter> waiters = new ArrayList<>();

    public List<Waiter> getWaiters() {
        return Waiters;
    }

    public static class Bonus {

        public static double todaysDiscountAmount;
    }

    public static class PercentageBonus {

        public static double todaysDiscountRate;

    }
}




