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
public class ProductionEmployee extends Salary {

    final float RATEBOUS = 0.05f;
    final int BASE = 1000;
    private int number;

    public ProductionEmployee() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*
     * This method input information a production employee
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

            System.out.println("Please enter number: ");
            number = Integer.parseInt(input.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    @Override
    public double calNetSalary(Employee e) {
        double income = coefficient * basicSalary + (number-BASE) * RATEBOUS;

        double taxableIncome = calTaxableIncome(e);
        if (taxableIncome < 0) {
            taxableIncome = 0;
        }
        double personalIncomeTax = calPersonalIncomeTax(taxableIncome);

        double netSalary = income - personalIncomeTax;
        return netSalary;
    }

}
