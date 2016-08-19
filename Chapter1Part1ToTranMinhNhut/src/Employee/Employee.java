/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 * @version 1.0
 * @author hv
 * @date 19/8/2016
 */
public class Employee {
    
    final double basicSalary = 126000;
    
    private String name;
    private float coefficient ;
    private int countPeople;
    private double bonus;
    //private double income;
    //private double TaxableIncome;
    //private double personalIncome;
    //private double netSalary;

    public Employee() {
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
/*
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTaxableIncome() {
        return TaxableIncome;
    }

    public void setTaxableIncome(double TaxableIncome) {
        this.TaxableIncome = TaxableIncome;
    }

    public double getPersonalIncome() {
        return personalIncome;
    }

    public void setPersonalIncome(double personalIncome) {
        this.personalIncome = personalIncome;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    */
    
    public double calculateIncome() {
        double income = coefficient * basicSalary + bonus;
        return income;
    }
    
    public double calculateTaxableIncome() {
        double taxableIncome = 0;
        double incom = calculateIncome();
        if (incom )
    }
    
    public double calculateSalary() {
        double salary = 0;
        
        return salary;
    }
    
}

enum Level {
    LEVEL1(500000, 250000);
    
    double income;
    double tax;
    
    private Level(double income, double tax) {
        this.income = income;
        this.tax = tax;
    }
    
    public calculateTaxableIncome()

}