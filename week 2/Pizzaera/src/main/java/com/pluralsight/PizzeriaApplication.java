package com.pluralsight;

import com.pluralsight.views.UserInput;

import java.util.ArrayList;
import java.util.Scanner;
// Pizza Application acts as the controller responsible for the
// logical flow of the application
public class PizzeriaApplication {
    UserInput UI = new UserInput();
    double TOPPING_PRICE = 1.5;
    public void run() {
        UI.displayHomeScreen();

        UI.getCustomerName();

        System.out.println("Menu");
        System.out.println("------------");

        UI.getPizzaSize();


        //toppings

        //calculate price


        double totalPrice = basePrice + (toppings.size() + TOPPING_PRICE);

        //display values
        String sauceDisplay = "Tomato";

        if(sauce.equalsIgnoreCase("a")) {
            sauceDisplay = "Alfredo";
        } else if (sauce.equalsIgnoreCase("b")) {
            sauceDisplay = "BQQ";
        }

        String cheeseDisplay = "Mozzerella";

        if(cheese.equalsIgnoreCase("p")) cheeseDisplay = "Provolone";
        else if (cheese.equalsIgnoreCase("a")) cheeseDisplay = "American";
        else if (cheese.equalsIgnoreCase("c")) cheeseDisplay = "Cheddar";


        //display order
        for(String topping: toppings) {
            System.out.println();
        }


    }
}
