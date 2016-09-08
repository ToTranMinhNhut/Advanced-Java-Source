/**
 * 
 */
package StudentManagement;

import java.util.Map;
import java.util.TreeMap;


/**
 * This class is used for processing businesses of instance list student
 * 
 * @author minhnhutvaio
 * @version 1.0
 * @since 8/9/2016
 */
public class ListStudent {

    Map<String, Student> listStudent;

    public ListStudent() {
        super();
        listStudent = new TreeMap<String, Student>();
    }

    public ListStudent(Map<String, Student> listStudent) {
        super();
        this.listStudent = listStudent;
    }

    public Map<String, Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(Map<String, Student> listStudent) {
        this.listStudent = listStudent;
    }
    
    /*
     * This method is used for viewing all of students in list's student
     * Input nothing
     * Output nothing
     */
    public void viewListInformationStudent() {
        int countStudent = 0;
        
        for (String id : listStudent.keySet()) {
            Student student = listStudent.get(id);
            
            System.out.println("-----Information student" + (countStudent + 1) + "-----");
            student.printInformation();
            countStudent++;
        }
    }
    
    /*
     * This method is used for adding a new student to list's student
     * Input nothing
     * Output nothing
     */
    public void addNewStudent(Student student) {
        listStudent.put(student.getId(), student);
    }
    
    /*
     * This method is used for searching a student in list's student 
     * Input nothing
     * Output nothing
     */
    public void searchStudent(String id) {
        
        if (listStudent.containsKey(id)) {
            Student student = listStudent.get(id);
            student.printInformation();
        } else {
            System.out.println("The word do not exists.");
        }
    }
    
    /*
     * This method is used for removing a student in list's student
     * Input nothing
     * Output nothing
     */
    public void removeStudent(String id) {

        if (listStudent.remove(id) == null) {
            System.out.println("The word do not exists.");
        } else {
            System.out.println("Removed sucess student");
        }
    }
}
