/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package journaldev.creational.abstractfactory;


/**
 *
 * @author kelly
 * method returns a super class computer. Factory classes will implement this
 * interface and return their respective subclass
 */
public interface ComputerAbstractFactory {
    Computer createComputer();
}
