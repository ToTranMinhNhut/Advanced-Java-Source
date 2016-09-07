/**
 * 
 */
package StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author minhnhutvaio
 *
 */
public class StudentManagement {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        ListStudent listStudent = new ListStudent();
        
        /*
         * To choose and make a function among four functions below.
         * When function finish, you can choose out program or continue to make program
         * 
         */
        boolean nextStep = true;

        while (nextStep) {

            System.out.println("----------Student Management----------");
            System.out.println("1. View all of students in list's student.");
            System.out.println("2. Add a new student to list's student.");
            System.out.println("3. Search a student in list's student.");
            System.out.println("4. Remove a student in list's student.");
            System.out.println("--------------------------------");

            int opt = 0;

            System.out.println("Please choose a function: ");
            try {
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                listStudent.viewListInformationStudent();

            } else if (opt == 2) {
                Student student = new Student();
                student.inputInformation();
                listStudent.addNewStudent(student);

            } else if (opt == 3) {
                System.out.println("Please enter id student that would to search: ");

                String idSearching = "";
                
                try {
                    idSearching = input.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.toString());
                }
                
                listStudent.searchStudent(idSearching);
            } else if (opt == 4) {
                System.out.println("Please enter id student that would to remove: ");

                String idRemoving = "";
                
                try {
                    idRemoving = input.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.toString());
                }
                
                listStudent.removeStudent(idRemoving);
            } else {
                throw new ArithmeticException("The function do not exists.");
            }

            int choose = 0;
            System.out.println("----------------------------------------");
            System.out.println("\nDo you finish program. Please choose: <1 (Yes) / 0 (No)>");

            try {
                choose = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (choose != 1 && choose != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            } else if (choose == 1) {
                nextStep = false;
            }
        }
    }

}
