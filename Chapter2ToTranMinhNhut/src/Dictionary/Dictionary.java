/**
 * 
 */
package Dictionary;

import java.util.Map;
import java.util.TreeMap;



/**
 * this class is used for processing businesses of instance dictionary
 * 
 * @author hv
 * @version 1.0
 * @sine 7/9/2016
 */
public class Dictionary {

    private Map<String, String> listWord;

    
    public Dictionary() {
        super();
        listWord = new TreeMap<String, String>();
    }
    
    public Dictionary(Map listWord) {
        super();
        this.listWord = listWord;
    }
    
    /**
     * @return the listWord
     */
    public Map getListWord() {
        return listWord;
    }

    /**
     * @param listWord the listWord to set
     */
    public void setListWord(Map listWord) {
        this.listWord = listWord;
    }

    /*
     * This method is used for viewing all of words in dictionary
     * Input nothing
     * Output nothing
     */
    public void viewDictionary() {
        int countWord = 0;
        
        for (Object word : listWord.keySet()) {
            Object meaning = listWord.get(word);
         
            System.out.println((countWord + 1) + " " + word + " - " + meaning);
            countWord++;
        }
    }
    
    /*
     * This method is used for adding a new word english to dictionary
     * Input nothing
     * Output nothing
     */
    public void addNewWord(WordEnglish word) {
        listWord.put(word.getWord(), word.getMeaning());
    }
    
    /*
     * This method is used for searching a word in dictionary 
     * Input nothing
     * Output nothing
     */
    public void searchWord(String word) {
        
        if (listWord.containsKey(word)) {
            Object meaning = listWord.get(word);
            System.out.println("Result searching: " + word + " - " + meaning);
        } else {
            System.out.println("The word do not exists.");
        }
    }
    
    /*
     * This method is used for removing a word in dictionary
     * Input nothing
     * Output nothing
     */
    public void removeWord(String word) {
        Object meaning = listWord.get(word);

        if (listWord.remove(word) == null) {
            System.out.println("The word do not exists.");
        } else {
            System.out.println("Removed sucessful - word: " + word + " - " + meaning);
        }
    }
}
