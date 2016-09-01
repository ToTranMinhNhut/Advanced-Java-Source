/**
 * 
 */
package FactoryShap;

/**
 * This class is used for processing businesses of instance ShapeFactory
 * 
 * @author hv
 * @version 1.0
 * @since 1/9/2016
 */
public class ShapeFactory {

    /*
     * This method is used for choosing a shape among circle, square, rectangle.
     * Input: the 'shareType' variable has String type
     * Output: return a object among Cirle, Square, Rectangle
     */
    public Shape getShape(String shapeType) {
        
        if (shapeType == null) {
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        
        return null;
    }
}
