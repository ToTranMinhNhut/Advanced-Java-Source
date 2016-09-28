/**
 * 
 */
package EmployeeStreamPart4;

/**
 * @author hv
 * @version 1.0
 * @since 20/9/2016
 * 
 * This method is used to process businesses of instance Employee
 */
public class Employee {

    private String name;
    private String age;
    private double salary;
    
    public Employee() {
        super();
    }

    public Employee(String name, String age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
    }
    
}
