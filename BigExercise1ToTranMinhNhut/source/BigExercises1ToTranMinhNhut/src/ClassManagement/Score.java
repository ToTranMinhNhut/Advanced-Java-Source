package ClassManagement;

import java.util.ArrayList;

/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 1:57:40 PM
 */
public class Score implements CalculateScore{

	public ScoreOfExam scoreOfExam;
	public DiligentScore diligentScore;
	public ExercisesScore exercisesScore;
	public ActiveScore activeScore;
	public AppreciateSubject appreciateSubject;
	public Suject subject;

	public Score(){
	}
	
	public Score(ScoreOfExam scoreOfExam, DiligentScore diligentScore, ExercisesScore exercisesScore,
            ActiveScore activeScore, Suject subject) {
        super();
        this.scoreOfExam = scoreOfExam;
        this.diligentScore = diligentScore;
        this.exercisesScore = exercisesScore;
        this.activeScore = activeScore;
        this.subject = subject;
    }
	
	/**
     * @return the scoreOfExam
     */
    public ScoreOfExam getScoreOfExam() {
        return scoreOfExam;
    }

    /**
     * @param scoreOfExam the scoreOfExam to set
     */
    public void setScoreOfExam(ScoreOfExam scoreOfExam) {
        this.scoreOfExam = scoreOfExam;
    }

    /**
     * @return the diligentScore
     */
    public DiligentScore getDiligentScore() {
        return diligentScore;
    }

    /**
     * @param diligentScore the diligentScore to set
     */
    public void setDiligentScore(DiligentScore diligentScore) {
        this.diligentScore = diligentScore;
    }

    /**
     * @return the exercisesScore
     */
    public ExercisesScore getExercisesScore() {
        return exercisesScore;
    }

    /**
     * @param exercisesScore the exercisesScore to set
     */
    public void setExercisesScore(ExercisesScore exercisesScore) {
        this.exercisesScore = exercisesScore;
    }

    /**
     * @return the activeScore
     */
    public ActiveScore getActiveScore() {
        return activeScore;
    }

    /**
     * @param activeScore the activeScore to set
     */
    public void setActiveScore(ActiveScore activeScore) {
        this.activeScore = activeScore;
    }

    /**
     * @return the appreciateSubject
     */
    public AppreciateSubject getAppreciateSubject() {
        return appreciateSubject;
    }

    /**
     * @param appreciateSubject the appreciateSubject to set
     */
    public void setAppreciateSubject(AppreciateSubject appreciateSubject) {
        this.appreciateSubject = appreciateSubject;
    }

    /**
     * @return the subject
     */
    public Suject getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(Suject subject) {
        this.subject = subject;
    }
    
    /*
     * (non-Javadoc)
     * @see ClassManagement.CalculateScore#calScoreClassPeriod()
     * 
     * This method is used for calculating score of a class period
     * Input nothing
     * Output return value has double
     */
    @Override
    public double calScoreClassPeriod(){
		return diligentScore.getDiligentScore() * 0.3 + activeScore.getActiveScore() * 0.1 + exercisesScore.getExerciseScore() * 0.6;
	}
	
    /*
     * (non-Javadoc)
     * @see ClassManagement.CalculateScore#calScorePersonalOfSuject()
     * 
     * This method is used for calculating personal score of student in subject
     * Input nothing
     * Output return value has double
     */
	@Override
	public double calScorePersonalOfSuject(){
		int totalPeriod = subject.getNumOfperiod() / 4;
	    double totalScorePeriod = 0;
	    
	    for (int i = 0; i < totalPeriod; i++ ) {
	        totalScorePeriod += calScoreClassPeriod();
	    }
		
	    return totalScorePeriod / totalPeriod;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ClassManagement.CalculateScore#calScoreFinishSuject()
	 * 
	 * This method is used for calculating subject finish score
     * Input nothing
     * Output return value has double
	 */
	@Override
	public double calScoreFinishSuject(){
        return calScoreClassPeriod() * 0.3 + scoreOfExam.getScoreMultipleChoiceTest() * 0.4 + scoreOfExam.getScorePracticeTest() * 0.3;
    }
	
	void printScore() {
	    activeScore.println();
	    exercisesScore.println();
	    diligentScore.println();
	    scoreOfExam.println();
	    
	    System.out.println("Score of class period: " + calScoreClassPeriod());
	    System.out.println("Personal Score: " + calScoreClassPeriod());
	    System.out.println("Finish subject Score: " + calScoreFinishSuject());

	}

}