package com.training.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class CabInvoiceGenerator {
    private static final double COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_MINUTE = 1;
    private static double MIN_FARE = 5;

    // Returns Fare For A Ride (Distance And Time Given)
    public double getFare(double Distance, int Time){
        double fare = COST_PER_KILOMETER*Distance + COST_PER_MINUTE*Time;
        return fare>MIN_FARE ? fare : MIN_FARE;
    }

    // Returns Total Fare Of Multiple Rides
    public double getFare(CabRides[] cabrides){
        int fare = 0;
        for(CabRides cab : cabrides){
            fare+=getFare(cab.distance,cab.time);
        }
        return fare;
    }

    // Returns CabEnhancedBill Object
    public CabEnhancedBill getEnhanceInvoice(CabRides[] rides) {
        int numOfRides = rides.length;
        double totalFare = getFare(rides);
        double avgFare = totalFare/numOfRides;
        CabEnhancedBill cb = new CabEnhancedBill(numOfRides,totalFare,avgFare);
        return cb;
    }
}
