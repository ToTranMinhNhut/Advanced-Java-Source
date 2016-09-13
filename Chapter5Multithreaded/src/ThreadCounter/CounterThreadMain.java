/**
 * 
 */
package ThreadCounter;

import java.util.Random;
import java.util.Scanner;


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

        int[] arr = new int[10];
        int count = count(arr, 10);
        System.out.println("Sum: " + count);
    }
    // Sum of arr
    public static int count(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int count = 0;
        // Create and start numThreads.
        CounterThread[] ts = new CounterThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new CounterThread((i * len) / numThreads, ((i + 1) * len /numThreads), arr);
            ts[i].start();
            Thread.sleep(1000);
        }
        // Wait for the threads to finish and sum their results.
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
            count = ts[i].getSum();
        }
        return count;
    }
}
