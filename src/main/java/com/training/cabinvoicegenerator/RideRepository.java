package com.training.cabinvoicegenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RideRepository {
    int id;
    ArrayList<CabRides> rides = new ArrayList<>();

    public RideRepository(int id) {
        this.id = id;
    }

    public void addRide(double dis,int time){
        CabRides ride = new CabRides(dis,time);
        rides.add(ride);
    }

    public void addRide(CabRides[] rides){
        for(CabRides ride : rides)
            this.rides.add(ride);
    }

    public int getNumOfRides(){
        return rides.size();
    }

    public void getInvoices(){
        CabEnhancedBill cb = CabInvoiceGenerator.getEnhanceInvoice(rides);
        System.out.println(cb.printInvoice());
    }
}

