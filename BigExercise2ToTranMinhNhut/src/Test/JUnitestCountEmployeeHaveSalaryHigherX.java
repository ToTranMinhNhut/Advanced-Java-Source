/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import EmployeeStreamPart4.Employee;
import EmployeeStreamPart4.ListEmployee;

/**
 * @author hv
 * @version 1.0
 * @since 20/9/2016
 * 
 * JUnit Test for countEmployeeHaveSalaryHigherX() method in ListEmployee class in EmployeeStreamPart4 package
 * Expect all pass 
 */
public class JUnitestCountEmployeeHaveSalaryHigherX {

    ListEmployee employees = new ListEmployee();
    final double salaryComparation = 3000000;
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX1() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 3000000), new Employee("", "", 3100000),
                new Employee("", "", 4000000),new Employee("", "", 3900000));
        
        employees.setListEmployee(lst);
        
        int ex = 3;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX2() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 9000000), new Employee("", "", 3100000),
                new Employee("", "", 5000000),new Employee("", "", 3900000), new Employee("", "", 4000000));
        
        employees.setListEmployee(lst);
        
        int ex = 5;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX3() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 3000000), new Employee("", "", 3100000),
                new Employee("", "", 3000000),new Employee("", "", 2900000));
        
        employees.setListEmployee(lst);
        
        int ex = 1;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX4() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 2000000), new Employee("", "", 2100000),
                new Employee("", "", 1000000),new Employee("", "", 900000));
        
        employees.setListEmployee(lst);
        
        int ex = 0;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX5() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 3500000), new Employee("", "", 3100000),
                new Employee("", "", 4000000),new Employee("", "", 8900000),
                new Employee("", "", 13000000), new Employee("", "", 8100000),
                new Employee("", "", 33000000), new Employee("", "", 9100000),
                new Employee("", "", 12000000), new Employee("", "", 7100000));
        
        employees.setListEmployee(lst);
        
        int ex = 10;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX6() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 3500000), new Employee("", "", 3100000),
                new Employee("", "", 4000000),new Employee("", "", 8900000),
                new Employee("", "", 13000000), new Employee("", "", 8100000),
                new Employee("", "", 33000000), new Employee("", "", 9100000),
                new Employee("", "", 12000000), new Employee("", "", 7100000));
        
        employees.setListEmployee(lst);
        
        int ex = 9;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX7() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 1500000), new Employee("", "", 1100000),
                new Employee("", "", 1000000),new Employee("", "", 900000),
                new Employee("", "", 3000000), new Employee("", "", 2100000));
        
        employees.setListEmployee(lst);
        
        int ex = 1;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX8() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 1500000), new Employee("", "", 1100000));
        
        employees.setListEmployee(lst);
        
        int ex = -1;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX9() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 1500000), new Employee("", "", 1100000),
                new Employee("", "", 1000000),new Employee("", "", 1900000),
                new Employee("", "", 13000000), new Employee("", "", 2100000));
        
        employees.setListEmployee(lst);
        
        int ex = 0;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveSalaryHigherX10() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 11500000), new Employee("", "", 10100000),
                new Employee("", "", 7000000),new Employee("", "", 4900000),
                new Employee("", "", 3200000), new Employee("", "", 8100000));
        
        employees.setListEmployee(lst);
        
        int ex = 5;
        int ac = employees.countEmployeeHaveSalaryHigherX(salaryComparation);
        assertNotEquals(ex, ac);
    }
}
