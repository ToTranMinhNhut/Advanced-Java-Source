/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 * @version 1.0
 * @author hv
 * @date 19/8/2105
 */
public class Distance {

    public Distance() {
    }

    /*
     * @author hocvien
     * @version 1.0
     * @date 19/8/2016
     * The DistanceTowPoints() method calculte distance two points
     * Input: both valuables have Point type are PointA and PoinB
     * Output: 'distance' valuable have double type 
     */
    public double distanceTwoPoints(Point startPoint, Point endPoint) {
        double distance = Math.sqrt((startPoint.getX() - endPoint.getX()) * (startPoint.getX() - endPoint.getX())
                + (startPoint.getY() - endPoint.getY()) * (startPoint.getY() - endPoint.getY()));
        return distance;
    }

}
