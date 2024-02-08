package org.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzeriaApplication {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pizzeria");
        System.out.println("--------------------");
        System.out.println();

        System.out.print("Please Enter Name ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.println("Menu");
        System.out.println("------------");
        System.out.println("Pizza Sizes");
        System.out.println("(S)mall -  $ 5.99");
        System.out.println("(M)edium - $ 8.99");
        System.out.println("(L)arge -  $ 11.99");
        System.out.println("Select your pizza size: ");
        String size = scanner.nextLine().strip();
        System.out.println();

        System.out.println("Sauces");
        System.out.println("(T)omato");
        System.out.println("(A)lfredo");
        System.out.println("(B)BQ");
        System.out.println("Select your sauce: ");
        String sauce = scanner.nextLine().strip();

        System.out.println();
        System.out.println("Cheeses");
        System.out.println("(M)ozzerella");
        System.out.println("(P)rovolone");
        System.out.println("(A)merican");
        System.out.println("(C)hedder");
        System.out.println("Select your cheese: ");
        String cheese = scanner.nextLine().strip();

        //toppings
        ArrayList<String> toppings = new ArrayList<>();

        System.out.print("Do you want to add a topping (y/n)?");
        String addToppings = scanner.nextLine().strip();

        while (addToppings.equalsIgnoreCase("y")) {
            System.out.println("Enter a topping name ($1 per topping): ");
            String topping = scanner.nextLine().strip();
            toppings.add(topping);

            System.out.print("Do you want to add another topping (y/n)?");
            addToppings = scanner.nextLine().strip();
        }

        //display order
        for(String topping: toppings) {
            System.out.println();
        }

    }
}
