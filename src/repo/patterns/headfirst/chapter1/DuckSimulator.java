/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package repo.patterns.headfirst.chapter1;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 26, 2017 11:43:55 PM
 * 
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck;
        duck = new WildDuck();
        duck.flyBehavior = new FlyWithWingsBehavior();
        duck.quackBehavior = new Quack();
        System.out.println(duck);
        duck.performFly();
        duck.performQuack();
        
        System.out.println("------------------------------------");
        duck = new PlasticDuck();
        duck.flyBehavior = new NoFlyBehavior();
        duck.quackBehavior = new MutedQuack();
        System.out.println(duck);
        duck.performFly();
        duck.performQuack();
        
        System.out.println("------------------------------------");
        duck = new ModelDuck();
        System.out.println(duck);
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocketPoweredBehavior());
        System.out.println("Changing fly behavior of: "+duck);
        duck.performFly();
    }

}
