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
 */
public class MoneyTransaction extends Transaction {

    final double USDPRICE = 22260;
    final double EURPRICE = 24976.28;
    final double AUDPRICE = 16747.13;
    final double RATE = 0.1 * 100;

    final String USD = "USD";
    final String EUR = "EUR";
    final String AUD = "AUD";
    final String BUY = "buy";
    final String SELL = "sell";

    private String tranType;
    private String moneyType;

    public MoneyTransaction() {
    }

    public MoneyTransaction(String tranType, String moneyType, String id, String dateTransaction, int number) {
        super(id, dateTransaction, number);
        this.tranType = tranType;
        this.moneyType = moneyType;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
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
            System.out.println("Please enter money type <USD><EUR><AUD>:");
            moneyType = input.readLine();

            System.out.println("Please enter transaction type <BUY><SELL>: ");
            tranType = input.readLine();
            
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
        
        if (!moneyType.equalsIgnoreCase(USD) && !moneyType.equalsIgnoreCase(EUR) && !moneyType.equalsIgnoreCase(AUD)) {
            throw new ArithmeticException("Please only enter USD or EUR or AUD");
        }
        
        if (!tranType.equalsIgnoreCase(BUY) && !tranType.equalsIgnoreCase(SELL)) {
            throw new ArithmeticException("Please only enter BUY or SELL");
        }
    }

    /*
     * This method calculate total price of money transaction
     * Input: not
     * Output: the 'price' variable has double type, which contains total price money value
     */
    public double calPriceMoney() {
        double price = 0;

        if (moneyType.equalsIgnoreCase(USD)) {

            if (tranType.equalsIgnoreCase(BUY)) {
                price = number * USDPRICE;
            } else if (tranType.equalsIgnoreCase(SELL)) {
                price = number * USDPRICE + (number * USDPRICE) * RATE;
            }
        } else if (moneyType.equalsIgnoreCase(EUR)) {

            if (tranType.equalsIgnoreCase(BUY)) {
                price = number * EURPRICE;
            } else if (tranType.equalsIgnoreCase(SELL)) {
                price = number * EURPRICE + (number * EURPRICE) * RATE;
            }
        } else if (moneyType.equalsIgnoreCase(AUD)) {

            if (tranType.equalsIgnoreCase(BUY)) {
                price = number * AUDPRICE;
            } else if (tranType.equalsIgnoreCase(SELL)) {
                price = number * AUDPRICE + (number * AUDPRICE) * RATE;
            }
        }

        return price;
    }

    /*
     * this method return information of money transaction
     * Input: not
     * Output: return money transaction value has String type
     */
    @Override
    public String printInformation() {
        return super.printInformation()
                + "| Money type: " + moneyType + "| Transaction type: " + tranType;
    }

}
