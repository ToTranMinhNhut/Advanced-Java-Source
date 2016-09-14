/**
 * 
 */
package IOResultSemaster;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 14/9/2016
 */
public class ListStudent {

    private List<Student> listStudent;
    
    public ListStudent() {
        super();
        listStudent = new ArrayList<Student>(0);
    }
    
    /**
     * @return the listStudent
     */
    public List<Student> getListStudent() {
        return listStudent;
    }

    /**
     * @param listStudent the listStudent to set
     */
    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    /*
     * This method is used for printing a list of student
     * Input nothing
     * Output nothing
     */
    public void printListStudent() {
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }
    
    /*
     * This method is used for adding a new student
     * Input nothing
     * Output nothing
     */
    public void addAStudent(Student st) {
        int index = listStudent.size();
        listStudent.add(index, st);
    }
    
    /*
     * This method is used for counting excellent student
     * Input nothing
     * Output return count value has int type
     */
    public int countExcellentStudent() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.calAverageMark() >= 8) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting good student
     * Input nothing
     * Output return count value has int type
     */
    public int countGoodStudent() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.calAverageMark() < 8 && student.calAverageMark() >= 7) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting average student
     * Input nothing
     * Output return count value has int type
     */
    public int countAverageStudent() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.calAverageMark() < 7 && student.calAverageMark() >= 5) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting weak student
     * Input nothing
     * Output return count value has int type
     */
    public int countWeakStudent() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.calAverageMark() <5) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting student in grade 12
     * Input nothing
     * Output return count value has int type
     */
    public int countStudentByGrade12() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 12) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting student in grade 11
     * Input nothing
     * Output return count value has int type
     */
    public int countStudentByGrade11() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 11) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for counting student in grade 10
     * Input nothing
     * Output return count value has int type
     */
    public int countStudentByGrade10() {
        int count = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 10) {
                count++;
            }
        }
        
        return count;
    }
    
    /*
     * This method is used for calculating mark's student in grade 12
     * Input nothing
     * Output return avg value has double type
     */
    public double calAverageMarkByGrade12() {
        int count  = 0;
        double sumMark = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 12) {
                count++;
                sumMark += student.calAverageMark();
            }
        }
        
        double avg = sumMark/count;
        
        return avg;
    }
    
    /*
     * This method is used for calculating mark's student in grade 11
     * Input nothing
     * Output return avg value has double type
     */
    public double calAverageMarkByGrade11() {
        int count  = 0;
        double sumMark = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 11) {
                count++;
                sumMark += student.calAverageMark();
            }
        }
        
        double avg = sumMark/count;
        
        return avg;
    }
    
    /*
     * This method is used for calculating mark's student in grade 10
     * Input nothing
     * Output return avg value has double type
     */
    public double calAverageMarkByGrade10() {
        int count  = 0;
        double sumMark = 0;
        
        for (Student student : listStudent) {
            if (student.getGrade() == 10) {
                count++;
                sumMark += student.calAverageMark();
            }
        }
        
        double avg = sumMark/count;
        
        return avg;
    }
}
