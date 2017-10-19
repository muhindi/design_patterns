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
 * @date Jul 3, 2017 10:49:37 PM
 * 
 * Similar to eagerly initialized singleton except that an instance of the 
 * class is created in a static block that provides an option for exception
 * handling
 */ 
public class EagerInitializedStaticBlockSingleton {

    private static EagerInitializedStaticBlockSingleton instance;
    
    //static block
    static{
        try{
            instance = new EagerInitializedStaticBlockSingleton();
        }
        catch (Exception exception){
            throw new RuntimeException("Exception in creating singleton");
        }
    }
    
    public static EagerInitializedStaticBlockSingleton getInstance(){
        return instance;
    }

}
