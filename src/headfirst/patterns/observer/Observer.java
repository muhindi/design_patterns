/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 5:29:40 PM  : Nov 26, 2015
 */
package headfirst.patterns.observer;

/**
 *
 * @author kelli
 */
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
