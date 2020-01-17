package com.company;

public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(int start, int end, double time, double gallons){
        myStartOdometer = start;
        myEndOdometer = end;
        myTime = time;
        myGallonsUsed = gallons;
    }

    public CarTrip(){
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }

    public double getMyStartOdometer(){
        return myStartOdometer;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyTime() {
        return myTime;
    }

    public void setMyEndOdometer(double myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public void setMyStartOdometer(double myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed(){
        if (myTime == 0){
            return 0.0;
        }
        return (myEndOdometer - myStartOdometer)/myTime;
    }

    public double getGasMileage(){
        if (myGallonsUsed == 0){
            return 0.0;
        }
        return (myEndOdometer - myStartOdometer)/myGallonsUsed;
    }

    public double getTotalGasPrice(double pricePerGallon){
        return myGallonsUsed * pricePerGallon;
    }

    public String toString(){
        return "Distance traveled: " + (myEndOdometer-myStartOdometer) + " miles";
    }
}
