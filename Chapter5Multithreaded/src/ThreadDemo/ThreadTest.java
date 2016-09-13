/**
 * 
 */
package ThreadDemo;

/**
 * @author hv
 * @version 1.0
 * @since 13/9/2016
 */ 
public class ThreadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo("Google");
        t1.start();
        
        ThreadDemo t2 = new ThreadDemo("Yahoo");
        t2.start();
        
        ThreadDemo t3 = new ThreadDemo("Facebook");
        t3.start();
    }

}
