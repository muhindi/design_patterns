/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.prototype;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 12, 2017 8:53:09 AM
 * 
 */
public class TestPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        Institution institution = new Institution();
        institution.loadEmployeeData(); //read from database, the list of employees
        
        //save resources to get a new object of the institution by using its 
        // clone method
        
        Institution institution2 = (Institution)institution.clone();
        institution2.getEmployeeDirectory().add(new Employee("9958", "Rashid", "Omar"));
        
        //check the entries in the list to verify
        System.out.println("---------------------------------------------------");
        System.out.println("Employees in Instution 1: "+institution.getEmployeeDirectory().size());
        System.out.println("---------------------------------------------------");
        for (Employee emp : institution.getEmployeeDirectory()) {
            System.out.println(emp);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Employees in Instution 2: "+institution2.getEmployeeDirectory().size());
        System.out.println("---------------------------------------------------");
        for (Employee emp : institution2.getEmployeeDirectory()) {
            System.out.println(emp);
        }
    }
}
