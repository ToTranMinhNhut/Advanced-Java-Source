/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

/**
 *
 * @author hv
 * @version 1.0
 * @data 22/8/2106
 *
 */
public class Infantryman extends Soldier {

    public Infantryman() {
    }

    /*
     * The fight() make decrease power of infantryman when he is attacked,
     * and it's override fight() method in Soldier clas.
     * Input: not
     * Output: the 'pow' variable has int type, which contain power value.
     */
    @Override
    public int fight() {
        int pow = power - 2;
        return pow;
    }
}
