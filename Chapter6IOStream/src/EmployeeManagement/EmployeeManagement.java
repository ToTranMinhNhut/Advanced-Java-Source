package EmployeeManagement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author minhnhutvaio
 * @version 1.0
 * @since 14/9/2016
 */
public class EmployeeManagement {
    
    List<Employee> listEmployee = new ArrayList<Employee>();

    //add a new employee
    public void addEmployee(String path) throws IOException {
        Employee emp = Employee.inputEmployee();
        listEmployee.add(emp);
        System.out.println("---Employee has Added---");
        
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
        output.writeInt(listEmployee.size());

        for (Employee e : listEmployee) {
            output.writeObject(e);
            output.flush();
        }
        output.reset();
        output.close();
    }

    //search employee by name
    public void search() throws IOException {
        System.out.println("Input name employee to search: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();

        int temp = 0;
        for (Employee employee : listEmployee) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println("----Result searching----: ");
                System.out.println(employee);
                temp = 1;
            }
        }
        if (temp == 0)
            System.out.println("----Non name matching----.");

    }

    //show list
    public void printList() {
        System.out.println("----List Employee----");
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    //read list from file
    public void readFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        if (file.available() != 0) {
            ObjectInputStream input = new ObjectInputStream(file);

            int size = input.readInt();
            for (int i = 0; i < size; i++) {
                listEmployee.add((Employee) input.readObject());
            }
            input.close();
        }
    }

}
