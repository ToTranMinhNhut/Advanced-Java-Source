/**
 * 
 */
package ObserverTransaction;

/**
 * This abstract class is used for processing businesses of instance observer
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public abstract class Observer {
    
    protected Account account;
    
    public abstract String update();
}
