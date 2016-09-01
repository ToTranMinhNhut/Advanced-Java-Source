/**
 * 
 */
package FactoryShap;

/**
 * This class is used for processing businesses of instance Circle
 * 
 * @author hv
 * @version 1.0
 * @since 1/9/2016
 */
public class Circle implements Shape{

    /* (non-Javadoc)
     * @see FactoryShap.Shape#draw()
     * 
     * This method is used for drawing a circle
     * Input: nothing
     * Output: nothing
     */
    @Override
    public void draw() {
        
        System.out.println("You are drawing a CIRCLE.");
    }
}
