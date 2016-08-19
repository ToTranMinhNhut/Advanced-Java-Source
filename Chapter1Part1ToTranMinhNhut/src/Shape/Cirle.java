/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 * @version 1.0
 * @author hv
 * @date 19/8/2016
 */
public class Cirle {

    Distance dis;
    final double PI = 3.14159;

    public Cirle() {
    }

    public Distance getDis() {
        return dis;
    }

    public void setDis(Distance dis) {
        this.dis = dis;
    }

    /*
     * @author hocvien
     * @version 1.0
     * @date 19/8/2016
     * The calculatePerimeterCirle() method caculate perimeter cirle
     * Input: not
     * Output: 'perimeter' valuable has double type, which contans perimeter value
     */
    public double calculatePerimeterCirle(Distance dis, Point startPoint, Point endPoint) {

        double radius = dis.distanceTwoPoints(startPoint, endPoint);
        double perimeter = radius * 2 * PI;
        return perimeter;
    }

    /*
     * @author hocvien
     * @version 1.0
     * @date 19/8/2016
     * The calculateAreaCirle() method caculate area cirle
     * Input: not
     * Output: 'area' valuable has double type, which contans area value
     */
    public double caculateAreaCirle(Distance dis, Point startPoint, Point endPoint) {
        double radius = dis.distanceTwoPoints(startPoint, endPoint);
        double area = radius * radius * PI;
        return area;
    }
}
