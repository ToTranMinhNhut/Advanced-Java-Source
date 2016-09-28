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
 * JUnit Test for getAverageAgeEmployee() method in ListEmployee class in EmployeeStreamPart4 package 
 * Expect all past
 */
public class JUnitTestGetAverageAgeEmployee {

    ListEmployee employees = new ListEmployee();
    
    @Test
    public void testGetAverageAgeEmployee() {
        
        List<Employee> lst = Arrays.asList(new Employee("Ngoc Anh", "20", 3000000), new Employee("Tran Anh Tai", "20", 3100000),
                new Employee("Nhu Anh", "20", 4000000),new Employee("", "20", 3900000));
        
        employees.setListEmployee(lst);
        
        double ex = 20;
        double ac = employees.getAverageAgeEmployee();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee2() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Nguyen", "20", 9000000), new Employee("Bao Anh", "21", 3100000),
                new Employee("Anh Anh Anh", "22", 5000000),new Employee("Tran Anh Dung", "23", 3900000), new Employee("Anh Anh", "24", 4000000));
        
        employees.setListEmployee(lst);
        
        double ex = 22;
        double ac = employees.getAverageAgeEmployee();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee3() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 3000000), new Employee("", "21", 3100000),
                new Employee("", "25", 3000000),new Employee("", "33", 2900000));
        
        employees.setListEmployee(lst);
        
        double ex = 24.5;
        double ac = employees.getAverageAgeEmployee();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee4() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 26.75;
        double ac = employees.getAverageAgeEmployee();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee5() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 3500000), new Employee("anh anh", "30", 3100000),
                new Employee("Bao Anh", "29", 4000000),new Employee("Quynh Anh", "27", 8900000),
                new Employee("Anh Kiet", "20", 13000000));
        
        employees.setListEmployee(lst);
        
        double ex = 26;
        double ac = employees.getAverageAgeEmployee();
        assertEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee6() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "24", 3500000), new Employee("anh anh", "30", 3100000),
                new Employee("Bao Anh", "29", 4000000),new Employee("Quynh Anh", "27", 8900000),
                new Employee("Anh Kiet", "20", 13000000));
        
        employees.setListEmployee(lst);
        
        double ex = 25;
        double ac = employees.getAverageAgeEmployee();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee7() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 26;
        double ac = employees.getAverageAgeEmployee();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee8() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "31", 2000000), new Employee("", "20", 2100000),
                new Employee("", "27", 1000000),new Employee("", "29", 900000));
        
        employees.setListEmployee(lst);
        
        double ex = 27;
        double ac = employees.getAverageAgeEmployee();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee9() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "18", 1500000), new Employee("", "20", 1100000));
        
        employees.setListEmployee(lst);
        
        double ex = 0;
        double ac = employees.getAverageAgeEmployee();
        assertNotEquals(ex, ac,0);
    }
    
    @Test
    public void testGetAverageAgeEmployee10() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "19", 3000000), new Employee("", "21", 3100000),
                new Employee("", "25", 3000000),new Employee("", "33", 2900000));
        
        employees.setListEmployee(lst);
        
        double ex = 25;
        double ac = employees.getAverageAgeEmployee();
        assertNotEquals(ex, ac);
    }

}
