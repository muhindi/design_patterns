/*
 * Copyright 2015
 *  http://wazza.co.ke
 * 4:08:15 PM  : Nov 26, 2015
 */
package headfirst.patterns.strategy;

/**
 *
 * @author kelli
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        dog.setName("Tusker");
        bird.setName("Tweety");
        System.out.println("Dog Name: "+dog.getName());
        System.out.println("Dog Sound: "+dog.getSound());
        System.out.println("Bird Sound: "+bird.getSound());
        System.out.println("Bird Name: "+bird.getName());
        System.out.println("Bird Flies?: "+bird.tryToFly());
        System.out.println("Dog Flies?: "+dog.tryToFly());
    }
    
}
