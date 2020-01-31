package com.company;

public class Truck {
    private String truckID = "";
    private double odometer;
    private double mpg;
    private double fuel;
    private final double COPPACITY = 20.0;
    private static double totalFuel;

    public Truck(String truckID){
        this(truckID,0,0,0);
    }
    public Truck(String truckID, double odometer, double mpg, double fuel){
        this.truckID = truckID;
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }


    public double getFuel() {
        return fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public double getOdometer() {
        return odometer;
    }

    public String getTruckID() {
        return truckID;
    }

    public boolean enoughFuel(double miles){
        if (miles > (fuel * mpg)){
            return false;
        }
        else {
            return true;
        }
    }

    public String drive (double miles){
        if (enoughFuel(miles)){
            odometer += miles;
            fuel -= miles / mpg;
            return "success";
        }
        else {
            return "Truck " + truckID + " does not have enough fuel to drive " + miles + " miles.";
        }
    }

    public String fill(){
        double temp = COPPACITY - fuel;
        fuel = COPPACITY;
        totalFuel += temp;
        return "success";
    }
    public String fill(double gallons){
        if (fuel + gallons > COPPACITY){
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
        }
        else{
            fuel += gallons;
            totalFuel += gallons;
            return "success";
        }
    }

    public static double getTotalFuel(){
        return totalFuel;
    }

    public String toString(){
        return "Truck: " + truckID + "\nOdometer: " + odometer + "\nMiles Per Gallon: " + mpg + "\nFuel: " + fuel;
    }
}

