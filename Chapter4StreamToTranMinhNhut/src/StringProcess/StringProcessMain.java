/**
 * 
 */
package StringProcess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author hv
 * @version 1.0
 * @since 12/9/2016
 */
public class StringProcessMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // create a list has 15 element
        List<String> strings1 = Arrays.asList("ab", "aa", "happy", "", "happy", "ab", "aaa123", "123456", "", "ighf", "0023dfs", "zuwxq", "123xx", "", "opop");
        
        // Pass list to stream and print the list that was created
        Stream<List<String>> stream = Stream.of(strings1);
        stream.forEach(s1 -> System.out.println("List1: " + s1));
        
        // Count "" element in list
        int count1 = (int) strings1.stream().filter(string -> string.isEmpty()).count();
        System.out.println("The number empty element: " + count1);
        
        // Count element has length is greater than 5
        int count2 = (int) strings1.stream().filter(string -> string.length() >= 5).count();
        System.out.println("The number element has length is greater than 5: " + count2);

        // count element has first char is 'a'
        int count3 = (int) strings1.stream().filter(string -> string.startsWith("a", 0)).count();
        System.out.println("The number element has first char is a: " + count3);
        
        // count element has
        int count4 = (int) strings1.stream().filter(string -> string.matches("happy")).count();
        System.out.println("The numer element is happy: " + count4);
        
        // create a second list contains elements is not empty by first list
        List<String>  strings2 = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("List 2: " + strings2);
        
        // create a third list contains elements has length between 3 and 6 by first list
        List<String> strings3 = strings1.stream().filter(string -> (string.length() >= 3 && string.length() <= 6)).collect(Collectors.toList());
        System.out.println("List 3: " + strings3);

        //create a fourth list contains elements is elements were appended 'happy' string
        List<String> strings4 = strings1.stream().map(string -> string + "happy").collect(Collectors.toList());
        System.out.println("List 4: " + strings4);

    }

}
