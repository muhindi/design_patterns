/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 5:27:14 PM  : Nov 26, 2015
 */
package headfirst.patterns.observer;

/**
 *
 * @author kelli
 */
public interface Subject {
    public  void register(Observer o);
    public  void unRegister(Observer o);
    public  void notifyObserver();
    
}
