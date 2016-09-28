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
 * JUnit Test for countEmployeeHaveXStringInFullName() method in ListEmployee class in EmployeeStreamPart4 package 
 */
public class JUnitTestCountEmployeeHaveXStringInFullName {

    ListEmployee employees = new ListEmployee();
    final String X = "Anh";
    
    @Test
    public void testCountEmployeeHaveXStringInFullName() {
        
        List<Employee> lst = Arrays.asList(new Employee("Ngoc Anh", "", 3000000), new Employee("Tran Anh Tai", "", 3100000),
                new Employee("Nhu Anh", "", 4000000),new Employee("", "", 3900000));
        
        employees.setListEmployee(lst);
        
        int ex = 3;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName2() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Nguyen", "", 9000000), new Employee("Bao Anh", "", 3100000),
                new Employee("Anh Anh Anh", "", 5000000),new Employee("Tran Anh Dung", "", 3900000), new Employee("Anh Anh", "", 4000000));
        
        employees.setListEmployee(lst);
        
        int ex = 5;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName3() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "", 3000000), new Employee("", "", 3100000),
                new Employee("", "", 3000000),new Employee("", "", 2900000));
        
        employees.setListEmployee(lst);
        
        int ex = 1;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName4() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 2000000), new Employee("", "", 2100000),
                new Employee("", "", 1000000),new Employee("", "", 900000));
        
        employees.setListEmployee(lst);
        
        int ex = 0;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName5() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh", "", 3500000), new Employee("anh anh", "", 3100000),
                new Employee("Bao Anh", "", 4000000),new Employee("Quynh Anh", "", 8900000),
                new Employee("Anh Kiet", "", 13000000), new Employee("Anh Hung", "", 8100000),
                new Employee("Vu Ngoc Anh", "", 33000000), new Employee("Kieu Anh", "", 9100000),
                new Employee("Anh Anh Anh", "", 12000000), new Employee("Anh Tuyet", "", 7100000));
        
        employees.setListEmployee(lst);
        
        int ex = 10;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName6() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 3500000), new Employee("", "", 3100000),
                new Employee("", "", 4000000),new Employee("", "", 8900000),
                new Employee("", "", 13000000), new Employee("", "", 8100000),
                new Employee("", "", 33000000), new Employee("", "", 9100000),
                new Employee("", "", 12000000), new Employee("", "", 7100000));
        
        employees.setListEmployee(lst);
        
        int ex = 9;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName7() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Kiet", "", 1500000), new Employee("anh", "", 1100000),
                new Employee("", "", 1000000),new Employee("", "", 900000),
                new Employee("", "", 3000000), new Employee("", "", 2100000));
        
        employees.setListEmployee(lst);
        
        int ex = 1;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName8() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "", 1500000), new Employee("", "", 1100000));
        
        employees.setListEmployee(lst);
        
        int ex = -1;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testcountEmployeeHaveXStringInFullName9() {
        
        List<Employee> lst = Arrays.asList(new Employee("Anh Anh", "", 1500000), new Employee("", "", 1100000),
                new Employee("", "", 1000000),new Employee("", "", 1900000),
                new Employee("", "", 13000000), new Employee("", "", 2100000));
        
        employees.setListEmployee(lst);
        
        int ex = 0;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertNotEquals(ex, ac);
    }
    
    @Test
    public void testCountEmployeeHaveXStringInFullName0() {
        
        List<Employee> lst = Arrays.asList(new Employee("", "", 11500000), new Employee("", "", 10100000),
                new Employee("", "", 7000000),new Employee("", "", 4900000),
                new Employee("", "", 3200000), new Employee("", "", 8100000));
        
        employees.setListEmployee(lst);
        
        int ex = 5;
        int ac = employees.countEmployeeHaveXStringInFullName(X);
        assertNotEquals(ex, ac);
    }

}
