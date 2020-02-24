package main.java;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cups of coffee do you need?");
        int numCupsOfCoffee = scanner.nextInt();
        int mlWater = numCupsOfCoffee * 200;
        int mlMilk = numCupsOfCoffee * 50;
        int gramsOfBeans = numCupsOfCoffee * 15;

        System.out.println("For " + numCupsOfCoffee + " cups of coffee you will need:");
        System.out.println(mlWater + " ml of water.");
        System.out.println(mlMilk + " ml of milk.");
        System.out.println(gramsOfBeans + " g of coffee beans.");
    }

}
