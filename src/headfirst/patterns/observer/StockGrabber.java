/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 5:30:58 PM  : Nov 26, 2015
 */
package headfirst.patterns.observer;

import java.util.ArrayList;

/**
 *
 * @author kelli
 */
public class StockGrabber implements Subject{
    
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer: "+(observerIndex+1)+" deleted");
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }
    
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
    public void setAAPLPrice(double newAAPLPrice){
        this.applPrice = newAAPLPrice;
        notifyObserver();
    }
    
}
