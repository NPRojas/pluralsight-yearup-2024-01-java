package org.pluralsight.models;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles;
    public String getName() {
        return name;
    }

    // constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double max, double min) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int year) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int odometer) {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }
    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }

//    public void addVehicle(vehicle) {
//        //add vehicle to which list?
//    }
//
//    public void removeVehicle(vehicle) {
//        // remove it from which list?
//    }

}
