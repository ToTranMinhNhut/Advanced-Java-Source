/**
 * 
 */
package ObjectProcess;

import java.util.Arrays;
import java.util.List;

/**
 * @author hv
 *
 */
public class ObjectProcessMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Student> students = Arrays.asList(new Student("18", 8, 8.5, "Alan"), new Student("19", 8.5, 7.5, "Joe"),
                new Student("17", 9.5, 8.25, "Adam"), new Student("20", 8.75, 7.75, "John"),
                new Student("17", 8, 9.25, "Max"), new Student("19", 8.5, 7.5, "Dan"),
                new Student("22", 9, 9.5, "Lee"), new Student("17", 8.5, 7.75, "Han"),
                new Student("20", 9, 8.75, "Hunter"), new Student("21", 8, 9.5, "Bruce"),
                new Student("18", 10, 8.5, "Hulk"), new Student("17", 8.5, 8.5, "Jo"));
        
        System.out.println("List of students: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        int count1 = (int) students.stream().filter(s -> Double.parseDouble(s.getAge()) >= 18).count();
        System.out.println("Number of students have old is greater than or equal to 18: " + count1);

    }

}
