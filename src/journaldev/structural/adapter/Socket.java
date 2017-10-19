/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.adapter;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 18, 2017 10:15:02 PM
 * 
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
