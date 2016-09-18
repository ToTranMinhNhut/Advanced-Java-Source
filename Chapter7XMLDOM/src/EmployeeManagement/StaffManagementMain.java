/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class StaffManagementMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Management management = new Management();
            management.loadDepartment();
            management.loadEmployee();
            while (true) {
                System.out.println("\n");
                System.out.println("1. Show all employee in a department");
                System.out.println("2. Add new employee");
                System.out.println("3. Exit");

                int ans = 0;
                while (true) {
                    System.out.print("Choose: ");
                    ans = Integer.parseInt(input.readLine());
                    if (ans >= 1 && ans <= 6) {
                        break;
                    }
                }
                switch (ans) {
                    case 1:
                        System.out.println("== Show all employee in a department ==");
                        int size = management.getSizeDepartment();
                        if (size > 0) {
                            int choose;
                            while (true) {
                                management.showAllDeparment();
                                System.out.print("Choose: ");
                                choose = Integer.parseInt(input.readLine());
                                if (choose > 0 && choose <= size) {
                                    break;
                                }
                            }
                            management.showAllEmployeeInADepartment(choose - 1);
                        } else {
                            System.out.println("Don't have any department");
                        }
                        break;
                    case 2:
                        System.out.println("== Add new employee into a department ==");
                        size = management.getSizeDepartment();
                        if (size > 0) {
                            int choose;
                            while (true) {
                                management.showAllDeparment();
                                System.out.print("Choose: ");
                                choose = Integer.parseInt(input.readLine());
                                if (choose > 0 && choose <= size) {
                                    break;
                                }
                            }
                            int idIndex = choose - 1;
                            System.out.println("== Fill information ==");
                            System.out.print("[id]: ");
                            String id = input.readLine();
                            System.out.print("[name]: ");
                            String name = input.readLine();
                            System.out.print("[sex](1-male/0-female/others-Undefined): ");
                            String sex = input.readLine();
                            System.out.print("[day of birth]: ");
                            String dOb = input.readLine();
                            System.out.print("[salary]: ");
                            double salary;
                            while (true) {
                                salary = Double.parseDouble(input.readLine());
                                if (salary > 0) {
                                    break;
                                }
                            }
                            System.out.print("[address]: ");
                            String address = input.readLine();
                            management.addNewEmployee(id, name, sex, dOb, salary, address, idIndex);

                        } else {
                            System.out.println("Don't have any department");
                        }
                }
                if (ans == 3) {
                    management.updateFileData();
                    break;
                }
            }

        } catch (Exception ex) {
            System.out.println("Err: " + ex.getMessage());
        }
    }

}
