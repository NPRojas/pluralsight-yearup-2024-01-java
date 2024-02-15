package org.pluralsight.models;

public class Vehicle {
    private int vin;
    private int year;
    private int make;
    private int model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, int model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
}
