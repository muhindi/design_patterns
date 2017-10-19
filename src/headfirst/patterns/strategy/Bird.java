/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 3:48:40 PM  : Nov 26, 2015
 */
package headfirst.patterns.strategy;

/**
 *
 * @author kelli
 */
public class Bird extends Animal{
    
    public Bird(){
        super();
        setSound("Chirps");
        setFlyAbility(new ItFlys());
    }
}
