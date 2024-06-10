package com.pluralsight.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private static Scanner in = new Scanner(System.in);
    private static List<Sandwich> sandwichOrder = new ArrayList<>();

        public static int homeScreen() {
        System.out.println();
        System.out.println("Welcome to our Sandwich Shop we're happy to have you!");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        return Integer.parseInt(in.nextLine());

    }


        public static int secondScreen()
        {
            System.out.println();
            System.out.println("Start Your Order");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("0) Cancel Order");
            return Integer.parseInt(in.nextLine());

        }


    public static void exitApplication() {
    }

    public static void addSandwich() {
        System.out.println("-----Adding Sandwich to the order let's build your sandwich-------");


        System.out.println("What size sandwich would you like?");
        System.out.println("1) 4 inch");
        System.out.println("2) 8 inch");
        System.out.println("3) 12 inch ");



        System.out.println("What type of bread would you like?");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        int breadChoice = Integer.parseInt(in.nextLine());



        System.out.println("What type of meat would you like?");
        System.out.println("1) Steak");
        System.out.println("2) Ham");
        System.out.println("3) Salami");
        System.out.println("4) Roast Beef");
        System.out.println("5) Chicken");
        System.out.println("6) Bacon");
        int meatChoice = Integer.parseInt(in.nextLine());


        System.out.println("What kind of cheese would you like?");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        int cheeseChoice = Integer.parseInt(in.nextLine());


        System.out.println("What Toppings would you like?");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalapenos");
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushroom");
        int toppingsChoice = Integer.parseInt(in.nextLine());


        System.out.println("What sauces would you like to add?");
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) Ketchup");
        System.out.println("4) Ranch");
        System.out.println("5) Vinaigrette");
        int sauceChoice = Integer.parseInt(in.nextLine());


        System.out.println();

    }

    public static void addDrink() {
        System.out.println("Adding Drink to the order...");


        // Implement the logic to add a drink
        // For example: drinkOrder.add(new Drink());
    }

    public static void addChips() {
        System.out.println("Adding Chips to the order...");
        // Implement the logic to add chips
        // For example: chipsOrder.add(new Chips());
    }

    public static void cancelOrder() {
        System.out.println("Order cancelled.");
        // Implement the logic to handle order cancellation
        // For example: currentOrder.clear();
    }
}
