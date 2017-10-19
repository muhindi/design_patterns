/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.adapter.example1;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 14, 2017 9:51:23 AM
 * 
 */
public class BirdAdapter implements ToyDuck{

    Bird bird;

    //reference the object we are adapting
    public BirdAdapter(Bird bird){
        this.bird = bird;
    }
    
    //implement the interface clients expect to see.
    //clients expect to see this as the interface
    @Override
    public void squeak() {
        //transalte the method appropriately
        bird.makeSound();
    }

}
