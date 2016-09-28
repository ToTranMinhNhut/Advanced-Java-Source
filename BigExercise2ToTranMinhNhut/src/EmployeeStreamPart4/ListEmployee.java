/**
 * 
 */
package EmployeeStreamPart4;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hv
 * @version 1.0
 * @since 20/9/2016
 * 
 * This class is used to processing businesses of instance of list employee
 */
public class ListEmployee {

    List<Employee> listEmployee ;
      
    /**
     * @return the listEmployee
     */
    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    /**
     * @param listEmployee the listEmployee to set
     */
    public void setListEmployee(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    
    /*
     * This constructor method is used to init ListEmployee and create list employee 
     * Input nothing
     * Output nothing
     */
    public ListEmployee() {
        listEmployee = Arrays.asList(new Employee("John", "24", 3000000), new Employee("Max", "30", 4000000),
        new Employee("Alan", "29", 3500000), new Employee("Cole", "27", 4900000),
        new Employee("Han", "34", 9000000), new Employee("Bob", "20", 2000000),
        new Employee("Dan", "27", 3800000), new Employee("Tu", "21", 2500000),
        new Employee("Ngoc Anh", "24", 1800000), new Employee("Joe", "20", 9000000),
        new Employee("Tran Anh Dung", "32", 8000000), new Employee("Alexis", "25", 4000000),
        new Employee("An", "24", 3000000), new Employee("Adam", "19", 1800000),
        new Employee("Anh Nguyen", "28", 3900000));
    }

    /*
     * This method is used to count number's employees have salary is higher than 3000000
     * Input salaryComparation variable has double type
     * Output return count has int type
     */
    public int countEmployeeHaveSalaryHigherX(double salaryComparation) {
        int count = (int) listEmployee.stream().filter(e -> e.getSalary() > salaryComparation).count() ;
        return count;
    }
    
    /*
     * This method is used to get all of employees have salary is higher than 3000000
     * Input salaryComparation variable has double type
     * Output return employees List has Employee type
     */
    public List<Employee> getEmployeeHaveSalaryHigherX(double salaryComparation) {
        List<Employee> employees = listEmployee.stream().filter(
                e -> e.getSalary() > salaryComparation).collect(Collectors.toList());
        
        return employees;
    }
    
    /*
     * This method is used to count number's employees have 'Anh' string in full name
     * Input X String Object
     * Output return count has int type
     */
    public int countEmployeeHaveXStringInFullName(String X) {
        int count = (int) listEmployee.stream().filter(
                e -> e.getName().toLowerCase().contains(X.toLowerCase())).count() ;
        return count;
    }
    
    /*
     * This method is used to get all of employees have 'Anh' string in full name
     * Input X String Object
     * Output return employees List has Employee type
     */
    public List<Employee> getEmployeeHaveXStringInFullName(String X) {
        List<Employee> employees = listEmployee.stream().filter(
                e -> e.getName().toLowerCase().contains(X.toLowerCase())).collect(Collectors.toList());
        
        return employees;
    } 
    
    
    /*
     * This method is used to print list of employees
     * Input nothing
     * Output nothing
     */
    public void printListEmployee (List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
   
    
    /*
     * This method is used to get average age in list's employee
     * Input nothing
     * Output return average Age
     */
    public double getAverageAgeEmployee() {
        DoubleSummaryStatistics averageAge = listEmployee.stream().mapToDouble(
                e -> Double.parseDouble(e.getAge())).summaryStatistics();
        return averageAge.getAverage();
    }
    
    /*
     * This method is used to get maximum salary of employees
     * Input nothing
     * Output return maximum salary
     */
    public double getMaximumSalary() {
        DoubleSummaryStatistics maxSalary = listEmployee.stream().mapToDouble(
                e -> e.getSalary()).summaryStatistics();
        return maxSalary.getMax();
    }   
    
    /*
     * This method is used to get minimum salary of employees
     * Input nothings
     * Output return maximum salary
     */
    public double getMinimumSalary() {
        DoubleSummaryStatistics maxSalary = listEmployee.stream().mapToDouble(
                e -> e.getSalary()).summaryStatistics();
        return maxSalary.getMin();
    }
    
    /*
     * This method is used to get average salary of employees
     * Input nothing
     * Output return maximum salary
     */
    public double getAverageSalary() {
        DoubleSummaryStatistics maxSalary = listEmployee.stream().mapToDouble(
                e -> e.getSalary()).summaryStatistics();
        return maxSalary.getAverage();
    }
}
