package Bar;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Dish {

    private List<String> Ingrendients;
    private int price;
    private String name;


    public Dish(List<String> ingrendients, int price, String name) {
        Ingrendients = ingrendients;
        this.price = price;
        this.name = name;
    }

    public List<String> getIngrendients() {
        return Ingrendients;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

