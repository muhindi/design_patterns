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
 * @date Jul 14, 2017 9:47:44 AM
 * 
 */
public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp...Chirp");
    }

}
