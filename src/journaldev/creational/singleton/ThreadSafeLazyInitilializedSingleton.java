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
 * @date Jul 4, 2017 6:29:42 PM
 * 
 * Threadsafe singleton method...
 * can also be implemented by using 'double checked locking' principal
 */
public class ThreadSafeLazyInitilializedSingleton {
    
    private static ThreadSafeLazyInitilializedSingleton instance;
    
    private ThreadSafeLazyInitilializedSingleton(){}

    public synchronized static ThreadSafeLazyInitilializedSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazyInitilializedSingleton();
        }
        return instance;
    }

}
