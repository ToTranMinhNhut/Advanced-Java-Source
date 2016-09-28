/**
 * 
 */
package StringLambdaPart3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 20/9/2016
 * 
 * This class is used to process businesses of instance list String
 */
public class ListString {

    private List<String> strings = new ArrayList<String>();

    /*
     * This constructor method is used to init ListString and create list string 
     * Input nothing
     * Output nothing
     */
    public ListString() {
        super();
        strings.add("abc");
        strings.add("abc xyz");
        strings.add("123456789");
        strings.add("abc 123");
        strings.add("999");
        strings.add("to tran minh nhut");
        strings.add("global cybersoft");
        strings.add("ho chi minh");
        strings.add("x");
        strings.add("abc111222");
    }
    
    
    /**
     * @return the strings
     */
    public List<String> getStrings() {
        return strings;
    }


    /**
     * @param strings the strings to set
     */
    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    /*
     * This method is used to sort list String by length's string from longest to shortest
     * Input nothing
     * Output return listString List has String type
     */
    public List<String> sortListStringFromLongToShort() {
        List<String> listString = new ArrayList<String>(strings);
        Comparator<String> comparation = (String s1, String s2) -> Integer.valueOf(s2.length()).compareTo(Integer.valueOf(s1.length()));
        listString.sort(comparation);
        return listString;
    }
    
    /*
     * This method is used to sort list String by length's string from shortest to longest
     * Input nothing
     * Output return listString List has String type
     */
    public  List<String> sortListStringFromShortToLong() {
        List<String> listString = new ArrayList<String>(strings);
        Comparator<String> comparation = (String s1, String s2) -> Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()));
        listString.sort(comparation);
        return listString;
    }

    /*
     * This method is used to sort list String by alphabet character
     * Input nothing
     * Output return listString List has String type
     */
    public  List<String> sortListStringByAlphabet() {
        List<String> alphabet = new ArrayList<String>(strings);
        Comparator<String> comparation = (String a, String b) -> a.compareTo(b);
        alphabet.sort(comparation);
        return alphabet;
    }

    /*
     * This method is used to print list of string
     * Input strings List has String type
     * Output nothing
     */
    public void displayListString(List<String> strings) {
        strings.forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
    }
    
}
