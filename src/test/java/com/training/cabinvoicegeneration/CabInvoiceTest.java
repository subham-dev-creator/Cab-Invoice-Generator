package com.training.cabinvoicegeneration;

import com.training.cabinvoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabInvoiceGenerator cab = new CabInvoiceGenerator();
        int distance = 10;
        int time = 5;
        Assert.assertEquals(105,cab.getFare(distance,time),0.0);
    }
}
