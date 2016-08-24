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

import Transport.Car;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * JUnit Test for calConsumptionFuel() method and calSpeed() method in Car class
 * Input's all function: not
 * Output' all function: pass
 */
public class CarJUnitTest {
    
    Car car = new Car();
    
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
        
        car.setDistance(60);
        car.setLitresFuel(2);
        
        double ac = car.calcConsumptionFuel();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel2() {
        double ex = 40;
        
        car.setDistance(60);
        car.setLitresFuel(1.5);
        
        double ac = car.calcConsumptionFuel();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel3() {
        double ex = 40;
        
        car.setDistance(60);
        car.setLitresFuel(2);
        
        double ac = car.calcConsumptionFuel();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalConsumptionFuel4() {
        double ex = 45;
        
        car.setDistance(60);
        car.setLitresFuel(1.5);
        
        double ac = car.calcConsumptionFuel();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed1() {
        double ex = 40;
        
        car.setDistance(80);
        car.setTime(2);
        
        double ac = car.calSpeed();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed2() {
        double ex = 50;
        
        car.setDistance(100);
        car.setTime(2);
        
        double ac = car.calSpeed();
        assertEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed3() {
        double ex = 30.5;
        
        car.setDistance(60);
        car.setTime(2);
        
        double ac = car.calSpeed();
        assertNotEquals(ex, ac, 0);
    }
    
    @Test public void testCalSpeed4() {
        double ex = 40.5;
        
        car.setDistance(60);
        car.setTime(1.5);

        double ac = car.calSpeed();
        assertNotEquals(ex, ac, 0);
    }

}
