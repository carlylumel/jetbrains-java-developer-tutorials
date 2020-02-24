package main.java;

import java.util.Scanner;
import java.lang.Math;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Water inventory, in ml: ");
        int mlWaterInMachine = scanner.nextInt();
        int cupsPossibleWithWaterAmount = mlWaterInMachine / 200;
        System.out.println("Milk inventory, in ml: ");
        int mlMilkInMachine = scanner.nextInt();
        int cupsPossibleWithMilkAmount = mlMilkInMachine / 50;
        System.out.println("Coffee beans inventory, in g: ");
        int gBeansInMachine = scanner.nextInt();
        int cupsPossibleWithBeansAmount = gBeansInMachine / 15;

        int minAmountOfCupsPossible = Math.min(Math.min(cupsPossibleWithWaterAmount, cupsPossibleWithMilkAmount), cupsPossibleWithBeansAmount);

        System.out.println("How many cups of coffee do you need? ");
        int numCupsOfCoffeeDesired = scanner.nextInt();

        int mlWaterNeeded = numCupsOfCoffeeDesired * 200;
        int mlMilkNeeded = numCupsOfCoffeeDesired * 50;
        int gramsOfBeansNeeded = numCupsOfCoffeeDesired * 15;

        boolean ableToMakeCoffee = mlWaterInMachine >= mlWaterNeeded &&
                mlMilkInMachine >= mlMilkNeeded &&
                gBeansInMachine >= gramsOfBeansNeeded;

        if (ableToMakeCoffee) {
            System.out.println("Yes, I am able to make " + numCupsOfCoffeeDesired + " cups of coffee.");
            System.out.println("I can even make " + (minAmountOfCupsPossible - numCupsOfCoffeeDesired) + " more than that!");
        } else {
            System.out.println("No, I am unable to make that many cups of coffee.");
            System.out.println("I am only able to make " + minAmountOfCupsPossible + " cups of coffee.");
        }
    }

}
