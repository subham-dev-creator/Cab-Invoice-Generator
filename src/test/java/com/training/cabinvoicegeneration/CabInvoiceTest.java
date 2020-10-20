package com.training.cabinvoicegeneration;

import com.training.cabinvoicegenerator.CabInvoiceGenerator;
import com.training.cabinvoicegenerator.CabRides;
import org.junit.Assert;
import org.junit.Test;

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
        CabRides[] rides = {
                new CabRides(10,5) ,
                new CabRides(20,5)
        };
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        Assert.assertEquals(310,cab.getFare(rides),0.0);
    }
}
