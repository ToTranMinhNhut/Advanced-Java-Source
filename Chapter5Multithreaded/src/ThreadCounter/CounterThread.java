/**
 * 
 */
package ThreadCounter;

/**
 * @author hv
 *
 */
public class CounterThread extends Thread{

    private static int count = 0;

    @Override
    public void run() {
        try {
            counter();

        } catch (InterruptedException e) {
            System.err.printf(e.toString());
        }
    }

    public synchronized void counter() throws InterruptedException {
        int temp = 0;
        while (true) {

            System.out.println("thread running : " + Thread.currentThread().getName());
            count++;
            System.out.println("count is " + count + "\n");

            temp++;
            if (temp == 10) {
                break;
            }
            Thread.currentThread();
            //the current thread go to sleep
            Thread.sleep(1000);
        }
    }
}
