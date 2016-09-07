package ClassManagement;



/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:44 PM
 */
public class DiligentScore {

	private double diligentScore;

	public DiligentScore(){
	}
	
    public DiligentScore(double diligentScore) {
        super();
        this.diligentScore = diligentScore;
    }

    /**
     * @return the diligentScore
     */
    public double getDiligentScore() {
        return diligentScore;
    }

    /**
     * @param diligentScore the diligentScore to set
     */
    public void setDiligentScore(double diligentScore) {
        this.diligentScore = diligentScore;
    }
    
    /*
     * This method is used for printing active score
     * Input: nothing
     * Output: nothing
     */
    void println() {
        System.out.println("Diligent score: " + diligentScore);
    }
}