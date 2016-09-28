/**
 * 
 */
package StringLambdaPart3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hv
 * @version 1.0
 * @since 20/9/2016
 * 
 * The main class contains main method.
 */
public class StringLambdaMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListString listString = new ListString();
        List<String> strings = new ArrayList<>();
        
        // sort list string by the length's string from longest to short
        strings = listString.sortListStringFromLongToShort();
        
        // To print list of String
        System.out.println("List of strings has length's string from longest to shortest.\n");
        listString.displayListString(strings);;
        //-----------------------------------------------------------------------------
        
        // sort list string by the length's string from longest to short
        strings = listString.sortListStringFromShortToLong();
        
        // To print list of String
        System.out.println("List of strings has length's string from shortest to longest.\n");
        listString.displayListString(strings);;
        //-----------------------------------------------------------------------------
        
        // sort list string by alphabet character
        strings = listString.sortListStringByAlphabet();
        
        // To print list of String
        System.out.println("List of strings by alphabet character.\n");
        listString.displayListString(strings);;
        //-----------------------------------------------------------------------------
    }

}
