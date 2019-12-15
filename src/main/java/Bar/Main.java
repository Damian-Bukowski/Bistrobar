package Bar;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Składniki

     Ingredient ing1 = new Ingredient("Ziemniaki",50,60 );
     Ingredient ing2 = new Ingredient("Makaron",50,50 );
     Ingredient ing3 = new Ingredient("Mięso",100,30 );
     Ingredient ing4 = new Ingredient("Pierś z kurczaka",100,25 );
     Ingredient ing5 = new Ingredient("Ryba",12,35 );
     Ingredient ing6 = new Ingredient("Marchew",25,5 );
     Ingredient ing7 = new Ingredient("Pomidor",20,5 );
     Ingredient ing8 = new Ingredient("Czosnek",5,5 );
     Ingredient ing9 = new Ingredient("Sałata",100,5 );
     Ingredient ing10 = new Ingredient("Wołowina",100,53 );
     Ingredient ing11 = new Ingredient("Indyk",100,5 );

     //Dishes

      Dish d1 = new Dish (Collections.singletonList("Mięso, Czosnek, Makaron"),35,"Makaron z Mięskiem");
      Dish d2 = new Dish (Collections.singletonList("Mięso, Czosnek, Makaron"),35,"Makaron z Mięskiem");
      Dish d3 = new Dish (Collections.singletonList("Mięso, Czosnek, Makaron"),35,"Makaron z Mięskiem");


        //Waiters

     Waiter w1 = new Waiter("Adam", "Ceglarek");
     Waiter w2 = new Waiter("Danuta", "Tokarczuk");
     Waiter w3 = new Waiter("Marta", "Adamowicz");

     //Client

    Client c1 = new Client("Dominik", "Marciniak");
    Client c2 = new Client("Marta", "Sobota");
    Client c3 = new Client("Dominika", "Kraz");
    Client c4 = new Client("Monika", "Obecna");
    Client c5 = new Client("Dariusz", "Piątek");

        System.out.println("Zamówienie Pani/Pana: " + c1 + " " + d1 + "Przyjąl: " + w1);
    }
}
