/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.abstractfactory;


/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 5, 2017 10:39:16 PM
 * 
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
