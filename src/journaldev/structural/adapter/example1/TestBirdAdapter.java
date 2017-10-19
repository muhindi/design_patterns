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
 * @date Jul 14, 2017 9:58:37 AM
 * 
 */
public class TestBirdAdapter {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        
        sparrow.fly();
        sparrow.makeSound();
        
        toyDuck.squeak();
        
        //wrap a bird in a bird adapter so that it behaves like a toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        
        //now bird behaves like a toyduck
        birdAdapter.squeak();
    }
}
