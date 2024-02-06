package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // prompt user info
        System.out.print("What is the serial number?");
        int serialNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.print("What model is the phone?");
        String model = userInput.nextLine();

        System.out.print("Who is the carrier?");
        String carrier = userInput.nextLine();

        System.out.print("What is the phone number?");
        String phoneNumber = userInput.nextLine();

        System.out.print("Who is the owner of this phone?");
        String owner = userInput.nextLine();

        // Create a class instance using the object constructor
        CellPhone cellPhone = new CellPhone();

        // Use the setters for the new class instance
        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        // Use the getters of the new class instance to print out the information
        System.out.println("Cell Phone Info: ");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());

    }
}
