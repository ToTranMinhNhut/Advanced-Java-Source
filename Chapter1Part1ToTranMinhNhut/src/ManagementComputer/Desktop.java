/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementComputer;

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
public class Desktop extends Computer {

    private String infoCPU;
    private String infoRAM;

    public Desktop() {
    }

    public Desktop(String infoCPU, String infoRAM, String id, double price, String manufacturer, int number) {
        super(id, price, manufacturer, number);
        this.infoCPU = infoCPU;
        this.infoRAM = infoRAM;
    }

    public String getInfoCPU() {
        return infoCPU;
    }

    public void setInfoCPU(String infoCPU) {
        this.infoCPU = infoCPU;
    }

    public String getInfoRAM() {
        return infoRAM;
    }

    public void setInfoRAM(String infoRAM) {
        this.infoRAM = infoRAM;
    }

    /*
     * This method print information a desktop, and it's override printInformation() method in Computer clas
     * Input: not
     * Output: not
     */
    @Override
    public void inputInformation() throws IOException {
        super.inputInformation();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter information CPU: ");
            infoCPU = input.readLine();

            System.out.println("Please enter information RAM; ");
            infoRAM = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /*
     * this method print information a desktop
     * Input: not
     * Output: the 'info' variable has String type, which contain information desktop value
     */
    @Override
    public String printInformation() {
        String info = super.printInformation() + "\n| CPU information: " + infoCPU
                + "| RAM information: " + infoRAM;
        return info;
    }

}
