/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.strategy;

import java.util.Calendar;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 27, 2017 1:45:38 PM
 * 
 */
public class CreditCardPayment implements PaymentStrategy{

    private String name;
    private String cardNUmber;
    private String cvv;
    private Calendar dateOfExpiry;

    public CreditCardPayment(String name, String cardNUmber, String cvv, Calendar dateOfExpiry) {
        this.name = name;
        this.cardNUmber = cardNUmber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println(" Paid with credit card");
    }

}
