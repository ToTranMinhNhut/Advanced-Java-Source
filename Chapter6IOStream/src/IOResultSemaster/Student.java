/**
 * 
 */
package IOResultSemaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author hv
 * @version 1.0
 * @sine 14/9/2016
 */
public class Student implements Comparable<Student>{

    private String name;
    private int grade;
    private double semaster1;
    private double semaster2;

    
    public Student() {
        super();
    }

    public Student(String name, int grade, double semaster1, double semaster2) {
        super();
        this.name = name;
        this.grade = grade;
        this.semaster1 = semaster1;
        this.semaster2 = semaster2;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the semaster1
     */
    public double getSemaster1() {
        return semaster1;
    }

    /**
     * @param semaster1 the semaster1 to set
     */
    public void setSemaster1(double semaster1) {
        this.semaster1 = semaster1;
    }

    /**
     * @return the semaster2
     */
    public double getSemaster2() {
        return semaster2;
    }

    /**
     * @param semaster2 the semaster2 to set
     */
    public void setSemaster2(double semaster2) {
        this.semaster2 = semaster2;
    }
    
    /*
     * This method is used calculating average mark of a student
     * Input nothing
     * Output return avg value has double type
     */
    public double calAverageMark() {
        double avg = (semaster1 + semaster2 * 2) / 3;
        DecimalFormat df = new DecimalFormat("###.##");
        avg = Double.parseDouble(df.format(avg));
        return avg;
     }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     * This method is used for returning information a student
     * Input nothing
     * Out return a string
     */
    @Override
    public String toString() {
        return name + "\t" + grade + "\t" + semaster1 + "\t" + semaster2 + "\t" +calAverageMark();
    }

    /*
     * This is used for inputing information a student
     * Input nothing
     * Output nothing
     * 
     */
    public void inputStudent() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter name of student: ");
            name = input.readLine();
            
            System.out.println("Please enter grade of student: ");
            grade = Integer.parseInt(input.readLine());
            
            System.out.println("Please enter mark semaster 1 of student: ");
            semaster1 = Double.parseDouble(input.readLine());
            
            System.out.println("Please enter mark semaster 2 of student: ");
            semaster2 = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * 
     * This method is used for comparing two student by grade's student
     */
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.grade, o.grade);
    }
}
