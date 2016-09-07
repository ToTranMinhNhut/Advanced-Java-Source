/**
 * 
 */
package Dictionary;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author hv
 * @version 1.0
 * @sine 7/9/2016
 *
 */
public class DictionaryMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        WordEnglish word = new WordEnglish("student", "sinh vien / hoc sinh");
        
        
        demolistW.add(word);
      
        Dictionary dictionary = new Dictionary();
        dictionary.setListWord(demolistW);
        dictionary.viewDictionary();
    }

}
