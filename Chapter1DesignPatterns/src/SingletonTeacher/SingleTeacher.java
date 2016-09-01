/**
 * 
 */
package SingletonTeacher;

/**
 * 
 * This class is used for processing businesses of instance teacher
 * 
 * @author hv
 * @version 1.0
 * @since 1/9/2016
 */
public class SingleTeacher {
    
    private static SingleTeacher instance = new SingleTeacher();
    
    private SingleTeacher(){
    }
    
    public static SingleTeacher getInstance() {
        return instance;
    }
    
    /*
     * This method is used for sharing documents to student
     * Input: nothing
     * Output: return a string has content is share documents.
     */
    public String shareDocument() {
        return "Shared Document: \n - Chapter 1\n - Chapter 2\n - Chapter 3\n - Chapter 4";
    }
}
