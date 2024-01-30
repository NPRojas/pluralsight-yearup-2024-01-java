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
        // Question 3: Find the area of a circle
        double CircleRadius = 7.25;
        double CircleArea = Math.round(Math.PI * Math.pow(CircleRadius, 2));
        System.out.println("The area of the circle is " + CircleArea + " in");
        System.out.println("---------------------------------------");
        // Question 4: Find the square root
        double Number = 5.0;
        double SquareRoot = Math.sqrt(Number);
        System.out.println("The square root of " + Number + " is " + SquareRoot);
        System.out.println("---------------------------------------");
        // Question 5: Find the distance between two points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double Distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The distance between the two points is " + Distance);
        System.out.println("---------------------------------------");
        // Question 6 Absolute Positive
        double number = -3.8;
        double AbsoluteValue = Math.abs(number);
        System.out.println("The absolute value of " + number + " is " + AbsoluteValue);
        System.out.println("---------------------------------------");
        // Question 7 Random Number
        double RandomNumber = Math.random();
        System.out.println("Here is a random number between 1 and 0: " + RandomNumber);
        System.out.println("---------------------------------------");


    }
}
