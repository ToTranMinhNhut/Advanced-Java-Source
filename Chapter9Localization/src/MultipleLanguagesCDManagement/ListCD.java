/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleLanguagesCDManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author minhnhutvaio
 * @version 1.0
 * @date 21/8/2016
 *
 */
public class ListCD {

    private List<CD> listCD; 
    
    public ListCD() {
        super();
        listCD = new ArrayList<CD>(0);
    }
    
    
    /**
     * @return the listCD
     */
    public List<CD> getListCD() {
        return listCD;
    }


    /**
     * @param listCD the listCD to set
     */
    public void setListCD(List<CD> listCD) {
        this.listCD = listCD;
    }


    /*
     * This method add one cd to list CD
     * Input:
     * Output:
     */
    public void addCDToList(CD cd) {
        int index = listCD.size();
        listCD.add(index, cd);      
    }
    
    /*
     * This method print all of information cd in list cd
     * Input: the 'numOfCD' has int type and 'list' array has CD type
     * Output: not
     */
    public void printListCD(ResourceBundle message) {
       int countCD = 0;
       
       for (CD cd : listCD) {
           System.out.println("-----------CD " + (countCD + 1) + "----------");
           cd.printInformationCD(message);
           countCD++;
           System.out.println("--------------------------");
       }
    }

    /*
     * This method calculate price all of cd in list cd 
     * Input: the 'numberOfCD' has int type and 'list' array CD type
     * Output: the 'price' variable has double type, which contains price value
     */
    public double calPriceOfListCD() {
        double totalPrice = 0;
        
        for (CD cd : listCD) {
            totalPrice += cd.getPrice();
        }
       
        return totalPrice;
    }
}
