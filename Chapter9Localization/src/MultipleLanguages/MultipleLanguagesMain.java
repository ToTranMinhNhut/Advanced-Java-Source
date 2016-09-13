package MultipleLanguages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 */

/**
 * @author hv
 *
 */
public class MultipleLanguagesMain {

    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choose: < 1 (English) or 2 (Vietnamese>).");
        int opt = 0;
        opt = Integer.parseInt(input.readLine());

        if (opt != 1 && opt != 2) {
            throw new ArithmeticException("Please enter only 1 or 2.");
        } else if (opt == 1){
            String language = "en";
            String country = "US";
            Locale currentLocal = new Locale(language, country);
            String path = "MultipleLanguages/resource_en_US";
            getResources(currentLocal, path);
        } else {
            String language = "vi";
            String country = "VN";
            Locale currentLocal = new Locale(language, country);
            String path = "MultipleLanguages/resource_vi_VN";
            getResources(currentLocal, path);
        }
    }

    public static void getResources(Locale currentLocal, String path) {
        ResourceBundle message;
        message = ResourceBundle.getBundle(path, currentLocal);

        List<String> list = new ArrayList<>();
        Enumeration<String> keys = message.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = message.getString(key);
            list.add(value);
        }

        // Print list
        for (String string : list) {
            System.out.println(string);
        }
    }
}
