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
 * @date Jul 26, 2017 11:40:30 PM
 * 
 */
public class MutedQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
    

}
