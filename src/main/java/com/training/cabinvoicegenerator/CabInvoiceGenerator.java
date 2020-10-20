package com.training.cabinvoicegenerator;

public class CabInvoiceGenerator {
    private static final double COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_MINUTE = 1;
    private static double MIN_FARE = 5;

    public double getFare(int Distance, int Time){
        double fare = COST_PER_KILOMETER*Distance + COST_PER_MINUTE*Time;
        return fare>MIN_FARE ? fare : MIN_FARE;
    }

}
