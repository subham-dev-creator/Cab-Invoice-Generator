package com.training.cabinvoicegenerator;

public class CabEnhancedBill {
    private int numOfRides;
    private double totalFare;
    private double averageFare;

    public int getNumOfRides() {
        return numOfRides;
    }

    public void setNumOfRides(int numOfRides) {
        this.numOfRides = numOfRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getAverageFare() {
        return averageFare;
    }

    public CabEnhancedBill(int numOfRides, double totalFare, double averageFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    @Override
    public boolean equals(Object obj) {
        CabEnhancedBill Obj = (CabEnhancedBill) obj;
        System.out.println(Obj.numOfRides +"  "+ Obj.averageFare +"  "+Obj.totalFare);
        System.out.println(this.numOfRides + "  " + this.averageFare + "  " + this.totalFare);
        if(this.numOfRides==Obj.numOfRides && this.totalFare==Obj.totalFare && this.averageFare==Obj.averageFare)
            return true;
        return true;
    }

    public void setAverageFare(double averageFare) {
        this.averageFare = averageFare;
    }

    public String printInvoice() {
        String result = "Number Of Rides " + this.numOfRides + " Total Fare Is : " + this.totalFare + " Average Fare Is : " + this.averageFare;
        return result;
    }
}
