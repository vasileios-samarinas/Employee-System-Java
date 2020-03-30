import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp(){
        employee = new Manager("Vasilis","QQ 12 34 56 A",20000,"Corp Actions");
    }

    @Test
    public void canGetName(){ assertEquals("Vasilis",employee.getName()); }

    @Test
    public void hasNiNo(){
        assertEquals("QQ 12 34 56 A",employee.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.0,employee.getSalary(),0.01);
    }


    @Test
    public void hasRaisedSalary(){
        employee.raiseSalary(100);
        assertEquals(20100,employee.getSalary(),0.01);
    }

    @Test
    public void hasNotRaisedSalary(){
        employee.raiseSalary(-50);
        assertEquals(20000,employee.getSalary(),0.01);
    }

    @Test
    public void managerHasBeenPaidBonus(){
        assertEquals(200,employee.payBonus(),0.01);
    }

    @Test
    public void userCanChangeName(){
        employee.setName("Mike");
        assertEquals("Mike",employee.getName());
    }

    @Test
    public void userCannotChangeName(){
        employee.setName(null);
        assertEquals("Vasilis",employee.getName());
    }


}
