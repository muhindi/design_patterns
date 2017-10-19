/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.abstractfactory;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 5, 2017 10:32:44 PM
 * 
 */
public class PCFactory implements ComputerAbstractFactory{
    
    private String ram;
    private String hdd;
    private String cpu;
    
    public PCFactory(String ram,String hdd,String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PersonalComputer(ram,hdd,cpu);
    }

}
