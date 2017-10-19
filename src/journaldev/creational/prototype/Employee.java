/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.prototype;

import java.util.List;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 12, 2017 8:33:39 AM
 * 
 */

public class Employee implements Cloneable{
    
    private String empId;
    private String fName;
    private String lName;

    public Employee(String empId, String fName, String lName) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    @Override
    public String toString(){
        return getEmpId()+"\t"+getfName()+"\t"+getlName();
    }

}
