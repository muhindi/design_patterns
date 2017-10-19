/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 27, 2017 1:51:04 PM
 * 
 */
public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList();
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }
    
    private double calculateTotal(){
        double totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }
    
    public void pay(PaymentStrategy paymentMethod){
        double total = calculateTotal();
        System.out.print("Total = "+total);
        paymentMethod.pay(total);
    }
}
