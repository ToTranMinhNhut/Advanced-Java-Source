/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        float coefficient = 0;
        int countPeople = 0;
        double bonus = 0;
        
        try {
            System.out.println("Please enter name of employee: ");
            name = input.readLine();

            System.out.println("Please enter coefficient of employee: ");
            coefficient = Float.parseFloat(input.readLine());

            System.out.println("Please enter countPeople of employee: ");
            countPeople = Integer.parseInt(input.readLine());

            System.out.println("Please enter bonus of employee: ");
            bonus = Double.parseDouble(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Name: " + name);
        
        Employee e = new Employee(name, coefficient, countPeople, bonus);
        Salary s = new Salary();
        
        double income = s.calIncome(e);
        System.out.println("Income: " + income);
        
        double taxableIncome =  s.calTaxableIncome(e);
        System.out.println("Taxable Income: "  + taxableIncome);
        
        double personalTax = s.calPersonalIncomeTax(income);
        System.out.println("Personal tax: " + personalTax);
        
        double netSalary = s.calNetSalary(e);
        System.out.println("Net Salary: " + netSalary);
        

    }

}
