/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.singleton;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 4, 2017 6:58:55 PM
 * 
 * some guy named Bill Pugh implemented the singleton pattern this way...years ago
 * when the outer class is loaded, the private static inner class is not. only 
 * when someone calls the getInstance() method is the helper class loaded and creates
 * the singleton instance.
 */
public class BillPughSingletonImpl {

    
    private BillPughSingletonImpl(){}
    
    //inner class
    private static class SingletonHelper{
        private static final BillPughSingletonImpl INSTANCE = 
                new BillPughSingletonImpl();
    }
    
    public static BillPughSingletonImpl getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
