/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1totranminhnhut.Operator;

/**
 *
 * @author hv
 * @date: 19/8/2016
 * @version: 1.0
 */
public class Operator {

    private double firstNumber;
    private double secondNumber;

    public Operator() {
    }

    public Operator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /*
     1. The plus() function make calculator plus for two number.
     2. author hv
     3. date: 19/8/2016
     4. @version: 1.0
     5. Input: not
     6. Output is a 'sum' valuable have double type.
     */
    public double plus() {
        double sum = firstNumber + secondNumber;
        return sum;
    }

    /*
     1. The minus() function make calculator subtract for two number.
     2. author hv
     3. date: 19/8/2016
     4. @version: 1.0
     5. Input: not
     6. Output is a 'sub' valuable have double type.
     */
    public double minus() {
        double sub = firstNumber - secondNumber;
        return sub;
    }

    /*
     1. The product() function make calculator product for two numbers.
     2. author hv
     3. date: 19/8/2016
     4. @version: 1.0
     5. Input: not
     6. Output is a 'pro' valuable have double type.
     */
    public double product() {
        double pro = firstNumber * secondNumber;
        return pro;
    }

    /*
     1. The devide() function make calculator devide for two numbers.
     2. author hv
     3. date: 19/8/2016
     4. @version: 1.0
     5. Input: not
     6. Output is a 'dev' valuable have double type.
     */
    public double devide() {

        if (secondNumber == 0) {
            throw new ArithmeticException("Second number must has value differ 0");
        }

        double dev = firstNumber / secondNumber;
        return dev;
    }
}
