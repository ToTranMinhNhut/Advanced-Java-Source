/**
 * 
 */
package FactoryShap;

/**
 * This class is used for processing businesses of instance square
 * 
 * @author hv
 * @version 1.0
 * @sine 1/9/2016
 */
public class Square implements Shape{

    /* (non-Javadoc)
     * @see FactoryShap.Shape#draw()
     * 
     * This method is used for drawing a square
     * Input: nothing
     * Output: nothing
     */
    @Override
    public void draw() {
        
        System.out.println("You are drawing a SQUARE");
    }
}
