package com.training.cabinvoicegeneration;

import com.training.cabinvoicegenerator.CabEnhancedBill;
import com.training.cabinvoicegenerator.CabInvoiceGenerator;
import com.training.cabinvoicegenerator.CabRides;
import com.training.cabinvoicegenerator.RideRepository;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CabInvoiceTest {


    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        double distance = 10;
        int time = 5;
        Assert.assertEquals(105,cab.getFare(distance,time),0.0);
    }

    @Test
    public void givenDistanceAndTime_shouldReturnMinimumFare(){
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        double distance = 0;
        int time = 0;
        Assert.assertEquals(5,cab.getFare(distance,time),0.0);
    }

    @Test
    public void givenMultipleDistanceAndTime_ShouldReturnFare(){
        ArrayList<CabRides> rides = new ArrayList<CabRides>(){
            {
                add(new CabRides(1,5)) ;
                add(new CabRides(2,5));
            }
        };
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        Assert.assertEquals(40.0,cab.getFare(rides),0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnEnhancedInvoice(){
        ArrayList<CabRides> rides = new ArrayList<CabRides>() {
            {
                add(new CabRides(1, 10));
                add(new CabRides(2, 20));
                add(new CabRides(3, 30));
            }
        };
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        CabEnhancedBill cabBill = new CabEnhancedBill(3,120,40);
        Assert.assertTrue(cabBill.equals(cab.getEnhanceInvoice(rides)));
    }

    @Test
    public void givenUserId_ShouldReturnListOfRidesInvoice(){
        RideRepository rider = new RideRepository(1);
        CabRides[] rides = {
                new CabRides(1,10) ,
                new CabRides(2,20),
                new CabRides(3,30)
        };

        rider.addRide(4,40);
        rider.addRide(rides);
        rider.getInvoices();
        Assert.assertEquals(4,rider.getNumOfRides());
    }


}
