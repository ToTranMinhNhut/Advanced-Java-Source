/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class Teacher extends Human {

    final double basicSalary = 1260000;
    private String manageClass;
    private float coefficient;
    private double bonus;

    public Teacher() {
    }

    public Teacher(String manageClass, float coefficient, double bonus, String name, String birthday, String address, String phoneNumber) {
        super(name, birthday, address, phoneNumber);
        this.manageClass = manageClass;
        this.coefficient = coefficient;
        this.bonus = bonus;
    }

    public String getManageClass() {
        return manageClass;
    }

    public void setManageClass(String manageClass) {
        this.manageClass = manageClass;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /*
     * This method input information a teacher, and it's override inputInformation() method in Human clas
     * Input: not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please class that teacher manage: ");
            manageClass = input.readLine();

            System.out.println("Please coefficient: ");
            coefficient = Float.parseFloat(input.readLine());

            System.out.println("Please bonus: ");
            bonus = Double.parseDouble(input.readLine());
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method calculate salary a teacher
     * Input: not
     * Output: return salary value has double type
     */
    public double calSalary() {
        return coefficient * basicSalary + bonus;
    }
    
    /* 
     * This method print information a teacher
     * Input: not
     * Output: return information value has String type
    */
    @Override
    public String printInformation() {
        double salary = calSalary();
        
        return super.printInformation() + "\n| The class: " + manageClass
                + "| Coefficient salary: " + coefficient + "| Bonus: " + bonus
                + "\n| Salary: " + salary; 
    }
    
}
