/**
 * 
 */
package DecoratorDrawShape;

/**
 * This class is used for processing businesses of instance red shape decorator
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    /* (non-Javadoc)
     * @see DecoratorDrawShape.ShapeDecorator#draw()
     * 
     * This method is used for drawing a shape with red border
     * Input: nothing
     * Output: return the string
     */
    @Override
    public String draw() {
        return this.shape.draw() +  " and " + setBorder(shape);
    }
    
    private String setBorder(Shape shape) {
        return "Border color: red";
    }
}
