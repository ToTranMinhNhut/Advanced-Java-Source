/**
 * 
 */
package IOResultSemaster;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/**
 * @author hv
 * @version 1.0
 * @since 14/9/2016
 */
public class ResultSemasterMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, EOFException, FileNotFoundException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please choose function: ");
        System.out.println("1 - Add a new student in list of student.");
        System.out.println("2 - Print list of student.");
        System.out.println("3 - Print list of student by grade.");
        System.out.println("4 - Count Excellent student, good student, average student, weak student.");
        System.out.println("5 - Count student by grade and mark average of a grade.");

        ListStudent listSt = new ListStudent();

        // Read data from file tongketnamhoc.txt
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/IOResultSemaster/tongketnamhoc.txt")))) {

            while (true) {
                String name = in.readUTF();
                int grade = in.readInt();
                double semaster1 = in.readDouble();
                double semaster2 = in.readDouble();
                
                Student s = new Student(name, grade, semaster1, semaster2);
                listSt.addAStudent(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //----------------------------------------------------

        // input option for functions
        int opt = 0;
        try {
            opt = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (opt == 1) {
            System.out.println("-----Add a new student-----");
            Student student = new Student();
            student.inputStudent();

            try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/IOResultSemaster/tongketnamhoc.txt", true)))) {
                out.writeUTF(student.getName());
                out.writeInt(student.getGrade());;
                out.writeDouble(student.getSemaster1());
                out.writeDouble(student.getSemaster2());

                System.out.println("Add a new student in list is success");
                out.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.toString());
            }

        } else if (opt == 2) {
            listSt.printListStudent();
        } else if (opt == 3) {
            Collections.sort(listSt.getListStudent());
            listSt.printListStudent();
        } else if (opt == 4) {
            System.out.println("the number of excellent student: " + listSt.countExcellentStudent());
            System.out.println("the number of good student: " + listSt.countGoodStudent());
            System.out.println("the number of average student: " + listSt.countAverageStudent());
            System.out.println("the number of weak student: " + listSt.countWeakStudent());

        } else if (opt == 5) {
            System.out.println("the number's student of grade 12: " + listSt.countStudentByGrade12());
            System.out.println("the number's student of grade 11: " + listSt.countStudentByGrade11());
            System.out.println("the number's student of grade 10: " + listSt.countStudentByGrade10());

            System.out.println("Average mark student of grade 12: " + listSt.calAverageMarkByGrade12());
            System.out.println("Average mark student of grade 11: " + listSt.calAverageMarkByGrade11());
            System.out.println("Average mark student of grade 10: " + listSt.calAverageMarkByGrade10());

        } else {
            throw new ArithmeticException("The function do not exists.");
        }
    }

}
