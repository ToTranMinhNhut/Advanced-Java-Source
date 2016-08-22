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
 *
 */
public class Soldier {

    protected String name;
    protected int power;
    protected String weapon;

    public Soldier() {
    }

    public Soldier(String name, int power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /*
     *
     *
     *
     */
    public void inputInformation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter name a soldier: ");
            name = input.readLine();

            System.out.println("Please enter power a soldier: ");
            power = Integer.parseInt(input.readLine());

            System.out.println("Please enter weapon a soldier: ");
            weapon = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * The fight() method make decrease power of soldier when he is attacked
     * Input: not
     * Output: the 'pow' variable has int type, which contains power value
     */
    public int fight() {
        int pow = power--;
        return pow;
    }
}
