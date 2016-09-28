/**
 * 
 */
package EmployeeStreamPart4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 10/9/2016
 * 
 * This main class contains main method
 */
public class EmployeeStreamMain {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListEmployee listEmployee = new ListEmployee();
        List<Employee> employees = new ArrayList<>();
        int number = 0;
        
        //--------------All of employees have salary is higher than 3000000------------------------
        double salary = 3000000;
        
        // count employee
        number = listEmployee.countEmployeeHaveSalaryHigherX(salary);
        System.out.println("The number of employees have salary is higher than 3000000: " + number);

        //get list employee
        employees = listEmployee.getEmployeeHaveSalaryHigherX(salary);
        
        // print list of employees
        System.out.println("List of employees have salary is higher than 3000000.");
        listEmployee.printListEmployee(employees);
        System.out.println("-----------------------------------------------------");
        //-----------------------------------------------------------------------------------------
        
        //-------------------All of employees have 'Anh' string in full name----------------------
        String xString = "Anh";
        
        // count employee
        number = listEmployee.countEmployeeHaveXStringInFullName(xString);
        System.out.println("\nThe number of employees have Anh string in full name: " + number);
       
        //get list employee
        employees = listEmployee.getEmployeeHaveXStringInFullName(xString); 
        
        // print list of employees
        System.out.println("List of employees have Anh string in full name.");
        listEmployee.printListEmployee(employees);
        System.out.println("-----------------------------------------------------");
        //------------------------------------------------------------------------------------------
        
        // ---------------average age of all of employees--------------
        double averageAge = listEmployee.getAverageAgeEmployee();
        System.out.println("\nAverage age of employees: " + averageAge);
        //------------------------------------------------------------
        
        //------------ Statistic to employee--------------------------
        // maximum salary
        double maxSalary = listEmployee.getMaximumSalary();
        System.out.println("\nMaximum salary of employees: " + maxSalary);
        
        // minimum salary
        double minSalary = listEmployee.getMinimumSalary();
        System.out.println("\nMinimum salary of employees: " + minSalary);
        
        // average salary
        double averageSalary = listEmployee.getAverageSalary();
        System.out.println("\nAverage salary of employees: " + averageSalary);
        //-------------------------------------------------------------
    }

}
