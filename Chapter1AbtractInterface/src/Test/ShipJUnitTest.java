/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Transport.Ship;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * JUnit Test for calConsumptionFuel() method and calSpeed() method in Ship class
 * Input's all function: not
 * Output' all function: pass
 */
public class ShipJUnitTest {
    
    Ship ship = new Ship();
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    
    @Test public void testCalConsumptionFuel1() {
        double ex = 30;
        
        ship.setDistance(60);
        ship.setLitresFuel(2);
        ship.setconsumptionFuelStart(0.1f);
        
        double ac = ship.calcConsumptionFuel();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel2() {
        double ex = 40;
        
        ship.setDistance(60);
        ship.setLitresFuel(1.5);
        
        double ac = ship.calcConsumptionFuel();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel3() {
        double ex = 40;
        
        ship.setDistance(60);
        ship.setLitresFuel(2);
        
        double ac = ship.calcConsumptionFuel();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel4() {
        double ex = 45;
        
        ship.setDistance(60);
        ship.setLitresFuel(1.5);
        
        double ac = ship.calcConsumptionFuel();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed1() {
        double ex = 40;
        
        ship.setDistance(80);
        ship.setTime(2);
        
        double ac = ship.calSpeed();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed2() {
        double ex = 50;
        
        ship.setDistance(100);
        ship.setTime(2);
        
        double ac = ship.calSpeed();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed3() {
        double ex = 30.5;
        
        ship.setDistance(60);
        ship.setTime(2);
        
        double ac = ship.calSpeed();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed4() {
        double ex = 40.5;
        
        ship.setDistance(60);
        ship.setTime(1.5);

        double ac = ship.calSpeed();
        assertNotEquals(ex, ac, 0);
    }


}
