package ClassManagement;

import java.io.IOException;
import java.util.ArrayList;



/**
 * This class is used for processing businesses of instance class
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:34 PM
 */
public class Class {

	private String endDate;
	private String idContract;
	private String name;
	private int planNumOfPeriod;
	private String startDate;
	public ArrayList<Student> student;
	public ArrayList<Teacher> teacher;
	public ArrayList<Suject> subject;

	public Class(){
	    student = new ArrayList<>();
	    teacher = new ArrayList<>();
	    subject = new ArrayList<>();
	}

    public Class(String endDate, String idContract, String name,
            int planNumOfPeriod, String startDate, ArrayList<Student> student,
            ArrayList<Teacher> teacher, ArrayList<Suject> subject) {
        super();
        this.endDate = endDate;
        this.idContract = idContract;
        this.name = name;
        this.planNumOfPeriod = planNumOfPeriod;
        this.startDate = startDate;
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
    }
    
    /*
     * This method is used for viewing information of a class
     * Input: nothing;
     * Output: nothing;
     */
    void viewInformationClass() {
        System.out.println("--------------------Information of Class--------------------");
        System.out.println("Id of constract: " + idContract);
        System.out.println("Name: " + name);
        System.out.println("Start of date: " + startDate);
        System.out.println("End of date: " + endDate);
        System.out.println("The number of period in plan: " + planNumOfPeriod);
        
        System.out.println("----------------------------------------");
        int countTeacher = 0;
        for (Teacher t :  teacher) {
            System.out.println("\n-----Information of teacher " + (countTeacher + 1) + "-----");
            t.printInformation();
            countTeacher++;
        }
        
        System.out.println("----------------------------------------");
        int countStudent = 0;
        for (Student st : student) {
            System.out.println("\n-----Information of student " + (countStudent + 1) + "-----");
            st.printInformation();
            countStudent++;
        }
        
        System.out.println("----------------------------------------");
        int countSubject = 0;
        for (Suject s : subject) {
            System.out.println("\n-----Information of Subject " + (countSubject + 1) + "-----");
            s.printInformation();
            countSubject++;
        }
        System.out.println("----------------------------------------");
    }
    
    /*
     * This method is used for adding a teacher charge of subject to class
     * Input: nothing
     * Output: nothing
     */
    void addTeacher() throws IOException {
        Teacher t = new Teacher();
        t.inputInformation();
        t.setRoleInClass("Charge of subject");
        int index = teacher.size();
        teacher.add(index,t);
    }
    
    /*
     * This method is used for adding a student to class
     * Input: nothing
     * Output: nothing
     */
    void addStudent() throws IOException {
        Student st = new Student();
        st.inputInformation();
        int index = student.size();
        student.add(index,st);
    }
    
    /*
     * This method is used for adding a subject to class
     * Input: nothing
     * Output: nothing
     */
    void addSubject() throws IOException {
        Suject s = new Suject();
        s.inputInformation();
        int index = subject.size();
        subject.add(index,s);
    }
}