/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.factory;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 5, 2017 10:03:10 PM
 * 
 * Notes:
 * Usage: A decision must be made at runtime which one of several compatible classes is to
 * be instatiated. A superclass exists with multiple subclasses and based on input a certain
 * subclass needs to be returned.
 * The pattern takes the responsibility of instantiation from the client to the factory class.
 * The factory class can be a Singleton or the the method that returns the 
 * subclass declared as static
 * Based on the input parameter, a different subclass is returned.
 * Useful when the objects to be instantiated are not known until runtime
 */

/*The superclass can be an interface, abstract class or plain class*/
public class ComputerFactory {

    public static Computer getComputer(String type,String ram,String hdd,String cpu){
        if(type.equalsIgnoreCase("PC")) return new PersonalComputer(ram,hdd,cpu);
        else if(type.equalsIgnoreCase("Server"))return new Server(ram, hdd, cpu);
        return null;
    }
}

/*
Benefits of the factory pattern
Provide approach to code for interface rather than implementation
Remove instaciation of the actual impl classes from client code making it more robust,
less coupled and easy to extend.

*/
