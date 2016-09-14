/**
 * 
 */
package EmployeeManagement;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        try {
            opt = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (opt == 1) {

            List<Employee> lst = new ArrayList<>();

            try (ObjectInputStream in = new ObjectInputStream(new 
                    BufferedInputStream(new FileInputStream("src/EmployeeManagement/employee.txt")))) {

                while (true) {
                    Employee e = (Employee) in.readObject();
                    lst.add(e);
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            for (Employee employee : lst) {
                System.out.println(employee.toString());
            }

        } else if (opt == 2) {

           

        } else if (opt == 3) {
            
            System.out.println("Please enter name: ");
            String name = input.readLine();
            
            System.out.println("Please enter coefficient: ");
            Float coefficient = Float.parseFloat(input.readLine());
            
            System.out.println("Please enter counter people: ");
            int countPeople = Integer.parseInt(input.readLine());
            
            System.out.println("Please enter bonus: ");
            double bonus = Double.parseDouble(input.readLine());
            
            Employee e = new Employee(name, coefficient, countPeople, bonus);
            ObjectOutputStream out;
            
            try  {
                out = new ObjectOutputStream(new 
                        FileOutputStream("src/EmployeeManagement/employee.txt", true));// {
                   // @Override
                    //protected void writeStreamHeader() throws IOException {
                      //  reset();
                    //}
                //};

                out.writeObject(e);
                out.close();
                System.out.println("Add a employee is success.");

            } catch (IOException e1) {
                System.out.println("Error: " + e1.getMessage());
            }
            
        } else {
            throw new ArithmeticException("The function do not exists.");
        }
    }

}
