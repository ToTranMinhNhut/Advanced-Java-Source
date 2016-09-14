/**
 * 
 */
package IODocument;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

        String string = "";
        String content = "";
        Document document = new Document();

        try (BufferedReader in = new BufferedReader(new FileReader("src/IODocument/demoTxt.txt"))) {

            while ((string = in.readLine()) != null) {
                
                content += string;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Content " + content);
        document.tokenize(content);
        document.showInfo();

    }

}
