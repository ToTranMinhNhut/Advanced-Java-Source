/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 * @version 1.0
 * @date 22/8/2016
 */
public class BattleMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Infantryman infan = new Infantryman();
        Trooper trp = new Trooper();

        System.out.println("Information infantryman.");
        infan.inputInformation();

        System.out.println("Information trooper.");
        trp.inputInformation();

        boolean battle = true;
        int winTrooper = 0;
        int winInfantryman = 0;
                
        while (battle) {
            int opt = 0;

            try {
                System.out.println("Choose for the soldier can attack enemy: <1 (infantryman) / 2 (trooper)>");
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.toString());
            }
            
            int powTrooper = 0;
            int powInfantryman = 0;
            
            if (opt == 1) {
                powTrooper = trp.fight();
                
                if (powTrooper > 0) {
                    trp.setPower(powTrooper);
                    System.out.println("Trooper Power : " + powTrooper);
                } else {
                    battle = false;
                    winInfantryman = 1;
                }
            } else if (opt == 2) {
                powInfantryman = infan.fight();
                
                if (powInfantryman > 0) {
                    infan.setPower(powInfantryman);
                    System.out.println("Infantryman Power: " + powInfantryman);
                } else {
                    battle = false;
                    winTrooper = 1;
                }
            } else {
                throw new ArithmeticException("Please enter 1 or 2.");
            }
        }
        
        if (!battle) {
            System.out.println("----------------------------------");
            if (winInfantryman == 1) {
                System.out.println("Infantryman win!");
            } else if (winTrooper == 1) {
                System.out.println("Trooper win");
            }
            System.out.println(" Game finish");
        }

    }

}
