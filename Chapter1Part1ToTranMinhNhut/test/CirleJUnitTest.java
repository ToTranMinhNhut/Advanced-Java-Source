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
import Shape.Cirle;
import Shape.Point;
import Shape.Distance;

/**
 * @version 1.0
 * @author hv
 * @date 19/8/2016
 */
public class CirleJUnitTest {
    
    Cirle cirle = new Cirle();
    Point startPoint = new Point();
    Point endPoint = new Point();
    Distance distance = new Distance();
    
    public CirleJUnitTest() {
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
    //
    
    /*
     * JUnitTest for calculatorPerimeterCirle() method in Cirle
     * Input: not
     * Output: test pass
    */
    @Test
    public void testCalPerimeter1() {
        double ex = 19.86;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.calculatePerimeterCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorPerimeterCirle() method in Cirle
     * Input: not
     * Output: test pass
    */
    @Test
    public void testCalPerimeter2() {
        double ex = 19.86;
        
        startPoint.setX(-1);
        startPoint.setY(-1);
        endPoint.setX(-2);
        endPoint.setY(-4);
        
        double ac = cirle.calculatePerimeterCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorPerimeterCirle() method in Cirle
     * Input: not
     * Output: test faile
    */
    @Test
    public void testCalPerimeter3() {
        double ex = 19;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.calculatePerimeterCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorPerimeterCirle() method in Cirle
     * Input: not
     * Output: test faile
    */
    @Test
    public void testCalPerimeter4() {
        double ex = 19.86;
        
        startPoint.setX(-1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.calculatePerimeterCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 01);
    }
    
    /*
     * JUnitTest for calculatorAreaCirle() method in Cirle
     * Input: not
     * Output: test pass
    */
    @Test
    public void testCalArea1() {
        double ex = 31.41;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.caculateAreaCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorAreaCirle() method in Cirle
     * Input: not
     * Output: test pass
    */
    @Test
    public void testCalArea2() {
        double ex = 31.41;
        
        startPoint.setX(-1);
        startPoint.setY(-1);
        endPoint.setX(-2);
        endPoint.setY(-4);
        
        double ac = cirle.caculateAreaCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorAreaCirle() method in Cirle
     * Input: not
     * Output: test faile
    */
    @Test
    public void testCalArea3() {
        double ex = 31;
        
        startPoint.setX(1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.caculateAreaCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
    
    /*
     * JUnitTest for calculatorAreaCirle() method in Cirle
     * Input: not
     * Output: test faile
    */
    @Test
    public void testCalArea4() {
        double ex = 31.41;
        
        startPoint.setX(-1);
        startPoint.setY(1);
        endPoint.setX(2);
        endPoint.setY(4);
        
        double ac = cirle.caculateAreaCirle(distance, startPoint, endPoint);
        assertEquals(ex, ac, 0.01);
    }
}
