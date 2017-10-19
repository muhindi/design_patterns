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
 * @date Jul 27, 2017 12:16:48 PM
 * 
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new NoFlyBehavior(); //on creation duck cannot fly
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

}
