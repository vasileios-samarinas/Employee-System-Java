import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Vasilis","QQ 12 34 56 A",20000,"Corporate Actions");
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Corporate Actions",manager.getDeptName());
    }


}
