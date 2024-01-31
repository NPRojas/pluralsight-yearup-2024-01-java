import java.util.Scanner;

public class BasicCalculator {
    public static void main (String[] args) {
        // variables
        Scanner userInput = new Scanner(System.in);
        double FirstNumber;
        double SecondNumber;
        String Operation;
        double Result;

        //input
        System.out.print("Enter the first number:");
        FirstNumber = userInput.nextDouble();
        userInput.nextLine();
        System.out.print("Enter the second number:");
        // why do I have to use next line after next int again?
        SecondNumber = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("Possible Calculations:");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubstract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");
        System.out.print("Please select an option:");
        Operation = userInput.nextLine();

        //calculations
        if(Operation.equalsIgnoreCase("a")) {
            Result = FirstNumber + SecondNumber;
        } else if (Operation.equalsIgnoreCase("s")) {
            Result = FirstNumber - SecondNumber;
        } else if (Operation.equalsIgnoreCase("m")) {
            Result = FirstNumber * SecondNumber;
        } else if(Operation.equalsIgnoreCase("d")) {
            Result = FirstNumber/SecondNumber;
        } else {
            System.out.println("Invalid operation");
            Result = 0;
        }

        System.out.println("The result of the operation is: " + Result);
    }
}
