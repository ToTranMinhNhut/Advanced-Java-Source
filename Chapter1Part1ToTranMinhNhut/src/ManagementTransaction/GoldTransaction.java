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
public class GoldTransaction extends Transaction {

    final int TYPE10K = 10;
    final int TYPE14K = 14;
    final int TYPE24K = 24;

    final double TYPE10KPRICE = 13889000;
    final double TYPE14KPRICE = 19915000;
    final double TYPE24KPRICE = 35141000;

    private int type;

    public GoldTransaction() {
    }

    public GoldTransaction(int type, String id, String dateTransaction, int number) {
        super(id, dateTransaction, number);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /*
     * The method calculate total price of gold transaction
     * Input: not
     * Output: the 'price' variable has double type, which contains total price value
     */
    public double calPriceGold() {
        double price = 0;

        switch (type) {
            case TYPE10K:
                price = number * TYPE10KPRICE;
                break;
            case TYPE14K:
                price = number * TYPE14KPRICE;
                break;
            case TYPE24K:
                price = number * TYPE24KPRICE;
                break;
            default:
                break;
        }

        return price;
    }

    /*
     * This method input information of gold transaction,\
     * and it's override inputInformation() method in Transaction class
     * Input: not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter gold type: <10> <14> <24>");
            type = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }

        if (type != 10 && type != 14 && type != 24) {
            throw new ArithmeticException("Please only enter 10 or 14 or 24");
        }
    }

    /*
     * This method return information a gold transaction
     * Input: not
     * Output: return gold transaction value has String type
     */
    @Override
    public String printInformation() {
        return super.printInformation() + "| Gold type: " + type + "k";
    }

}
