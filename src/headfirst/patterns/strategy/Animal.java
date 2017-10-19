/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 3:43:25 PM  : Nov 26, 2015
 */
package headfirst.patterns.strategy;

/**
 *
 * @author kelli
 * 
 * The Stategy Design Pattern:
 * Define a family of algorithms, encapsulate each and make them inter-changable
 * the patterns lets the algorithms vary independently from clients that us it.
 * Usage:
 * =============================
 * 1. When you want to define a class that has one behavior that is similar to 
 * other behaviors in a list
 * 2. When you need to use on of the several behaviors dynamically
 */
public class Animal {
    private String name;
    private double height;
    private int weight ;
    private String favFood;
    private String sound;
    //create a member of an interface type 
    // this member will be set in the subclasses of class Animal
    // using desired implementations of the interface to suit the desired behavior
    private Flys flyState;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the favFood
     */
    public String getFavFood() {
        return favFood;
    }

    /**
     * @param favFood the favFood to set
     */
    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the flyState
     */
    public String tryToFly() {
        return flyState.flys();
    }

    /**
     * @param newFlyState
     */
    public void setFlyAbility(Flys newFlyState) {
        this.flyState = newFlyState;
    }
    
    
}
