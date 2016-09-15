/**
 * 
 */
package EmployeeManagement;

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
    
    
}
