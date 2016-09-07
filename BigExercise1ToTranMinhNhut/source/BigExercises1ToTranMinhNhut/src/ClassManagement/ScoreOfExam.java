package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * This class is used for processing businesses of instance score exam
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:42 PM
 */
public class ScoreOfExam {

    private double scoreMultipleChoiceTest;
    private double scorePracticeTest;

    public ScoreOfExam(){
    }

    /**
     * @return the scoreMultipleChoiceTest
     */
    public double getScoreMultipleChoiceTest() {
        return scoreMultipleChoiceTest;
    }

    /**
     * @param scoreMultipleChoiceTest the scoreMultipleChoiceTest to set
     */
    public void setScoreMultipleChoiceTest(double scoreMultipleChoiceTest) {
        this.scoreMultipleChoiceTest = scoreMultipleChoiceTest;
    }

    /**
     * @return the scorePracticeTest
     */
    public double getScorePracticeTest() {
        return scorePracticeTest;
    }

    /**
     * @param scorePracticeTest the scorePracticeTest to set
     */
    public void setScorePracticeTest(double scorePracticeTest) {
        this.scorePracticeTest = scorePracticeTest;
    }

    /*
     * This method is used for input scores of examination
     * Input: nothing
     * Output: nothing
     */
    void inputScore() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter score of multiple choice test:");
            scoreMultipleChoiceTest = Double.parseDouble(input.readLine());
            
            System.out.println("Please enter score of pratice test:");
            scorePracticeTest = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    /*
     * This method is used for printing examination score
     * Input: nothing
     * Output: nothing
     */
    void println() {
        System.out.println("Multiple choice score: " + scoreMultipleChoiceTest);
        System.out.println("Practice test score: " + scorePracticeTest);

    }
}