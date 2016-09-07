package ClassManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:46 PM
 */
public class AppreciateSubject {

    private String comment;
    public Student student;

    public AppreciateSubject(){
        student = new Student();
    }
    
    
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }


    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }


    /*
     * This method is used for appreciating a student for a subject
     * Input: nothing
     * Output: nothing
     */
    void comment() throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your appreciation");
        try {
            comment = input.readLine();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing appreciate table of student
     * input nothing
     * Out nothing
     */
    void printTableAppreciate () {
        student.printScoreStudent();
        System.out.println("Comment: " + comment);
    }
}
