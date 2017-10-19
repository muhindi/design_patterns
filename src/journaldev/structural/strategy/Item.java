/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.strategy;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 27, 2017 1:49:48 PM
 * 
 */
public class Item {
    
    private String ipCode;
    private double price;

    public Item(String ipCode, double price) {
        this.ipCode = ipCode;
        this.price = price;
    }

    public String getIpCode() {
        return ipCode;
    }

    public double getPrice() {
        return price;
    }
}
