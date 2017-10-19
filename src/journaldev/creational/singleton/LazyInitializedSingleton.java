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
 * @date Jul 3, 2017 10:57:19 PM
 *
 * Singleton instance will be created when its needed. Notice: no instance created 
 * unless a client calls getInstance
 * However, this is not thread safe since in a multi-threaded environment, multiple 
 * threads coculd access the the method at the same time and end-up creating 
 * multiple instances of the singleton class.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
