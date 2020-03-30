package staff.management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String NiNumber, double salary,String deptName) {
        super(name, NiNumber, salary);
        this.deptName=deptName;

    }

    public String getDeptName() {
        return deptName;
    }

}
