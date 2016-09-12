/**
 * 
 */
package NumberProcess;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hv
 * @version 1.0
 * @since 12/9/2016
 */
public class NumberProcessMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // create a number list has 15 element.
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,15);
        System.out.println("List1: " + numbers1);

        // create a number list 2 contains elements has 
        List<Integer> numbers2 = numbers1.stream().map(n -> (n*n)).collect(Collectors.toList());
        System.out.println("List2: " + numbers2);

        IntSummaryStatistics stats = numbers2.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in list 2: " + stats.getMax());
        System.out.println("Lowest number in list 2: " + stats.getMin());
        System.out.println("Sum all of numbers in list 2: " + stats.getSum());
        System.out.println("Averge all of number in list 2: " + stats.getAverage());

        List<Integer> numbers3 = numbers2.stream().filter(x -> checkPrimeNumber(x)).collect(Collectors.toList());
        System.out.println("List3: " + numbers3);

        List<Integer> numbers4 = numbers3.stream().filter(x -> checkSquareNumber(x)).collect(Collectors.toList());
        System.out.println("List3: " + numbers4);
    }

    public static boolean checkPrimeNumber(int primeNumber) {
        int count = 1;

        for (int i = 2; i <= primeNumber; i++) {
            if (primeNumber % i == 0) {
                count++;
            }
        }
        
        if (count == 2) {
            return true;
        }
        return false;
    }
    
    public static boolean checkSquareNumber(int squareNumber) {
        
        for (int i = 0; i < squareNumber; i++) {
            if (i * i == squareNumber) {
                return true;
            }
        }
        return false;
    }
}
