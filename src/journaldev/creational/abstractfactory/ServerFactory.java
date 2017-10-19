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
public class ServerFactory implements ComputerAbstractFactory{
    
    private String ram;
    private String hdd;
    private String cpu;
    
    public ServerFactory(String ram,String hdd,String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

//    @Override
    public Computer createComputer() {
        return new journaldev.creational.abstractfactory.Server(ram,hdd,cpu);
    }

}
