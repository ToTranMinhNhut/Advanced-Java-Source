
package ProxyImage;

/**
 *
 * @author hv
 */
public class mainProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();

    }

}
