/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 27, 2017 1:58:24 PM
 * 
 */
public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Bananas", 140.00));
        cart.addItem(new Item("Oranges", 56.00));
        cart.addItem(new Item("Grapes", 83.50));
        cart.addItem(new Item("Melons", 230.00));
        
        //pay via creadit card
        cart.pay(new CreditCardPayment("Allex Mwas","8934-47426-3234-22", "8437263643",
                GregorianCalendar.getInstance()));
        
        //pay via paypal
        Item x = new Item("Mangoes",30.00);
        cart.addItem(x);
        cart.pay(new PaypalPayment("jmd@gmail.com", "mypass894"));
    }
}
