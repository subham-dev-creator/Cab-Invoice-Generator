package com.training.cabinvoicegenerator;

import static com.training.cabinvoicegenerator.CabInvoiceGenerator.getFare;

public class CabRides {
    double distance;
    int time;
    double fare;

    public CabRides(double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.fare=getFare(this.distance,this.time);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
