/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class Student extends Human {

    private String studyClass;
    private float scoreFirstSemester;
    private float scoreSecondSemester;

    public Student() {
    }

    public Student(String studyClass, float scoreFirstSemester, float scoreSecondSemester, String name, String birthday, String address, String phoneNumber) {
        super(name, birthday, address, phoneNumber);
        this.studyClass = studyClass;
        this.scoreFirstSemester = scoreFirstSemester;
        this.scoreSecondSemester = scoreSecondSemester;
    }

    public String getStudyClass() {
        return studyClass;
    }

    public void setStudyClass(String studyClass) {
        this.studyClass = studyClass;
    }

    public float getScoreFirstSemester() {
        return scoreFirstSemester;
    }

    public void setScoreFirstSemester(float scoreFirstSemester) {
        this.scoreFirstSemester = scoreFirstSemester;
    }

    public float getScoreSecondSemester() {
        return scoreSecondSemester;
    }

    public void setScoreSecondSemester(float scoreSecondSemester) {
        this.scoreSecondSemester = scoreSecondSemester;
    }

    /*
     * This method input information a teacher, and it's override inputInformation() method in Human clas
     * Input: not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter class that student study: ");
            studyClass = input.readLine();

            System.out.println("Please enter score in first semester of student: ");
            scoreFirstSemester = Float.parseFloat(input.readLine());

            System.out.println("Please enter score in second semester of student: ");
            scoreSecondSemester = Float.parseFloat(input.readLine());

        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * This method calculate average score a student
     * Input: not
     * Output: return average score value has float type
     */
    public float calAverageScore() {
        return (scoreFirstSemester + scoreSecondSemester) / 2;
    }

    /* 
     * This method print information a student
     * Input: not
     * Output: return information value has String type
     */
    @Override
    public String printInformation() {
        float averageScore = calAverageScore();
        
        return super.printInformation() + "\n| The class: " + studyClass 
                + "| Score first semester: " + scoreFirstSemester + "| Score second semester: " + scoreSecondSemester
                +"\n|Average score: " + averageScore;
    }

}
