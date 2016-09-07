package ClassManagement;

import java.io.IOException;
import java.util.ArrayList;



/**
 * This class is used for processing businesses of instance student
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:38 PM
 */
public class Student extends Humman {

	public Suject suject;
	public Score score;
	public ArrayList<DetailRollCall> detailRollCall;
	public AppreciateSubject appreciateSubject;
	
	public Student(){
	    detailRollCall = new ArrayList<>();
	    score = new Score();
	}
	
	public Student(String name, String birthOfDate, String phoneNumber, String email) {
	    this.name = name;
	    this.birthOfDate = birthOfDate;
	    this.phoneNumber = phoneNumber;
	    this.email = email;
	}
	
	
    /**
     * @return the score
     */
    public Score getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Score score) {
        this.score = score;
    }

    /**
     * @return the detailRollCall
     */
    public ArrayList<DetailRollCall> getDetailRollCall() {
        return detailRollCall;
    }

    /**
     * @param detailRollCall the detailRollCall to set
     */
    public void setDetailRollCall(ArrayList<DetailRollCall> detailRollCall) {
        this.detailRollCall = detailRollCall;
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
     * This method is used for printing information of student
     */
    @Override
    void printInformation() {
        // TODO Auto-generated method stub
        super.printInformation();
    }
    
    /*
     * This method is used rolling call student
     * Input nothing
     * Out nothing
     */
    void rollCallStudent() throws IOException {
        
        DetailRollCall d = new DetailRollCall();
        d.updateStateRollCall();
        int index = detailRollCall.size();
        detailRollCall.add(index, d);
    }
    
    /*
     * This method is used for printing roll call table of student
     * Input nothing
     * Output nothing
     */
    void printTableRollCallStudent() {
        
        System.out.println("---------------Table Roll Call---------------");
        System.out.println("Name student: " + name);
        int countRollCall = 0;
        for(DetailRollCall d : detailRollCall) {
            System.out.println("-----------Detail Roll call " + (countRollCall + 1) + "--------------");
            d.printDetailRollCall();
            countRollCall++;
        }
    }
    
    /*
     * This method is used for printing score table of student
     * Input nothing
     * Output nothing
     */
    void printScoreStudent() {
        
        System.out.println("Name student: " + name);
        System.out.println("Name subject: " + score.getSubject().getName());
        score.printScore();
    }
}