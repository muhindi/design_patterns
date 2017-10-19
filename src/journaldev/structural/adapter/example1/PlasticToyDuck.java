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
 * @date Jul 14, 2017 9:50:04 AM
 * 
 */
public class PlasticToyDuck implements ToyDuck{

    @Override
    public void squeak() {
        System.out.println("Squeak...Squeak");
    }

}
