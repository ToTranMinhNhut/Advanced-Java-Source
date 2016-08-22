/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementLibrary;

import java.io.IOException;

/**
 *
 * @author minhnhutvaio
 */
public class ListBook {

    public ListBook() {
    }

    /*
     * This method add a textbook to list textbook
     * Input: the 'listTB' variable has TextBook array type and 'index' variable has int type
     * Output: the 'listTB' variable has TextBook array type, which contains TextBook object
     */
    public TextBook[] addTextBook(TextBook[] listTB, int index) throws IOException {

        if (index > 100) {
            throw new ArithmeticException("the number book higher default number");
        } else {
            TextBook tb = new TextBook();
            tb.inputInformation();
            listTB[index] = tb;
        }

        return listTB;
    }

    /*
     * This method print a list textbook
     * Input: the 'listTB' variable has TextBook array type and 'index' variable has int type
     * Output: not
     */
    public void printListTextBook(TextBook[] listTB, int numOfTextBook) {

        for (int i = 0; i < numOfTextBook; i++) {
            System.out.println("--------Information TextBook " + (i + 1) + "-----------");
            System.out.println(listTB[i].printInformation());
        }
    }

    /*
     * This method calculate total price of list textbook
     * Input: the 'listTB' variable has TextBook array type and 'numOfTextBook' variable has int type
     * Output: the 'totalPrice' variabel has double type
     */
    public double calPriceListTextBook(TextBook[] listTB, int numOfTextBook) {
        double totalPrice = 0;

        for (int i = 0; i < numOfTextBook; i++) {
            totalPrice += listTB[i].calPriceTextBook();
        }
        return totalPrice;
    }

    /*
     * This method add a reference book to list reference book
     * Input: the 'listRB' variable has ReferenceBook array type and 'index' variable has int type
     * Output: the 'listRB' variable has ReferenceBook array type, which contains ReferenceBook object
     */
    public ReferenceBook[] addReferenceBook(ReferenceBook[] listRB, int index) throws IOException {

        if (index > 100) {
            throw new ArithmeticException("the number book higher default number");
        } else {
            ReferenceBook rb = new ReferenceBook();
            rb.inputInformation();
            listRB[index] = rb;
        }

        return listRB;
    }

    /*
     * This method print a list referencebook
     * Input: the 'listRB' variable has ReferenceBook array type and 'index' variable has int type
     * Output: not
     */
    public void printListReferenceBook(ReferenceBook[] listRB, int numOfReferenceBook) {

        for (int i = 0; i < numOfReferenceBook; i++) {
            System.out.println("--------Information Reference Book " + (i + 1) + "-----------");
            System.out.println(listRB[i].printInformation());
        }
    }

    /*
     * This method calculate total price of list reference book
     * Input: the 'listRB' variable has ReferenceBook array type and 'numOfReBook' variable has int type
     * Output: the 'totalPrice' variabel has double type
     */
    public double calPriceListReferenceBook(ReferenceBook[] listRB, int numOfReBook) {
        double totalPrice = 0;

        for (int i = 0; i < numOfReBook; i++) {
            totalPrice += listRB[i].calPriceReferenceBook();
        }
        return totalPrice;
    }

    /*
     * This method calculate average price of list reference book
     * Input: the 'totalPrice' variable has double type and 'numOfReBook' variable has int type
     * Output: the 'averagePrice' variabel has double type
     */
    public double calAveragePriceListReBook(double totalPrice, int numOfReBook) {
        double average = totalPrice / numOfReBook;
        return average;
    }
}
