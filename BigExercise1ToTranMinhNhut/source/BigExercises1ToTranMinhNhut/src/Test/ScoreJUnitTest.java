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

import ClassManagement.ActiveScore;
import ClassManagement.DiligentScore;
import ClassManagement.ExercisesScore;
import ClassManagement.Score;
import ClassManagement.ScoreOfExam;
import ClassManagement.Suject;

/**
 * @author minhnhutvaio
 * @version 1.0
 * @since 7/9/2016
 * 
 * JUnitTest for functions in Score class
 * Input nothing
 * Output pass
 */
public class ScoreJUnitTest {
    
    Score score = new Score();
    
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

    @Test
    public void testCalScoreClassPeriod1() {
        double ex = 10;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(10);
        ExercisesScore eS = new ExercisesScore(10);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        
        double ac = score.calScoreClassPeriod();
        
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalScoreClassPeriod2() {
        double ex = 9;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(9.5);
        ExercisesScore eS = new ExercisesScore(10);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        
        double ac = score.calScoreClassPeriod();
        
        assertNotEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalScoreClassPeriod3() {
        double ex = 9;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(9.5);
        ExercisesScore eS = new ExercisesScore(9);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        
        double ac = score.calScoreClassPeriod();
        
        assertNotEquals(ex, ac, 0);
    }
    
    @Test
    public void calScorePersonalOfSuject1() {
        double ex = 10;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(10);
        ExercisesScore eS = new ExercisesScore(10);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void calScorePersonalOfSuject2() {
        double ex = 10;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(10);
        ExercisesScore eS = new ExercisesScore(9.5);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertNotEquals(ex, ac, 0);
    }
    
    @Test
    public void calScorePersonalOfSuject3() {
        double ex = 9;
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(9);
        ExercisesScore eS = new ExercisesScore(9);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertNotEquals(ex, ac, 0);
    }
    
    @Test
    public void calScoreFinishSuject1() {
        double ex = 10;
        
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(10);
        ExercisesScore eS = new ExercisesScore(10);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        ScoreOfExam sE = new ScoreOfExam();
        sE.setScoreMultipleChoiceTest(10);
        sE.setScorePracticeTest(10);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        score.setScoreOfExam(sE);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void calScoreFinishSuject2() {
        double ex = 10;
        
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(9.5);
        ExercisesScore eS = new ExercisesScore(9.8);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        ScoreOfExam sE = new ScoreOfExam();
        sE.setScoreMultipleChoiceTest(10);
        sE.setScorePracticeTest(10);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        score.setScoreOfExam(sE);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertNotEquals(ex, ac, 0);
    }
    
    @Test
    public void calScoreFinishSuject3() {
        double ex = 9;
        
        DiligentScore dS = new DiligentScore(10);
        ActiveScore aS = new ActiveScore(9);
        ExercisesScore eS = new ExercisesScore(9);
        Suject s = new Suject();
        s.setNumOfperiod(40);
        ScoreOfExam sE = new ScoreOfExam();
        sE.setScoreMultipleChoiceTest(9);
        sE.setScorePracticeTest(9.5);
        
        score.setActiveScore(aS);
        score.setDiligentScore(dS);
        score.setExercisesScore(eS);
        score.setSubject(s);
        score.setScoreOfExam(sE);
        
        double ac = score.calScorePersonalOfSuject();
        
        assertNotEquals(ex, ac, 0);
    }
}
