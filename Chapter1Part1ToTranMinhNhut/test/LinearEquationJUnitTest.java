/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chapter1part1totranminhnhut.LinearEquation.LinearEquation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import chapter1part1totranminhnhut.LinearEquation.LinearEquation;
/**
 *  This class test for evalueteRoot() method in LinearEquation class
 * @author hv
 * @date: 19/8/2016
 * @version: 1.0
 */
public class LinearEquationJUnitTest {
    LinearEquation linEq = new LinearEquation();
    
    public LinearEquationJUnitTest() {
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
    @Test
    public void testEvalueteRoot1() {
        double ex = 1;
        linEq = new LinearEquation(0, 0);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[1], 0);
    }
    
    @Test
    public void testEvalueteRoot2() {
        double ex = 1;
        linEq = new LinearEquation(0, 2);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[0], 0);
    }
    
    @Test
    public void testEvalueteRoot3() {
        double ex = -4;
        linEq = new LinearEquation(1, 4);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
    
    @Test
    public void testEvalueteRoot4() {
        double ex = 1.5;
        linEq = new LinearEquation(2, -3);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
    
    @Test
    public void testEvalueteRoot5() {
        double ex = -7;
        linEq = new LinearEquation(2, 14);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
    
    @Test
    public void testEvalueteRoot6() {
        double ex = 2;
        linEq = new LinearEquation(0, 0);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[1], 0);
    }
    
    @Test
    public void testEvalueteRoot7() {
        double ex = 2;
        linEq = new LinearEquation(0, 2);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[0], 0);
    }
    
    @Test
    public void testEvalueteRoot8() {
        double ex = 4;
        linEq = new LinearEquation(1, 4);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
    
    @Test
    public void testEvalueteRoot9() {
        double ex = 2.5;
        linEq = new LinearEquation(2, -3);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
    
    @Test
    public void testEvalueteRoot10() {
        double ex = 8;
        linEq = new LinearEquation(2, 14);
        double[] ac = linEq.evalueteRoot();
        assertEquals(ex, ac[2], 0);
    }
}
