/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

/**
 *
 * @author hv
 */
public class Trooper extends Soldier {

    public Trooper() {
    }

    /*
     * The fight() make decrease power of infantryman when he is attacked,
     * and it's override fight() method in Soldier clas.
     * Input: not
     * Output: the 'pow' variable has int type, which contain power value.
     */
    
    @Override
    public int fight() {
        int pow = power - 3;
        return pow;
    }
}
