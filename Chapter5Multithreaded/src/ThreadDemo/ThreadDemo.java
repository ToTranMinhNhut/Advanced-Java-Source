/**
 * 
 */
package ThreadDemo;

/**
 * @author hv
 * @version 1.0
 * @since 13/9/2016
 */
public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        
        System.out.println("Thread " + threadName + " exiting.");
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#start()
     */
    @Override
    public synchronized void start() {
        System.out.println("Starting " + threadName);
        
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }


}
