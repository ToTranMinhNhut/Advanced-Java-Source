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
 * Expect all pass 
 * 
 * JUnit Test for getMaximumSalary() method in ListEmployee class in EmployeeStreamPart4 package 
 * Expect all past
 */

public class JUnitTestGetMaximumSalary {

    ListEmployee employees = new ListEmployee();
    
    @Test
    public void testGetMaximumSalary() {
        
        List<Employee> lst = Arrays.asList(new Employee("Ngoc Anh", "20", 3000000), new Employee("Tran Anh Tai", "20", 3100000),
                new Employee("Nhu Anh", "20", 4000000),new Employee("", "20", 3900000));
        
        employees.setListEmployee(lst);
        
        double ex = 4000000;
        double ac = employees.getMaximumSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary2() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Nguyen", "20", 9000000), new Employee("Bao Anh", "21", 3100000),
                new Employee("Anh Anh Anh", "22", 5000000),new Employee("Tran Anh Dung", "23", 3900000), new Employee("Anh Anh", "24", 4000000));
        
        employees.setListEmployee(lst);
        
        double ex = 9000000;
        double ac = employees.getMaximumSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary3() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 3000000), new Employee("", "21", 3100000),
                new Employee("", "25", 3000000),new Employee("", "33", 2900000));
        
        employees.setListEmployee(lst);
        
        double ex = 3100000;
        double ac = employees.getMaximumSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary4() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 2100000;
        double ac = employees.getMaximumSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary5() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 3500000), new Employee("anh anh", "30", 3100000),
                new Employee("Bao Anh", "29", 4000000),new Employee("Quynh Anh", "27", 8900000),
                new Employee("Anh Kiet", "20", 13000000));
        
        employees.setListEmployee(lst);
        
        double ex = 13000000;
        double ac = employees.getMaximumSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary6() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 3500000), new Employee("anh anh", "30", 3100000),
                new Employee("Bao Anh", "29", 4000000),new Employee("Quynh Anh", "27", 8900000),
                new Employee("Anh Kiet", "20", 13000000));
        
        employees.setListEmployee(lst);
        
        double ex = 8900000;
        double ac = employees.getMaximumSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary7() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 900000;
        double ac = employees.getMaximumSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary8() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 1000000;
        double ac = employees.getMaximumSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary9() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "18", 1500000), new Employee("", "20", 1100000));
        
        employees.setListEmployee(lst);
        
        double ex = 1100000;
        double ac = employees.getMaximumSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetMaximumSalary10() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 3000000), new Employee("", "21", 3100000),
                new Employee("", "25", 3000000),new Employee("", "33", 2900000));
        
        employees.setListEmployee(lst);
        
        double ex = 3000000;
        double ac = employees.getMaximumSalary();
        assertNotEquals(ex, ac);
    }

}
