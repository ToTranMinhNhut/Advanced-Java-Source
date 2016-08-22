/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementTransaction;

import java.io.IOException;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 22/8/2016
 */
public class ListTransaction {

    /*
     * This method add a gold transaction to list gold transaction
     * Input: the 'listGT' variable has GoldTransaction array type and 'index' variable has int type
     * Output: the 'listGT' variable has GoldTransaction array type, which contains GoldTransaction object
     */
    public GoldTransaction[] addGoldTransaction(GoldTransaction[] listGT, int index) throws IOException {

        if (index > 50) {
            throw new ArrayIndexOutOfBoundsException("the number gold transaction higher defaul number");
        } else {
            GoldTransaction gt = new GoldTransaction();
            gt.inputInformation();
            listGT[index] = gt;
        }

        return listGT;
    }

    /*
     * This method print information of list gold transaction
     * Input: the 'listGT' variable has GoldTransaction array type and 'numOfGoldTran' variable has int type
     * Oupt: not
     */
    public void printListGoldTransaction(GoldTransaction[] listGT, int numOfGoldTran) {

        for (int i = 0; i < numOfGoldTran; i++) {
            System.out.println("---- Information Gold Transaction " + (i + 1) + "-----------");
            System.out.println(listGT[i].printInformation());
        }
    }

    /*
     * This method calculate total number gold
     * Input: the 'listGT' variable has GoldTransaction array type and 'numOfGoldTran' variable has int type
     * Oupt: the 'total' variable has int type, which contains total gold value
     */
    public int calTotalNumberGold(GoldTransaction[] listGT, int numOfGoldTran) {
        int total = 0;

        for (int i = 0; i < numOfGoldTran; i++) {
            total += listGT[i].number;
        }

        return total;
    }

    /*
     * This method calculate average price of gold
     * Input: the 'listGT' variable has GoldTransaction array type and 'numOfGoldTran' variable has int type
     * Oupt: the 'averagePrice' variable has int type, which contains total gold value
     */
    public double calAveragePriceGold(GoldTransaction[] listGT, int numOfGoldTran) {
        double totalPrice = 0;

        for (int i = 0; i < numOfGoldTran; i++) {
            totalPrice += listGT[i].calPriceGold();
        }
        
        double averagePrice = totalPrice / numOfGoldTran;
        return averagePrice;
    }

    /*
     * This method add a money transaction to list money transaction
     * Input: the 'listMT' variable has MoneyTransaction array type and 'index' variable has int type
     * Output: the 'listMT' variable has MoneyTransaction array type, which contains MoneyTransaction object
     */
    public MoneyTransaction[] addMoneyTransaction(MoneyTransaction[] listMT, int index) throws IOException {

        if (index > 50) {
            throw new ArrayIndexOutOfBoundsException("the number money transaction higher defaul number");
        } else {
            MoneyTransaction mt = new MoneyTransaction();
            mt.inputInformation();
            listMT[index] = mt;
        }

        return listMT;
    }

    /*
     * This method print information of list money transaction
     * Input: the 'listMT' variable has MoneyTransaction array type and 'numOfMoneyTran' variable has int type
     * Oupt: not
     */
    public void printListMoneyTransaction(MoneyTransaction[] listMT, int numOfMoneyTran) {

        for (int i = 0; i < numOfMoneyTran; i++) {
            System.out.println("---- Information Money Transaction " + (i + 1) + "-----------");
            System.out.println(listMT[i].printInformation());
        }
    }

    /*
     * This method calculate total number money
     * Input: the 'listMT' variable has MoneyTransaction array type and 'numOfMoneyTran' variable has int type
     * Oupt: the 'total' variable has int type, which contains total money value
     */
    public int calTotalNumberMoney(MoneyTransaction[] listMT, int numOfMoneyTran) {
        int total = 0;

        for (int i = 0; i < numOfMoneyTran; i++) {
            total += listMT[i].number;
        }

        return total;
    }
    
     /*
     * This method calculate average price of money
     * Input: the 'listMT' variable has MoneyTransaction array type and 'numOfMoneyTran' variable has int type
     * Oupt: the 'averagePrice' variable has int type, which contains total gold value
     */
    public double calAveragePriceMoney(MoneyTransaction[] listMT, int numOfMoneyTran) {
        double totalPrice = 0;

        for (int i = 0; i < numOfMoneyTran; i++) {
            totalPrice += listMT[i].calPriceMoney();
        }
        
        double averagePrice = totalPrice / numOfMoneyTran;
        return averagePrice;
    }
}
