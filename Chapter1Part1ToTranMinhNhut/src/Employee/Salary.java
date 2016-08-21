/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 19/8/2016
 */
public class Salary {

    final double basicSalary = 1260000;
    final double basicTax = 9000000;
    final double basicReduce = 3600000;

    /*
     * This method calculate personal income tax of a employee
     * Input: 'taxIncome' variable has double type
     * Output: 'personalIncomeTax' variable has double type
     */
    double calPersonalIncomeTax(double taxIncome) {
        double personalIncomeTax = 0;
        if (taxIncome < SalaryLevel.LEVEL1.getIncomeTax()) {

            personalIncomeTax = taxIncome * SalaryLevel.LEVEL1.getTax();

        } else if (taxIncome < SalaryLevel.LEVEL2.getIncomeTax()) {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL1.getIncomeTax()) * SalaryLevel.LEVEL2.getTax();

        } else if (taxIncome < SalaryLevel.LEVEL3.getIncomeTax()) {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL2.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL2.getIncomeTax()) * SalaryLevel.LEVEL3.getTax();

        } else if (taxIncome < SalaryLevel.LEVEL4.getIncomeTax()) {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL2.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL3.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL3.getIncomeTax()) * SalaryLevel.LEVEL4.getTax();

        } else if (taxIncome < SalaryLevel.LEVEL5.getIncomeTax()) {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL2.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL3.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL4.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL4.getIncomeTax()) * SalaryLevel.LEVEL5.getTax();

        } else if (taxIncome < SalaryLevel.LEVEL6.getIncomeTax()) {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL2.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL3.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL4.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL5.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL5.getIncomeTax()) * SalaryLevel.LEVEL6.getTax();

        } else {

            personalIncomeTax = SalaryLevel.LEVEL1.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL2.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL3.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL4.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL5.getMaxLeverTax();
            personalIncomeTax += SalaryLevel.LEVEL6.getMaxLeverTax();
            personalIncomeTax += (taxIncome - SalaryLevel.LEVEL6.getIncomeTax()) * SalaryLevel.LEVEL7.getTax();
        }
        return personalIncomeTax;
    }

    /*
     * This method calculate income of a employee
     * Input: 'e' variable has Employee type
     * Output: 'income' variable has double type
     */
    public double calIncome(Employee e) {
        double income = e.getCoefficient() * basicSalary + e.getBonus();
        return income;
    }

    /*
     * This method calculate taxable income of a employee
     * Input: 'e' variable has Employee type
     * Output: 'taxableIncome' variable has double type
     */
    public double calTaxableIncome(Employee e) {
        double income = calIncome(e);

        double taxableIncome = income - basicTax - e.getCountPeople() * basicReduce;
        return taxableIncome;
    }

    /*
     * This method calculate net salary of a employee
     * Input: 'e' variable has Employee type
     * Output: 'netSalary' variable has double type
     */
    public double calNetSalary(Employee e) {
        double taxableIncome = calTaxableIncome(e);

        if (taxableIncome < 0) {
            taxableIncome = 0;
        }

        double personalIncomeTax = calPersonalIncomeTax(taxableIncome);
        double income = calIncome(e);

        double netSalary = income - personalIncomeTax;
        return netSalary;
    }

}

enum SalaryLevel {
    LEVEL1(5000000, 0.05f, 250000),
    LEVEL2(10000000, 0.1f, 500000),
    LEVEL3(18000000, 0.15f, 1200000),
    LEVEL4(32000000, 0.2f, 2800000),
    LEVEL5(52000000, 0.25f, 5000000),
    LEVEL6(80000000, 0.3f, 8400000),
    LEVEL7(80000000, 0.35f, 8400000);

    private final int taxIncome;
    private final float tax;
    private final int maxLevelTax;

    private SalaryLevel(int taxIncome, float tax, int maxLeverTax) {

        this.taxIncome = taxIncome;
        this.tax = tax;
        this.maxLevelTax = maxLeverTax;

    }

    public int getIncomeTax() {

        return this.taxIncome;

    }

    public float getTax() {

        return this.tax;

    }

    public float getMaxLeverTax() {

        return this.maxLevelTax;

    }
}
