/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.factory;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 5, 2017 9:53:48 PM
 * 
 */
public abstract class Computer {

    public abstract String getRam();
    public abstract String getDisk();
    public abstract String getCPU();
    
    @Override
    public String toString(){
        return "RAM= "+this.getRam()+", CPU= "+this.getCPU()+", HDD= "+this.getDisk();
    }
}
