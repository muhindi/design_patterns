/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 12, 2017 8:42:00 AM
 */
 
public class Institution implements Cloneable{

    private List<Employee> employeeDirectory;

    public Institution() {
        employeeDirectory = new ArrayList<>();
    }

    public Institution(List<Employee> employees) {
        this.employeeDirectory = employees;
    }

        public List<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(List<Employee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    //this could be a resource intensive read from the database
    public void loadEmployeeData(){
        employeeDirectory.add(new Employee("2345","Xavier","Monterry"));
        employeeDirectory.add(new Employee("6542","Pier","Desnot"));
        employeeDirectory.add(new Employee("6732","Khan","LeDio"));
        employeeDirectory.add(new Employee("8943","Leshia","Ovuer"));
    }
    
    
    //override method to provide a deep copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<Employee> list = new ArrayList<>();
        for (Employee employee : getEmployeeDirectory()) {
            list.add(employee);
        }
        return new Institution(list);
    }
    
}
