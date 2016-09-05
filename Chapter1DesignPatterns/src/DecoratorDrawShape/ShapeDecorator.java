/**
 * 
 */
package DecoratorDrawShape;

/**
 * This abstract class is used for processing businesses of instance shape decorator
 * 
 * @author hv
 * @version 1.0
 * @since 5/9/2016
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        super();
        this.shape = shape;
    }

    /**
     * @return the shape
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /* (non-Javadoc)
     * @see DecoratorDrawShape.Shape#draw()
     * 
     * This method is used for drawing a shape
     * Input: nothing
     * Output: return the String
     */
    @Override
    public String draw() {
        return shape.draw();
    }
    
    
}
