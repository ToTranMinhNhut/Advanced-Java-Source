/**
 * 
 */
package ObserverTransaction;

/**
 * This class is used for processing businesses of instance email observer
 * 
 * @author hv
 * @version
 * @since 5/9/2016
 */
public class EmailObserver extends Observer{

    public EmailObserver(Account account) {
        this.account = account;
        this.account.attach(this);
    }

    /* (non-Javadoc)
     * @see ObserverTransaction.Observer#update()
     * 
     * This method is used for update state the account
     * Input: nothing
     * Output:returnt a string
     */
    @Override
    public String update() {
        return "Email. Welcom to ABC bank. Your account have changed.\n The balance in current: " + account.getState() + " vnd.";
    }
}
