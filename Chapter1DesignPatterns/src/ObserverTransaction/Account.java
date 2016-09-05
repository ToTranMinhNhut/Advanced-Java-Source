/**
 * 
 */
package ObserverTransaction;

import java.util.ArrayList;
import java.util.List;


/**
 * This class is used processing businesses of instance account
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class Account {
    
    private List<Observer> observers = new ArrayList<>();
    private double state;
    
    /**
     * @return the state
     */
    public double getState() {
        return state;
    }
    
    /**
     * @param state the state to set
     */
    public void setState(double state) {
        this.state = state;
        notifyAllObservers();
    }
    
    /*
     * this method is used for adding a new observer object
     * Input: the observer variable has Observer type
     * Output: nothing
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    /*
     * This method is used notify observer object
     * Input: nothing
     * Output: nothing
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
