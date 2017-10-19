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
 * @date Jul 26, 2017 11:32:56 PM
 * 
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){}
    
    public void setFlyBehavior(FlyBehavior behavior){
        this.flyBehavior = behavior;
    }
    
    public void setQuackBehavior(QuackBehavior behavior){
        this.quackBehavior = behavior;
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("All ducks swim!");
    }
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }

}
