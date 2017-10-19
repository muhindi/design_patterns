/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package journaldev.structural.adapter;

/**
 *
 * @author kelly
 * Adapter inteface to provide 120V,12V and 3V voltage 
 */
public interface SocketAdaptor {
    
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
