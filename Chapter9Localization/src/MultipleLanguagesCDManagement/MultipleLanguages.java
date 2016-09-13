/**
 * 
 */
package MultipleLanguagesCDManagement;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author hv
 *
 */
public class MultipleLanguages {

    private String language;
    private String country;
    private Locale currentLocal;
    private String path;
    private ResourceBundle message;
    
    message = ResourceBundle.getBundle(path, currentLocal);

    List<String> list = new ArrayList<>();
    Enumeration<String> keys = message.getKeys();
    while (keys.hasMoreElements()) {
        String key = keys.nextElement();
        String value = message.getString(key);
        list.add(value);
    }
}
