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
 * @date Jul 5, 2017 9:58:04 PM
 * 
 */
public class PersonalComputer extends Computer{
    
    private String ram;
    private String hdd;
    private String cpu;
    
    public PersonalComputer(String ram,String hdd,String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getDisk() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
