/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 5:18:45 PM  : Nov 26, 2015
 */
package headfirst.patterns.observer;

/**
 *
 * @author kelli
 * Observer pattern
 *  ======================
 * A software design pattern in which an object called the subject maintains a list 
 * of its dependants called observers and notifies them automatically of any state 
 * changes usually by calling on of their methods.
 * 
 * When you need many other objects to receive an update when another object changes
 * Has Subject (Publishers) and Observer(Subscribers)
 * Positive: The subject does not need to know anything about the subscriber therefore loose coupling
 * Negative: The subject may need to send updates that dont matter to the observer.
 */
public class ObserverMain {
    public static void main(String[] args) {
        StockGrabber grabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(grabber);
        
        grabber.setIBMPrice(195.00);
        grabber.setAAPLPrice(212.00);
        grabber.setGOOGPrice(340.00);
    }
}
