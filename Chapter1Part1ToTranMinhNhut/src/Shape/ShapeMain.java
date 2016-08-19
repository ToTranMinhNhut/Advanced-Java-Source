package Shape;

import Shape.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hv
 */
public class ShapeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Point pointA = new Point();
        Point pointB = new Point();

        try {

            System.out.println("Please enter coordinate of A point");
            System.out.print("x = ");
            int xA = Integer.parseInt(input.readLine());
            pointA.setX(xA);

            System.out.print("y = ");
            int yA = Integer.parseInt(input.readLine());
            pointA.setY(yA);

            System.out.println("Please enter coordinate of B point");
            System.out.print("x = ");
            int xB = Integer.parseInt(input.readLine());
            pointB.setX(xB);

            System.out.print("y = ");
            int yB = Integer.parseInt(input.readLine());
            pointB.setY(yB);

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }

        Distance distanceAB = new Distance();
        double disAB = distanceAB.distanceTwoPoints(pointA, pointB);
        System.out.println("Distance A point and B point: " + disAB);

        // Cirle
        Cirle c = new Cirle();
        double perimeterCirle = c.calculatePerimeterCirle(distanceAB, pointA, pointB);
        System.out.println("Cirle Perimeter = " + perimeterCirle);

        double areaCirle = c.caculateAreaCirle(distanceAB, pointA, pointB);
        System.out.println("Cirle Area = " + areaCirle);
    }

}
