/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 5:45:57 PM  : Nov 26, 2015
 */
package headfirst.patterns.observer;

/**
 *
 * @author kelli
 */
public class StockObserver  implements Observer{

    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;
    
    private static int observerIdTracker;
    
    private int observerId;
    private Subject stockGrabber;
    
    public StockObserver(Subject stockGrabber){
        this.observerId = ++observerIdTracker;
        System.out.println("Id of Observer: "+observerId);
        stockGrabber.register(this);
    }
    
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printStockPrices();
        
    }

    private void printStockPrices() {
        System.out.println("IBM: "+ibmPrice+"\nAPPL: "+aaplPrice+"\nGOOG: "+googPrice+"\n");
    }
    
    
    
}
