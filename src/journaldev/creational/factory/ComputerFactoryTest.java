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
 * @date Jul 5, 2017 10:12:45 PM
 * 
 */
public class ComputerFactoryTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2GB", "250GB", "2.3GHz");
        Computer server = ComputerFactory.getComputer("Server", "16GB", "750GB", "3.3GHz");
        if(pc != null && server != null){
            System.out.println(pc);
            System.out.println(server);
            }
    }
}
