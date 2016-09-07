package ClassManagement;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.Subject;



/**
 * this class is used for processing businesses of instance teacher
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:36 PM
 */
public class Teacher extends Humman {

	private String roleInClass;
	public ArrayList<Subject> subject;
	public AppreciateSubject appreciateSubject;

	public Teacher(){
	    subject = new ArrayList<>();
	}
	
	public Teacher(String name, String birthOfDate, String phoneNumber, String email
	        , String roleInClass) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.roleInClass = roleInClass;
    }
	
    /**
     * @return the roleInClass
     */
    public String getRoleInClass() {
        return roleInClass;
    }

    /**
     * @param roleInClass the roleInClass to set
     */
    public void setRoleInClass(String roleInClass) {
        this.roleInClass = roleInClass;
    }

    /**
     * @return the subject
     */
    public ArrayList<Subject> getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    /* (non-Javadoc)
     * @see ClassManagement.Humman#inputInformation()
     */
    @Override
    void inputInformation() throws IOException {
        super.inputInformation();
    }

    /* (non-Javadoc)
     * @see ClassManagement.Humman#printInformation()
     * 
     * This method is used for printing information of teacher
     */
    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Role in class: " + roleInClass);
    }
    
}