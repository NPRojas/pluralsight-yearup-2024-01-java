package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1: Find the highest salary
        // Why are these numbers a double instead of a float?
        double bobSalary = 1500.75;
        double garySalary = 2356.58;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("---------------------------------------");
        System.out.println("Bob's salary is $" + bobSalary);
        System.out.println("Gary's salary is $" + garySalary);
        System.out.println("The highest salary is $" + highestSalary);
        System.out.println("---------------------------------------");
        //Question 2: Find the smallest price
        double carPrice = 6325000.25;
        double truckPrice = 0.99;
        double smallestValue = Math.min(carPrice,truckPrice);
        System.out.println("The lowest price of the two is $" + smallestValue);
        System.out.println("---------------------------------------");

    }
}
