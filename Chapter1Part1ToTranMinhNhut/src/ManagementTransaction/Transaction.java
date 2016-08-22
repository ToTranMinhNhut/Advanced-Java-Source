/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 22/8/2016
 *
 */
public class Transaction {

    protected String id;
    protected String dateTransaction;
    protected int number;

    public Transaction() {
    }

    public Transaction(String id, String dateTransaction, int number) {
        this.id = id;
        this.dateTransaction = dateTransaction;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*
     * This method input information a transaction
     * Input: not
     * Output: not
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter id transaction: ");
            id = input.readLine();

            System.out.println("Please enter date of transaction: ");
            dateTransaction = input.readLine();

            System.out.println("please enter number: ");
            number = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * This method return information of a transaction
     * Input: not
     * Output: return transaction information value has String type
     */
    public String printInformation() {
        return "Id: " + id + "| Date transaction: " + dateTransaction + "| Numer: " + number;
    }

}
