/**
 * 
 */
package IODaily;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hv
 *
 */
public class DailyMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, EOFException, FileNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choose: <1-View Daily / 2-Write Daily>");
        int opt = 0;

        try {
            opt = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (opt != 1 && opt != 2) {
            throw new ArithmeticException("Please enter only 1 or 2.");
        } else if (opt == 1) {
            
            String nhatKy = "";
            String ngay;
            String noiDung;
            try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/IODaily/daily.txt")))) {

                while (true) {
                    ngay = in.readUTF();
                    noiDung = in.readUTF();
                    nhatKy += ngay + "\n" + noiDung + "\n\n";
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            System.out.println(nhatKy);
            
        } else {
   
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date d = new Date();
            String txtNgay = dateFormat.format(d);
            System.out.println("Please writer daily");
            String txtNoiDung = input.readLine();
            try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/IODaily/daily.txt", true)))) {
                out.writeUTF(txtNgay);
                out.writeUTF(txtNoiDung);
                System.out.println("Write daily sucess");
                out.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }            
        }
    }

}
