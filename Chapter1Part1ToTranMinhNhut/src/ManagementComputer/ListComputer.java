/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementComputer;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.text.html.parser.DTD;

/**
 *
 * @author hv
 * @version
 * @date 22/8/2016
 *
 */
public class ListComputer {

    public ListComputer() {
    }

    /*
     * This method add to list desktop a desktop
     * Input: The 'dt' variable has Desktop array type and 'index' variable has int type
     * Output: The 'dt' variable has Desktop array type, which contains Desktop object
     */
    public Desktop[] addDesktop(Desktop[] dt, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number desktop is more 10");
        } else {
            Desktop d = new Desktop();
            d.inputInformation();
            dt[index] = d;
        }
        return dt;
    }

    /*
     * This print information list desktop
     * Input: The 'dt' variable has Desktop array type and 'numOfDesktop' variable has int type
     * OutPut: not
     */
    public void printListDesktop(Desktop[] dt, int numOfDesktop) {
        for (int i = 0; i < numOfDesktop; i++) {
            System.out.println("-----Information Desktop " + (i + 1) + "------");
            System.out.println(dt[i].printInformation());
        }
    }

    /*
     * This method calculate price of list desktop
     * Input: The 'dt' variable has Desktop array type and 'numOfDesktop' variable has int type
     * Output: The 'price' variable has double type, which contains price value
     */
    public double calPriceDesktop(Desktop[] dt, int numOfDesktop) {
        double price = 0;
        System.out.println("--------------------------");
        
        for (int i = 0; i < numOfDesktop; i++) {
            price += dt[i].calculatePrice();
        }
        return price;
    }

    /*
     * This method add to list laptop a laptop
     * Input: The 'lt' variable has Laptop array type and 'index' variable has int type
     * Output: The 'lt' variable has Laptop array type, which contains Laptop object
     */
    public Laptop[] addLaptop(Laptop[] lt, int index) throws IOException {

        if (index > 10) {
            throw new ArrayIndexOutOfBoundsException("The number desktop is more 10");
        } else {
            Laptop l = new Laptop();
            l.inputInformation();
            lt[index] = l;
        }
        return lt;
    }

    /*
     * This print information list laptop
     * Input: The 'lt' variable has Laptop array type and 'numOfDesktop' variable has int type
     * OutPut: not
     */
    public void printListLaptop(Laptop[] lt, int numOfDesktop) {
        for (int i = 0; i < numOfDesktop; i++) {
            System.out.println("-----Information Laptop " + (i + 1) + "------");
            System.out.println(lt[i].printInformation());
        }
    }
    
    /*
     * This method calculate price of list Laptop
     * Input: The 'lt' variable has Desktop array type and 'numOfDesktop' variable has int type
     * Output: The 'price' variable has double type, which contains price value
     */
    public double calPriceLaptop(Laptop[] lt, int numOfDesktop) {
        double price = 0;
        System.out.println("--------------------------");
        
        for (int i = 0; i < numOfDesktop; i++) {
            price += lt[i].calculatePrice();
        }
        return price;
    }
}
