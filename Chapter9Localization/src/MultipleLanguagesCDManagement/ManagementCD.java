package MultipleLanguagesCDManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ResourceBundle;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @since 7/9/2016
 */
public class ManagementCD {

    public static final int maxNumOfCD = 10;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        /*
         * Firstly, To enter information of a cd,
         * the program will sort cd list with name's cd,
         * Then, print information of the cd list and total price of cd list.
         * Then, To choose continue to add a new cd or not.
         */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ListCD listCd = new ListCD();
        
        System.out.println("Please choose: < 1 (English) or 2 (Vietnamese>).");
        int lan = 0;
        try {
            lan = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        ResourceBundle message;
        if (lan != 1 && lan != 2) {
            throw new ArithmeticException("Please enter only 1 or 2.");
        } else if (lan == 1) {
            String language = "en";
            String country = "US";
            String path = "MultipleLanguagesCDManagement/resource_en_US";
            MultipleLanguages mulLan = new MultipleLanguages(language, country, path);
            message = mulLan.getResources();
        } else {
            String language = "vi";
            String country = "VN";
            String path = "MultipleLanguagesCDManagement/resource_vi_VN";
            MultipleLanguages mulLan = new MultipleLanguages(language, country, path);
            message = mulLan.getResources();
        }
        
        
        int opt = 1;
        while (opt == 1) {
            CD cd = new CD();
            cd.inputInformation(message);
         
            listCd.addCDToList(cd);
            Collections.sort(listCd.getListCD());
            listCd.printListCD(message);
            
            double totalPrice = listCd.calPriceOfListCD();
            System.out.println(message.getString("sumprice") + ": " + totalPrice);
            
            System.out.println("--------------------------");
            
            System.out.println(message.getString("continue") + " <1-" +
                    message.getString("yes") + " or 0-" + message.getString("no"));
            opt = Integer.parseInt(input.readLine());
            
            if (opt != 1 && opt != 0) {
                throw new ArithmeticException("Please only enter 1 or 0.");
            }
        }

        System.out.println(message.getString("finish"));
    }

}
