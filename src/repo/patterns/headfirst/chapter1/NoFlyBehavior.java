/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package repo.patterns.headfirst.chapter1;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 26, 2017 11:51:29 PM
 * 
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("<<Cannot Fly>>");
    }

}
