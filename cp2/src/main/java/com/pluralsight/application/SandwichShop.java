package com.pluralsight.application;

import com.pluralsight.ui.UserInterface;

public class SandwichShop {

    public void run() {
        while (true) {
            try {
                int choice = UserInterface.homeScreen();
                switch (choice) {
                    case 1:
                        processOrder();
                        break;

                    case 0:
                        UserInterface.exitApplication();
                        return; // Exit the loop and end the method

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private void processOrder() {
        boolean ordering = true;
        while (ordering) {
            try {
                int choice = UserInterface.secondScreen();
                switch (choice) {
                    case 1:
                        UserInterface.addSandwich();
                        System.out.println("Adding sandwiches....");
                        break;

                    case 2:
                        UserInterface.addDrink();
                        System.out.println("Adding drinks...");
                        break;

                    case 3:
                        UserInterface.addChips();
                        System.out.println("Adding chips...");
                        break;

                    case 0:
                        System.out.println("Order cancelled.");
                        ordering = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }






//    public static void main(String[] args) {
//        SandwichShop shop = new SandwichShop();
//        shop.run();
//    }
}
