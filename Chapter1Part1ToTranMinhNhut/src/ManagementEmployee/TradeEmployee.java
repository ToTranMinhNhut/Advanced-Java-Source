/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementEmployee;

import Employee.Employee;
import Employee.Salary;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 */
public class TradeEmployee extends Salary {

    private double tradeSalary;
    private double rateTrade;

    public TradeEmployee() {
    }
        
    public TradeEmployee(double tradeSalary, double rateTrade, String name, float coefficient, int countPeople, double bonus) {
        super(name, coefficient, countPeople, bonus);
        this.tradeSalary = tradeSalary;
        this.rateTrade = rateTrade;
    }

    public double getTradeSalary() {
        return tradeSalary;
    }

    public void setTradeSalary(double tradeSalary) {
        this.tradeSalary = tradeSalary;
    }

    public double getRateTrade() {
        return rateTrade;
    }

    public void setRateTrade(double rateTrade) {
        this.rateTrade = rateTrade;
    }

    /*
     * This method input information a trade employee
     * Input: not
     * Output not
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter name of employee: ");
            name = input.readLine();

            System.out.println("Please enter coefficient of employee: ");
            coefficient = Float.parseFloat(input.readLine());

            System.out.println("Please enter countPeople of employee: ");
            countPeople = Integer.parseInt(input.readLine());

            System.out.println("Please enter bonus of employee: ");
            bonus = Double.parseDouble(input.readLine());

            System.out.println("Please enter salary trade: ");
            tradeSalary = Double.parseDouble(input.readLine());

            System.out.println("Please enter rate salary trade: ");
            rateTrade = Double.parseDouble(input.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * This method calculate net salary of trade employee
     * Input: 'e' variable has Employee type
     * Output 'netSalary' variable has double type
     */
    @Override
    public double calNetSalary(Employee e) {
        double income = coefficient * basicSalary + (tradeSalary * rateTrade);
        
        double taxableIncome = calTaxableIncome(e);
        if (taxableIncome < 0 ){
            taxableIncome = 0;
        }
        double personalIncomeTax= calPersonalIncomeTax(taxableIncome);
        
        double netSalary = income - personalIncomeTax;
        return netSalary;
    }
    
}
