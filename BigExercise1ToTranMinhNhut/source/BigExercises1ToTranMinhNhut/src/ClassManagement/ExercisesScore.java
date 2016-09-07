package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:45 PM
 */
public class ExercisesScore {

	private double exerciseScore;

	public ExercisesScore(){

	}
	
    public ExercisesScore(double exerciseScore) {
        super();
        this.exerciseScore = exerciseScore;
    }

    /**
     * @return the exerciseScore
     */
    public double getExerciseScore() {
        return exerciseScore;
    }

    /**
     * @param exerciseScore the exerciseScore to set
     */
    public void setExerciseScore(double exerciseScore) {
        this.exerciseScore = exerciseScore;
    }

    /*
     * This method is used for input exercise score
     * Input: nothing
     * Output: nothing
     */
    void inputScore() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter exercises score:");

        try {
            exerciseScore = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing exercises score
     * Input: nothing
     * Output: nothing
     */
    void println() {
        System.out.println("Exercises score: " + exerciseScore);
    }
}