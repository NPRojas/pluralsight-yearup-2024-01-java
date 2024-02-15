package org.pluralsight.models;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<String> vehicles;
    public String getName() {
        return name;
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

    public List<vehicle> getVehiclesByPrice(double max, double min) {
        return null;
    }
    public List<vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<vehicle> getVehiclesByYear(int year) {
        return null;
    }
    public List<vehicle> getVehiclesByColor(String color) {
        return null;
    }
    public List<vehicle> getVehiclesByMileage(int odometer) {
        return null;
    }
    public List<vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }
    public List<vehicle> getAllVehicles() {
        return vehicleList;
    }

    public void addVehicle(vehicle) {
        //add vehicle to which list?
    }

    public void removeVehicle(vehicle) {
        // remove it from which list?
    }

}
