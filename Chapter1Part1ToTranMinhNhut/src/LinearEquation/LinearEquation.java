/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1totranminhnhut.LinearEquation;

/**
 *
 * @author hv
 * @date: 19/8/2016
 * @version: 1.0
 */
public class LinearEquation {

    private double a;
    private double b;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /*
        1. The evalueteRoot() function make evaluate root of Linear Equation.
        2. author hv
        3. date: 19/8/2016
        4. @version: 1.0
        5. Input: not
        6. Output is a 'root' array have double type.
    */
    public double[] evalueteRoot() {
        double[] root = new double[3];
        if (a == 0 && b == 0) {
            root[1] = 1; // sustr root
        } else if (a == 0) {
            root[0] = 1;   // not root
        } else {
            root[2] = -b / a;
        }
        return root;
    }

}
