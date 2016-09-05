/**
 * 
 */
package DecoratorDrawShape;

/**
 * This class is used for processing businesses of instance Circle
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class Circle implements Shape {

    /* (non-Javadoc)
     * @see DecoratorDrawShape.Shape#draw()
     * 
     * This method is used for drawing a circle
     * Input: nothing
     * Output: return a String
     */
    @Override
    public String draw() {
        return "Shape: Circle";
    }
}
