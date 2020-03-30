import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director=new Director("Bob","QQ 12 34 56 B",40000,"Investments",1000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000,director.getBudget(),0.01);
    }

    @Test
    public void hasHigherBonus(){
        assertEquals(800.0,director.payBonus(),0.01);
    }

}
