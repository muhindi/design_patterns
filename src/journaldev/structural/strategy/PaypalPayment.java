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
 * @date Jul 27, 2017 1:48:06 PM
 * 
 */
public class PaypalPayment implements PaymentStrategy{
    
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid with paypal");
    }

}
