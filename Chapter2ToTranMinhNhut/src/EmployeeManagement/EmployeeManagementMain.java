/**
 * 
 */
package EmployeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author hv
 * @version 1.0
 * @since 9/8/2016
 */
public class EmployeeManagementMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Employee> demoListEmployee = new TreeMap<String, Employee>();
        Employee demoEmployee1 = new Employee("e1", "dan", "23", 1000);
        Employee demoEmployee2 = new Employee("e2", "bruce", "23", 2000);
        demoListEmployee.put("e1", demoEmployee1);
        demoListEmployee.put("e2", demoEmployee2);

        ListEmployee listEmployee = new ListEmployee();
        listEmployee.setListEmployee(demoListEmployee);
        
        /*
         * To choose and make a function among four functions below.
         * When function finish, you can choose out program or continue to make program
         * 
         */
        boolean nextStep = true;

        while (nextStep) {

            System.out.println("----------Employee Management----------");
            System.out.println("1. View all of employee in list's employee.");
            System.out.println("2. Add a new employee to list's employee.");
            System.out.println("--------------------------------");

            int opt = 0;

            System.out.println("Please choose a function: ");
            try {
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                listEmployee.viewListInformationEmployee();

            } else if (opt == 2) {
                Employee employee = new Employee();
                employee.inputInformation();
                listEmployee.addNewEmployee(employee);
                
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
