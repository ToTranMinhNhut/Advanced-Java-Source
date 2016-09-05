/**
 * 
 */
package DecoratorDrawShape;

/**
 * This class is used for processing businesses of instance rectangle
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class Rectangle implements Shape {

    /* (non-Javadoc)
     * @see DecoratorDrawShape.Shape#draw()
     * 
     * This method is used for drawing a rectangle
     * Input: nothing
     * Output: return a string
     */
    @Override
    public String draw() {
        return "Shape: Rectangle";
    }
}
