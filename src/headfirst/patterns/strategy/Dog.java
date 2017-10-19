/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 3:48:27 PM  : Nov 26, 2015
 */
package headfirst.patterns.strategy;

/**
 *
 * @author kelli
 */
public class Dog extends Animal{
    
    public Dog(){
        super();
        setSound("Bark");
        setFlyAbility(new CannotFly());
    }
    
}
