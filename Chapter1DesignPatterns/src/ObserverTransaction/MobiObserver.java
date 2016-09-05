/**
 * 
 */
package ObserverTransaction;

/**
 * This method is used for processing businesses of instance mobile observer
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class MobiObserver extends Observer {

    public MobiObserver(Account account) {
        this.account = account;
        this.account.attach(this);
    }

    /* (non-Javadoc)
     * @see ObserverTransaction.Observer#update()
     * 
     * This method is used for updating state of account
     * Input: nothing
     * Output: return the string
     */
    @Override
    public String update() {
        return "Mobi: Hello. Your account have changed.\nThe balance in current: " + account.getState() + " vnd.";
    }
}
