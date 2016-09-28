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
 * JUnit Test for getAverageSalary() method in ListEmployee class in EmployeeStreamPart4 package 
 * Expect all past
 */

public class JUnitGetAverageSalary {

 ListEmployee employees = new ListEmployee();
    
    @Test
    public void testGetAverageSalary1() {
        
        List<Employee> lst = Arrays.asList(new Employee("Ngoc Anh", "20", 3000000), new Employee("Tran Anh Tai", "20", 4000000),
                new Employee("Nhu Anh", "20", 4000000),new Employee("", "20", 3000000));
        
        employees.setListEmployee(lst);
        
        double ex = 3500000;
        double ac = employees.getAverageSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary2() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Nguyen", "20", 9000000), new Employee("Bao Anh", "21", 9000000),
                new Employee("Anh Anh Anh", "22", 9000000),new Employee("Tran Anh Dung", "23", 9000000), new Employee("Anh Anh", "24", 9000000));
        
        employees.setListEmployee(lst);
        
        double ex = 9000000;
        double ac = employees.getAverageSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary3() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 0), new Employee("", "21", 0),
                new Employee("", "25", 0),new Employee("", "33", 0));
        
        employees.setListEmployee(lst);
        
        double ex = 0;
        double ac = employees.getAverageSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary4() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 1), new Employee("", "20", 2),
                new Employee("", "27", 2),new Employee("", "29", 3));
        
        employees.setListEmployee(lst);
        
        double ex = 2;
        double ac = employees.getAverageSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary5() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 2), new Employee("anh anh", "30", 3),
                new Employee("Bao Anh", "29", 2),new Employee("Quynh Anh", "27", 0),
                new Employee("Anh Kiet", "20", 5));
        
        employees.setListEmployee(lst);
        
        double ex = 2.4;
        double ac = employees.getAverageSalary();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary6() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 3500000), new Employee("anh anh", "30", 3100000),
                new Employee("Bao Anh", "29", 4000000),new Employee("Quynh Anh", "27", 8900000),
                new Employee("Anh Kiet", "20", 13000000));
        
        employees.setListEmployee(lst);
        
        double ex = 8900000;
        double ac = employees.getAverageSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary7() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 900000;
        double ac = employees.getAverageSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary8() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 1000000;
        double ac = employees.getAverageSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary9() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "18", 1500000), new Employee("", "20", 1100000));
        
        employees.setListEmployee(lst);
        
        double ex = 1100000;
        double ac = employees.getAverageSalary();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageSalary10() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 3000000), new Employee("", "21", 3100000),
                new Employee("", "25", 3000000),new Employee("", "33", 2900000));
        
        employees.setListEmployee(lst);
        
        double ex = 3200000;
        double ac = employees.getAverageSalary();
        assertNotEquals(ex, ac);
    }


}
