/**
 * 
 */
package ThreadArray;

import java.util.Random;
import java.util.Scanner;

/**
 * @author hv
 * @version 1.0
 * @since 9/13/2016
 */
public class SumOfArrayThread {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println("Input num of Threads: ");
        int numThreads = input.nextInt();
        int sum = sum(arr, numThreads);
        String strArr = "";
        for (int value : arr) {
            strArr += value + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Sum: " + sum);
    }
    
    // Sum of arr
    public static int sum(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int sum = 0;
        // Create and start numThreads.
        SumThread[] ts = new SumThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new SumThread((i * len) / numThreads, ((i + 1) * len /numThreads), arr);
            ts[i].start();
        }
        // Wait for the threads to finish and sum their results.
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
            sum += ts[i].getSum();
        }
        return sum;
    }

}
