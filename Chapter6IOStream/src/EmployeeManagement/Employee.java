/**
 * 
 */
package EmployeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * @author minhnhutvaio
 *
 */
public class Employee implements Serializable {
    
    final double basicSalary = 126000;
    
    private String name;
    private float coefficient ;
    private int countPeople;
    private double bonus;

    public Employee() {
    }

    public Employee(String name, float coefficient, int countPeople, double bonus) {
        this.name = name;
        this.coefficient = coefficient;
        this.countPeople = countPeople;
        this.bonus = bonus;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return name + "\t" + coefficient + "\t" + countPeople + "\t" + bonus;
    }
    
  //input employee from user
    public  static Employee inputEmployee() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("-----Input a Employee-----");
        System.out.println("Employee name: ");
        String name = input.readLine();
        
        System.out.println("Employee cofficient: ");
        float coefficient  = Float.parseFloat(input.readLine());
        
        System.out.println("Number of people:: ");
        int countPeople = Integer.parseInt(input.readLine());
        
        System.out.println("Employee bonus: ");
        double bonus = Double.parseDouble(input.readLine());
        System.out.println("--------------------------------");
        

        Employee emp = new Employee(name, coefficient, countPeople, bonus);
        return emp;
    }
}
