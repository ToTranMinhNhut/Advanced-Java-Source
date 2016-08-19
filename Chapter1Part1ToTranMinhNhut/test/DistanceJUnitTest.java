/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Shape.Point;
import Shape.Distance;
/**
 * @version 1.0
 * @author hv
 * @date 19/8/2016
 * @JUnitTest for distanceTwoPoint(Point B) method in Distance class
 */
public class DistanceJUnitTest {
    
    Point p1 = new Point();
    Point p2 = new Point();
    Distance dis = new Distance();
            
    public DistanceJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    /*
     Input: not
     Output: pass
     */
    @Test
    public void testDistanceTwoPoint1() {
        double ex = 1.4142;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: pass
     */
    @Test
    public void testDistanceTwoPoint2() {
        double ex = 1.4142;
        p1.setX(-1);
        p1.setY(-3);
        p2.setX(-2);
        p2.setY(-4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: pass
     */
    @Test
    public void testDistanceTwoPoint3() {
        double ex = 3.1622;
        p1.setX(-1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: pass
     */
    @Test
    public void testDistanceTwoPoint4() {
        double ex = 7.6157;
        p1.setX(-1);
        p1.setY(-3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: pass
     */
    @Test
    public void testDistanceTwoPoin5() {
        double ex = 3.1622;
        p1.setX(1);
        p1.setY(3);
        p2.setX(-2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: faile
     */
    @Test
    public void testDistanceTwoPoint6() {
        double ex = 1.414;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
     /*
     Input: not
     Output: faile
     */
    @Test
    public void testDistanceTwoPoint7() {
        double ex = -1.4142;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: faile
     */
    @Test
    public void testDistanceTwoPoint8() {
        double ex = 1;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: faile
     */
    @Test
    public void testDistanceTwoPoint9() {
        double ex = 1.4;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
    
    /*
     Input: not
     Output: faile
     */
    @Test
    public void testDistanceTwoPoint10() {
        double ex = 1.5;
        p1.setX(1);
        p1.setY(3);
        p2.setX(2);
        p2.setY(4);
        double ac = dis.distanceTwoPoints(p1,p2);
        assertEquals(ex, ac, 0.0001);
    }
}
