/**
 * 
 */
package ThreadMaxEInArray;

import java.util.Random;
import java.util.Scanner;

import ThreadArray.SumThread;

/**
 * @author hv
 *
 */
public class MaxElementInArrayThread {

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
            arr[i] = random.nextInt(100);
        }
        System.out.println("Input num of Threads: ");
        int numThreads = input.nextInt();
        int max = max(arr, numThreads);
        String strArr = "";
        for (int value : arr) {
            strArr += value + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Max: " + max);
    }

    // Max of arr
    public static int max(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int max = 0;
        // Create and start numThreads.
        MaxThread[] ts = new MaxThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new MaxThread((i * len) / numThreads, ((i + 1) * len /numThreads), arr);
            ts[i].start();
        }
        // Wait for the threads to finish and sum their results.
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
            if (max < ts[i].getMax()) {
                max = ts[i].getMax();
            }
        }
        return max;
    }
}
