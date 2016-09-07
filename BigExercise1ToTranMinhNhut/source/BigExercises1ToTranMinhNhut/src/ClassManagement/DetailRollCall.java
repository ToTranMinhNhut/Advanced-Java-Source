package ClassManagement;

import java.io.IOException;

/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:43 PM
 */
public class DetailRollCall {

	public DiligentScore diligentScore;
	public RollCall rollCall;
	final int SCORE1 = 10;
	final int SCORE2 = 5;
	final int SCORE3 = 0;
	
	public DetailRollCall(){
	    rollCall = new RollCall();
	    diligentScore = new DiligentScore();
	}
	
	
	public DetailRollCall(DiligentScore diligentScore, RollCall rollCall) {
        super();
        this.diligentScore = diligentScore;
        this.rollCall = rollCall;
    }


    /*
	 * 
	 * 
	 */
	void updateStateRollCall() throws IOException {
	    rollCall.inputStateRollCall();
	    
	    if (rollCall.getState().equalsIgnoreCase(rollCall.getPRESENT())) {
            diligentScore.setDiligentScore(SCORE1);
            
        } else if (rollCall.getState().equalsIgnoreCase(rollCall.getADSENT())) {
            diligentScore.setDiligentScore(SCORE3);
            
        } else if (rollCall.getState().equalsIgnoreCase(rollCall.getLATE())) {
            diligentScore.setDiligentScore(SCORE2);
            
        } else if (rollCall.getState().equalsIgnoreCase(rollCall.getEARLY())) {
            diligentScore.setDiligentScore(SCORE2);
        }
	}
	
	void printDetailRollCall() {
	    System.out.println("State: " + rollCall.getState());
	    System.out.println("Score: " + diligentScore.getDiligentScore());
	}
}