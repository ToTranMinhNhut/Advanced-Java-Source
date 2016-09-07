/**
 * 
 */
package StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author minhnhutvaio
 * @version 1.0
 * @since 8/9/2016
 */
public class Student implements Comparable<Student>{

    private String id;
    private String name;
    private String age;
    private String placeOfBirth;
    
    public Student() {
        super();
    }

    public Student(String id, String name, String age, String placeOfBirth) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    
    
    /*
     * this method is used for inputing a student
     * Input nothing
     * Output nothing
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter id of student: ");
            id = input.readLine();
            
            System.out.println("Please enter name of student: ");
            name = input.readLine();
            
            System.out.println("Please enter age of student: ");
            age = input.readLine();
            
            System.out.println("Please enter place of bith's student: ");
            placeOfBirth = input.readLine();
            
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing a student
     * input nothing
     * Output nothing
     */
    public void printInformation() {
        System.out.println("Name of student: " + name);
        System.out.println("Age of student: " + age);
        System.out.println("Place of birth's student: " + placeOfBirth);
    }

    @Override
    public int compareTo(Student arg0) {
        return 0;
    }
}
