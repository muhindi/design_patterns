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
 * @date Jul 3, 2017 10:31:34 PM
 * 
 * Concepts of the Singleton design pattern:
 * =============================================================================
 *      private static variable of the same class type that is the only instance
 *      of the class.
 *      Private constructor to restrict the instantiation of the the class from 
 *      other classes.
 *      Public static method that returns an instance of the class, acts as the 
 *      global access point to get the instance of the singleton class
 * 
 * =============================================================================
 * Uses: logging, driver objects,caching,thread pooling,database connection,file
 *       system, 
 */
public class EagerInitializedSingleton {

    //static variable 
    private static EagerInitializedSingleton instance = 
            new EagerInitializedSingleton();
    
    //private constructor
    private EagerInitializedSingleton(){}
    
    //public static method to provide single instance
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
}

/*
* Weakness of this approach:
* If the singleton instance uses a lot of resources, early initialization may be wasteful 
* since the instance is not in use immediately
* Does not provide options for exception handling
* 
*/
