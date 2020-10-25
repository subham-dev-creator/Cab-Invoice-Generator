package com.training.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class CabInvoiceGenerator {
    private static final double NORMAL_COST_PER_KILOMETER = 10.0;
    private static final int NORMAL_COST_PER_MINUTE = 1;
    private static double NORMAL_MIN_FARE = 5;

    private static final double PREMIUM_COST_PER_KILOMETER = 15.0;
    private static final int PREMIUM_COST_PER_MINUTE = 2;
    private static double PREMIUM_MIN_FARE = 20;

    // Returns Fare For A Normal Ride (Distance And Time Given)
    public static double getNormalFare(double Distance, int Time){
        double fare = NORMAL_COST_PER_KILOMETER*Distance + NORMAL_COST_PER_MINUTE*Time;
        return fare>NORMAL_MIN_FARE ? fare : NORMAL_MIN_FARE;
    }

    // Returns Total Fare Of Multiple Normal Rides
    public static double getNormalFare(ArrayList<CabRides> cabrides){
        int fare = 0;
        for(CabRides cab : cabrides){
            fare+=cab.fare;
        }
        System.out.println("Fare Is : " + fare);
        return fare;
    }

    // Returns Fare For A Premium Ride (Distance And Time Given)
    public static double getPermiumFare(double Distance, int Time){
        double fare = PREMIUM_COST_PER_KILOMETER*Distance + PREMIUM_COST_PER_MINUTE*Time;
        return fare>PREMIUM_MIN_FARE ? fare : PREMIUM_MIN_FARE;
    }

    // Returns Total Fare Of Multiple Premium Rides
    public static double getNoPremiumFare(ArrayList<CabRides> cabrides){
        int fare = 0;
        for(CabRides cab : cabrides){
            fare+=cab.fare;
        }
        System.out.println("Fare Is : " + fare);
        return fare;
    }

    // Returns CabEnhancedBill Object
    public static CabEnhancedBill getEnhanceInvoice(ArrayList<CabRides> rides) {
        int numOfRides = rides.size();
        double totalFare = getNormalFare(rides);
        double avgFare = totalFare/numOfRides;
        CabEnhancedBill cb = new CabEnhancedBill(numOfRides,totalFare,avgFare);
        return cb;
    }
}
