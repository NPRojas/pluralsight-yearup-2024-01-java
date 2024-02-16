package org.pluralsight;

import org.pluralsight.models.Vehicle;
import org.pluralsight.services.DealershipFileManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        ArrayList<Vehicle> vehicles = dealershipFileManager.getVehiclesByYear(2012);

        // Print the vehicles
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMake());
        }
    }
}