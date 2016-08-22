/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementInformation;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class ListHuman {

    public ListHuman() {
    }

    /*
     * This method add a teacher to list teacher
     * Input: The 'teacher' variable has Teacher array type and 'index' variable has int type
     * Output: The 'teacher' variable has Teacher array type, which contains Teacher object
     */
    public Teacher[] addTeacher(Teacher[] teacher, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number teacher higher default number");
        } else {
            Teacher t = new Teacher();
            t.inputInformation();
            teacher[index] = t;
        }
        return teacher;
    }

    /*
     * This method print a list teacher
     * Input: The 'teacher' variable has Teacher array type and 'numOfTeacher' variable has int type
     * Output: not
     */
    public void printListTeacher(Teacher[] teacher, int numOfTeacher) {

        for (int i = 0; i < numOfTeacher; i++) {
            System.out.println("---------Information Teacher " + (i + 1) + "----------------");
            System.out.println(teacher[i].printInformation());
        }
    }

    /*
     * This method add a student to list student
     * Input: The 'student' variable has Student array type and 'index' variable has int type
     * Output: The 'student' variable has Student array type, which contains Student object
     */
    public Student[] addStudent(Student[] student, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number teacher higher default number");
        } else {
            Student st = new Student();
            st.inputInformation();
            student[index] = st;
        }
        return student;
    }

    /*
     * This method print a list student
     * Input: The 'student' variable has Student array type and 'numOfStudent' variable has int type
     * Output: not
     */
    public void printListStudent(Student[] student, int numOfStudent) {

        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("---------Information Student " + (i + 1) + "----------------:");
            System.out.println(student[i].printInformation());
        }
    }
}
