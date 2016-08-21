/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 * @version 1.0
 * @author hv
 * @date 20/8/2016
 */
public class Rectangle {

    public Rectangle() {
    }
     
    /*
     * This method calculate with of rectanle
     * Input: the both 'startPoint' and 'endPoint' variables have Point type
     * Output: the 'width' variable double has type or 0
     */
    public double calculateWidth(Point startPoint, Point endPoint) {
        if (startPoint.getX() == 0 && endPoint.getX() == 0) {
            return 0;
        } else {
            double width = Math.abs(startPoint.getX() - endPoint.getX());
            return width;
        }
    }

    /*
     * This method calculate length of rectanle
     * Input: the both 'startPoint' and 'endPoint' variables have Point type
     * Output: the 'length' valuable double type or 0
     */
    public double calculateLength(Point startPoint, Point endPoint) {
        if (startPoint.getY() == 0 && endPoint.getY() == 0) {
            return 0;
        } else {
            double length = Math.abs(startPoint.getY() - endPoint.getY());
            return length;
        }
    }

    /*
     * This method calculate perimeter of rectangle
     * Input: the both 'startPoint' and 'endPoint' variables have Point type
     * Output: the 'per' variable double type
     */
    public double calPerimeterRectangle(Point startPoint, Point endPoint) {
        double per = 0;
        double length = calculateWidth(startPoint, endPoint);
        double width = calculateWidth(startPoint, endPoint);
        
        if (length != 0 && width != 0) {
            per = (length + width) * 2;
        }
        return per;
    }

    /*
     * This method calculate area of rectangle
     * Input: the both 'startPoint' and 'endPoint' variables have Point type
     * Output: the 'area' variable double type
     */
    public double calAreaRectangle(Point startPoint, Point endPoint) {
        double area = 0;
        double length = calculateWidth(startPoint, endPoint);
        double width = calculateWidth(startPoint, endPoint);
        
        if (length != 0 && width != 0) {
            area = length * width;
        }
        return area;
    }
}
