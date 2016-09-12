/**
 * 
 */
package DocumentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minhnhutvaio
 *
 */
public class DocumentMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        Document document = new Document();
        
        try {
            System.out.println("Please enter a document:");
            string = input.readLine();

            document.tokenize(string);
            document.showInfo();
        } catch (NumberFormatException e) {
            System.out.println("Err: " + e.toString());
        }
    }

}
