/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 3:53:15 PM  : Nov 26, 2015
 */
package headfirst.patterns.strategy;

/**
 *
 * @author kelli
 */
public interface Flys {
    String flys();
}

class ItFlys implements Flys{

    @Override
    public String flys() {
        return "It can Fly";
    }
    
}

class CannotFly implements Flys{
    @Override
    public String flys() {
        return "It cannot Fly";
    }
}