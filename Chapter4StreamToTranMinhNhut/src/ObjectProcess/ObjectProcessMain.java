/**
 * 
 */
package ObjectProcess;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
                new Student("17", 9.5, 8.25, "Adam"), new Student("20", 6.75, 7.75, "John"),
                new Student("17", 8, 9.25, "Max"), new Student("19", 6.5, 7.5, "Dan"),
                new Student("22", 6, 9.5, "Lee"), new Student("17", 7.5, 7.75, "Han"),
                new Student("20", 9, 8.75, "Hunter"), new Student("21", 8, 9.5, "Bruce"),
                new Student("18", 10, 8.5, "Hulk"), new Student("17", 8.5, 8.5, "Jo"));
        
        System.out.println("List of students: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        // count number of students have old >= 18
        int count1 = (int) students.stream().filter(s -> Double.parseDouble(s.getAge()) >= 18).count();
        System.out.println("Number of students have old is greater than or equal to 18: " + count1);
        
        // count number of students have first char in their name is H.
        int count2 = (int) students.stream().filter(i -> i.getName().startsWith("H")).count();
        System.out.println("Number of students have first char in their name is H: " + count2);
        
        Optional<Student> st = students.stream().filter(i -> i.getName().startsWith("H")).findFirst();
        if(st.isPresent()) {
            System.out.println("The first student: " + st.get());
        }
        
        DoubleSummaryStatistics stats = students.stream().mapToDouble(i -> i.calAvergeMark()).summaryStatistics();
        
        System.out.println("Highest mark in list: " + stats.getMax());
        System.out.println("Lowest mark in list: " + stats.getMin());
        System.out.println("Averge all of averge mark in list: " + stats.getAverage());

        List<Student> students2 = students.stream().filter(i -> i.calAvergeMark() >= 8).collect(Collectors.toList());
        System.out.println("List of very good students: ");
        for (Student student : students2) {
            System.out.println(student);
        }
    }

}
