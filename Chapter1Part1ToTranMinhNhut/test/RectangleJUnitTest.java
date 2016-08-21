/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Shape.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Shape.Rectangle;

/**
 * 
 * @author minhnhutvaio
 * @version 1.0
 * @date 20/8/2016
 * 
 */
public class RectangleJUnitTest {
    
    Rectangle rec = new Rectangle();
    Point startPoint = new Point();
    Point endPoint = new Point();
    
    public RectangleJUnitTest() {
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
     * JUnitTest for calPerimeterRectangle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalPerimeterRectangle1() {
        double ex = 8;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calPerimeterRectangle(startPoint, endPoint);
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calPerimeterRectangle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalPerimeterRectangle2() {
        double ex = 8;
        
        startPoint.setX(-1);
        startPoint.setY(-1);
        endPoint.setX(-3);
        endPoint.setY(-3);
        
        double ac = rec.calPerimeterRectangle(startPoint, endPoint);
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calPerimeterRectangle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalPerimeterRectangle3() {
        double ex = -8;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calPerimeterRectangle(startPoint, endPoint);
        assertNotEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calPerimeterRectangle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalPerimeterRectangle4() {
        double ex = 8;
        
        startPoint.setX(-1);
        startPoint.setY(-1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calPerimeterRectangle(startPoint, endPoint);
        assertNotEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calAreaRactanle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalAreaRectangle1() {
        double ex = 4;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calAreaRectangle(startPoint, endPoint);
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calAreaRactanle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalAreaRectangle2() {
        double ex = 4;
        
        startPoint.setX(-1);
        startPoint.setY(-1);
        endPoint.setX(-3);
        endPoint.setY(-3);
        
        double ac = rec.calAreaRectangle(startPoint, endPoint);
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calAreaRactanle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalAreaRectangle3() {
        double ex = -4;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calAreaRectangle(startPoint, endPoint);
        assertNotEquals(ex, ac, 0);
    }
    
    /*
     * JUnitTest for calAreaRactanle method in Rectangle class
     * Input: not
     * Output: pass
    */
    @Test
    public void testcalAreaRectangle4() {
        double ex = 4;
        
        startPoint.setX(-1);
        startPoint.setY(1);
        endPoint.setX(3);
        endPoint.setY(3);
        
        double ac = rec.calAreaRectangle(startPoint, endPoint);
        assertNotEquals(ex, ac, 0);
    }
}
