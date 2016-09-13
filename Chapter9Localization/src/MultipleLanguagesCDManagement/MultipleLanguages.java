/**
 * 
 */
package MultipleLanguagesCDManagement;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author hv
 *
 */
public class MultipleLanguages {

    private String language;
    private String country;
    private String path;
    
    public MultipleLanguages(String language, String country, String path) {
        super();
        this.language = language;
        this.country = country;
        this.path = path;
    }
   
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /*
     * This method is used for getting content in resource's language file
     * Input nothing
     * Output: return message contains content of resource's language file has ResourceBundle type
     */
    public ResourceBundle getResources() {
        Locale currentLocal = new Locale(language, country);
        
        ResourceBundle message;
        return message = ResourceBundle.getBundle(path, currentLocal);    
    }
}
