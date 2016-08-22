/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementEmployee;

import Employee.Employee;
import Employee.Salary;
import ManagementComputer.Desktop;
import ManagementComputer.Laptop;
import java.io.IOException;

/**
 *
 * @author minhnhutvaio
 */
public class ListEmployee {

    public ListEmployee() {
    }

    /*
     * This method add to list trade employee a employee
     * Input: The 'te' variable has TradeEmployee array type and 'index' variable has int type
     * Output: The 'te' variable has TradeEmployee array type
     */
    public TradeEmployee[] addTradeEmployee(TradeEmployee[] te, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number employee is more 10");
        } else {
            TradeEmployee t = new TradeEmployee();
            t.inputInformation();
            te[index] = t;
        }
        return te;
    }

    /*
     * This print information list trade employee
     * Input: The 'te' variable has TradeEmployee array type and 'numOfTradeE' variable has int type
     * OutPut: not
     */
    public void printListTradeE(TradeEmployee[] te, int numOfTradeE) {

        for (int i = 0; i < numOfTradeE; i++) {
            System.out.println("-----Information Desktop " + (i + 1) + "------");
            System.out.println("Name: " + te[i].getName());
            
            System.out.println("Income: " + te[i].calIncome(te[i]));

            double taxableIncome = te[i].calTaxableIncome(te[i]);
            System.out.println("Taxable Income: " + taxableIncome);

            System.out.println("Personal tax: " + te[i].calPersonalIncomeTax(taxableIncome));

            System.out.println("Net Salary: " + te[i].calNetSalary(te[i]));
        }
    }

    /*
     * This method add to list production employee a employee
     * Input: The 'pe' variable has ProductionEmployee array type and 'index' variable has int type
     * Output: The 'pe' variable has ProductionEmloyee array type
     */
    public ProductionEmployee[] addProductionEmployee(ProductionEmployee[] pe, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number employee is more 10");
        } else {
            ProductionEmployee p= new ProductionEmployee();
            p.inputInformation();
            pe[index] = p;
        }
        return pe;
    }

    /*
     * This print information list production employee
     * Input: The '[e' variable has TradeEmployee array type and 'numOfProE' variable has int type
     * OutPut: not
     */
    public void printListProductionE(ProductionEmployee[] pe, int numOfProE) {

        for (int i = 0; i < numOfProE; i++) {
            System.out.println("-----Information Desktop " + (i + 1) + "------");
            System.out.println("Name: " + pe[i].getName());
            
            System.out.println("Income: " + pe[i].calIncome(pe[i]));

            double taxableIncome = pe[i].calTaxableIncome(pe[i]);
            System.out.println("Taxable Income: " + taxableIncome);

            System.out.println("Personal tax: " + pe[i].calPersonalIncomeTax(taxableIncome));

            System.out.println("Net Salary: " + pe[i].calNetSalary(pe[i]));
        }
    }
}
