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
public class ManagementTransactionMain {

    public static int max = 50;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        GoldTransaction[] goldTran = new GoldTransaction[max];
        MoneyTransaction[] moneyTran = new MoneyTransaction[max];

        ListTransaction list = new ListTransaction();

        int indexG = 0;
        int indexM = 0;
        int nextStep = 1;

        while (nextStep == 1) {
            int opt = 0;
            System.out.println("Please choose transaction: <1 (Gold) / 2 (Money)>:");
            opt = Integer.parseInt(input.readLine());

            if (opt == 1) {
                goldTran = list.addGoldTransaction(goldTran, indexG);

                int numOfGoldTran = indexG + 1;
                list.printListGoldTransaction(goldTran, numOfGoldTran);
                
                double totalNumberGold = list.calTotalNumberGold(goldTran, numOfGoldTran);
                System.out.println("Total number of gold: " + totalNumberGold);
                
                double averagePriceGold = list.calAveragePriceGold(goldTran, numOfGoldTran);
                System.out.println("Average price of gold: " + averagePriceGold);
                
            } else if (opt == 2) {
                moneyTran = list.addMoneyTransaction(moneyTran, indexM);

                int numOfMoneyTran = indexM + 1;
                list.printListMoneyTransaction(moneyTran, numOfMoneyTran);
                
                double totalNumberMoney = list.calTotalNumberMoney(moneyTran, numOfMoneyTran);
                System.out.println("Total number Money: " + totalNumberMoney);
                
                double averagePriceMoney = list.calAveragePriceMoney(moneyTran, numOfMoneyTran);
                System.out.println("Average Price of money: " + averagePriceMoney);
                
            } else {
                throw new ArithmeticException("Please only enter 1 or 2.");
            }

            try {
                System.out.println("Do you continue to transact: <1 (Yes) / 0 (No)>");
                nextStep = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error:" + e.toString());
            }

            if (nextStep != 1 && nextStep != 0) {
                throw new ArithmeticException("Please only 1 or 0");
            } else if (nextStep == 1) {

                if (opt == 1) {
                    indexG++;
                } else if (opt == 2) {
                    indexM++;
                }
            }
        }
    }

}
