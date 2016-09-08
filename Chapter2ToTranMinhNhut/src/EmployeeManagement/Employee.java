/**
 * 
 */
package EmployeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this class is used for processing businesses of instance employee
 * 
 * @author hv
 * @version 1.0
 * @since 8/9/2016
 */
public class Employee implements Comparable<Employee> {

    private String id;
    private String name;
    private String age;
    private double salary;
    
    
    public Employee() {
        super();
    }
    
    public Employee(String id, String name, String age, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the age
     */
    public String getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {  
        return Double.compare(o.salary, this.salary);
    }

    /*
     * this method is used for inputing a employee
     * Input nothing
     * Output nothing
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter id of employee: ");
            id = input.readLine();

            System.out.println("Please enter name of employee: ");
            name = input.readLine();

            System.out.println("Please enter age of employee: ");
            age = input.readLine();

            System.out.println("Please enter salary of employee: ");
            salary = Double.parseDouble(input.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * This method is used for printing a employee
     * input nothing
     * Output nothing
     */
    public void printInformation() {
        System.out.println("Id of employee: " + id);
        System.out.println("Name of employee: " + name);
        System.out.println("Age of employee: " + age);
        System.out.println("Salary of employee: " + salary);
    }
}
