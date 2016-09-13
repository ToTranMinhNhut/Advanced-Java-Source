/**
 * 
 */
package ThreadCounter;

/**
 * @author hv
 * @version 1.0
 * @since 9/13/2016
 */
public class CounterThreadMain {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        //create 10 thread
        CounterThread[] listCounterThread = new CounterThread[10];

        for (int i = 0; i < 10; i++) {
            listCounterThread[i] = new CounterThread();
            String s = (i + 1) + "";
            listCounterThread[i].setName(s);
        }
        
        //start and join 10 thread
        for (int i = 0; i < 10; i++) {
            listCounterThread[i].start();;
            listCounterThread[i].join();
        }
    }
}


