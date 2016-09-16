/**
 * 
 */
package EmployeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author minhnhutvaio
 * @version 1.0
 * @since 14/9/2016
 */
public class EmployeeManagementMain {

    /**
     * @param args
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choose function: ");
        System.out.println("1 - View list of employee.");
        System.out.println("2 - Search a employee.");
        System.out.println("3 - Add a new employee.");

        int opt = 0;

        opt = Integer.parseInt(input.readLine());

        String link = "src/EmployeeManagement/employee.txt";
        EmployeeManagement empManager = new EmployeeManagement();

        try {
            empManager.readFile(link);

            if (opt == 1) {
                empManager.printList();
            } else if (opt == 2) {
                empManager.search();
            }else if (opt == 3) {
                empManager.addEmployee(link);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
