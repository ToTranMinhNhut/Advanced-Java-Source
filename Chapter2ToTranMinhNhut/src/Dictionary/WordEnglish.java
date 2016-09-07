package Dictionary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this class is used for processing businesses of instance word
 * 
 * @author hv
 * @version 1.0
 * @since 7/9/2016
 */
public class WordEnglish implements Comparable<WordEnglish>{

    private String word;
    private String meaning;
    
    
    public WordEnglish() {
        super();
    }

    public WordEnglish(String word, String meaning) {
        super();
        this.word = word;
        this.meaning = meaning;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the meaning
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * @param meaning the meaning to set
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    
    /*
     * this method is used for inputing a word english
     * Input nothing
     * Output nothing
     */
    public void inputWordEnglish() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter word english: ");
            word = input.readLine();
            
            System.out.println("Please enter meaning: ");
            meaning = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    /*
     * This method is used for printing a word english
     * input nothing
     * Output nothing
     */
    public void printWordEnglish() {
        System.out.println("Word: " + word);
        System.out.println("Meaning: " + meaning);
    }

    @Override
    public int compareTo(WordEnglish o) {
        return 0;
    }
}
