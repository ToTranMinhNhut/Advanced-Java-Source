/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class HumanMain {

    public static int max = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Teacher[] teacher = new Teacher[max];
        Student[] student = new Student[max];
        ListHuman list = new ListHuman();

        int nextStep = 1;
        int indexTC = 0;
        int indexST = 0;

        while (nextStep == 1) {
            int opt = 0;

            try {
                System.out.println("Please choose: <1 (Teacher) / 2 (Student)>:");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                teacher = list.addTeacher(teacher, indexTC);

                int numOfTeacher = indexTC + 1;
                list.printListTeacher(teacher, numOfTeacher);
            } else if (opt == 2) {
                student = list.addStudent(student, indexST);

                int numOfStudent = indexST + 1;
                list.printListStudent(student, numOfStudent);
            } else {
                throw new ArithmeticException("Please enter 1 or 2");
            }

            try {
                System.out.println("Do you continue add human? Choose: <1 (Yes) / 0 (No)>");
                nextStep = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (nextStep != 0 && nextStep != 1) {
                throw new ArithmeticException("Please only enter 1 or 0");
            } else if (nextStep == 1) {

                if (opt == 1) {
                    indexTC++;
                } else if (opt == 2) {
                    indexST++;
                }
            }
        }

    }

}
