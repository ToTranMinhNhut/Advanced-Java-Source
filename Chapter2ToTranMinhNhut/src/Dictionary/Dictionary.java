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
     * 
     * 
     * 
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
     * 
     * 
     * 
     */
    public void addNewWord(WordEnglish word) {
        
    }
    
    /*
     * 
     * 
     * 
     */
    public void removeWord(WordEnglish word) {
        
    }
}
