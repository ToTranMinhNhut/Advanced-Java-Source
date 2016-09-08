/**
 * 
 */
package Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author hv
 * @version 1.0
 * @sine 7/9/2016
 *
 */
public class DictionaryMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // demo data list word english in dictionary.
        
        WordEnglish demoword = new WordEnglish("student", "sinh vien / hoc sinh");
        Map<String, String> demolistW = new TreeMap<String, String>();

        demolistW.put(demoword.getWord(), demoword.getMeaning());
        demolistW.put("car", "xe hoi");
        demolistW.put("house", "can nha");
        
        //--------------------------------------------------
        
        Dictionary dictionary = new Dictionary();
        dictionary.setListWord(demolistW);

        /*
         * To choose and make a function among four functions below.
         * When function finish, you can choose out program or continue to make program
         * 
         */
        boolean nextStep = true;

        while (nextStep) {

            System.out.println("----------Dictionary----------");
            System.out.println("1. View all of words in dictionary.");
            System.out.println("2. Add a new word to dictionary.");
            System.out.println("3. Search a word in dictionary.");
            System.out.println("4. Remove a word in dictionary.");
            System.out.println("--------------------------------");

            int opt = 0;

            System.out.println("Please choose a function: ");
            try {
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (opt == 1) {
                dictionary.viewDictionary();

            } else if (opt == 2) {
                WordEnglish word = new WordEnglish();
                word.inputWordEnglish();
                dictionary.addNewWord(word);

            } else if (opt == 3) {
                System.out.println("Please enter word that would to search: ");

                String wordSearching = "";
                
                try {
                    wordSearching = input.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.toString());
                }
                
                dictionary.searchWord(wordSearching);

            } else if (opt == 4) {
                System.out.println("Please enter word that would to remove: ");

                String wordRemoving = "";
                
                try {
                    wordRemoving = input.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.toString());
                }
                
                dictionary.removeWord(wordRemoving);
                
            } else {
                throw new ArithmeticException("The function do not exists.");
            }

            int choose = 0;
            System.out.println("----------------------------------------");
            System.out.println("\nDo you finish program. Please choose: <1 (Yes) / 0 (No)>");

            try {
                choose = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }

            if (choose != 1 && choose != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            } else if (choose == 1) {
                nextStep = false;
            }
        }
    }

}
