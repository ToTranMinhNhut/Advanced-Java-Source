/**
 * 
 */
package StoreCDPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

/**
 * @author hv
 * @version 1.0
 * @since 19/9/2016
 * 
 * This is main class of program 
 */
public class CDStoreMain {

    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws SAXException 
     * @throws TransformerException 
     * @throws ParserConfigurationException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException, ParserConfigurationException, TransformerException, SAXException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Loop value is used to loop functions of program
        boolean run = true; 

        while (run) {
            //Menu's function of program
            System.out.println("-----Menu Function-----");
            System.out.println("1 - Add a new CD.");
            System.out.println("2 - Search a CD.");
            System.out.println("3 - Update a CD.");
            System.out.println("4 - Delete a CD.");
            System.out.println("5 - Write list of CDs to txt file.");
            System.out.println("6 - Read list of CDS to txt file and show them.");
            System.out.println("7 - Write list of CDs to xml file.");
            System.out.println("8 - Read list of CDS to xml file and show them.");
            System.out.println("9 - Exit");
            System.out.println("---------------------");
            //----------------------------------------------------------------------

            // Choose function
            int opt = 0;
            System.out.println("Please choose a function:");

            try {
                opt = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            //-----------------------------------------------------------------------

            List<CD> CDs = new ArrayList<CD>();
            CDController cdController = new CDController();

            if (opt == 1) {
                System.out.println("-----Add a new CD-----");

                // input information of a CD
                CD newCD = new CD();
                newCD.inputInformationCD();
                //---------------------------------------------------------------

                // add a new CD
                cdController.addNewCD(newCD);
                System.out.println("The CD is added is success.");
                System.out.println("------------------------------");
            } else if (opt == 2) {
                System.out.println("-----Search a CD-----");

                // input name cd that want to search
                String nameCD = "";
                System.out.println("Please enter name cd that want to search:");
                try {
                    nameCD = input.readLine();
                }
                catch (NullPointerException | NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                //----------------------------------------------------------------

                // To search cd
                CDs = cdController.searchCD(nameCD);

                // show all of cds that was found
                for (CD cd : CDs) {
                    System.out.println(cd.toString());
                }
                System.out.println("---------------------------------------------");
            } else if (opt == 3) {
                System.out.println("------------Liss of cds-----------");

                // Show all cds
                CDs = cdController.getAllCDs();

                for (CD cd : CDs) {
                    System.out.println(cd.toString());
                }
                System.out.println("-------------------------------------------------");
                //----------------------------------------------------

                // Choose cd that want to update by id----------------
                int idTemp = 0;
                int idUpdatedCD = 0;
                
                // input id cd want to update
                try {
                    System.out.println("Please choose cd that want to update by id:");
                    idTemp = Integer.parseInt(input.readLine());
                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println("Error: " + e.toString());
                }

                // Get id to database for updating
                for (CD cd : CDs) {
                    if (idTemp == cd.getId()) {
                        idUpdatedCD = idTemp;
                    }
                }

                if (idUpdatedCD == 0) {
                    throw new ArithmeticException("The id do not exists.");
                }
                //------------------------------------------------------------

                //input information cd that will update.
                int numberSongs = 0;
                double price = 0;
                
                System.out.println("-----Update a cd-----");
                try {
                    System.out.println("Please enter new number's songs of cd:");
                    numberSongs = Integer.parseInt(input.readLine());

                    System.out.println("Please enter new price of cd:");
                    price = Double.parseDouble(input.readLine());
                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                //--------------------------------------------------------------------

                // Update to cd
                CD updatedCD = new CD();
                updatedCD.setId(idUpdatedCD);
                updatedCD.setNumberSongs(numberSongs);
                updatedCD.setPrice(price);
                cdController.updateCD(updatedCD);
                System.out.println("The cd is updated is success.");
                System.out.println("-------------------------------");
            } else if (opt == 4) {
                System.out.println("-----Delete a cd-----");

                // Show all cds
                CDs = cdController.getAllCDs();

                for (CD cd : CDs) {
                    System.out.println(cd.toString());
                }
                System.out.println("-------------------------------------------------");
                //----------------------------------------------------

                // Choose cd that want to update by id-------------------
                int idTemp = 0;
                int idDeletedCD = 0;

                // input id cd want to delete
                try {
                    System.out.println("Please choose cd that want to delete by id:");
                    idTemp = Integer.parseInt(input.readLine());
                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println("Error: " + e.toString());
                }

                // get id to database for deleting
                for (CD cd : CDs) {
                    if (idTemp == cd.getId()) {
                        idDeletedCD = idTemp;
                    }
                }

                if (idDeletedCD == 0) {
                    throw new ArithmeticException("The id do not exists.");
                }
                //------------------------------------------------------------

                // Detele a cd
                int confirm = -1;
                boolean confirmNext = true;

                while (confirmNext) {
                    // To confirm to delete cd
                    System.out.println("Do you delete this cd? Are you sure? <1 (Yes) / 0 (No)>:");
                    try {
                        confirm = Integer.parseInt(input.readLine());
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Error: " + e.getMessage());
                    } 
                    //----------------------------------------------

                    if (confirm != 0 && confirm != 1) {
                        System.out.println("Please enter only 1 or 0.");
                    } else if (confirm == 1){
                        // to delete cd
                        cdController.deleteCD(idDeletedCD);
                        System.out.println("The cd is delete is sucess.");
                        confirmNext = false;
                    } else {
                        confirmNext = false;
                    }
                }
            } else if (opt == 5) {
                System.out.println("-----Write list of cd to txt file-----");
                // Get all of cd from database
                CDs = cdController.getAllCDs();

                // the link to cd.txt
                String path = "src/StoreCDPart2/cd.txt";

                // write list of cds to cd.txt
                cdController.writeCDToFile(path, CDs);
                System.out.println("All of CDs were written to txt file is success.\n");
            } else if (opt == 6) {
                System.out.println("-----Read and display list of cd to txt file-----");

                // the link to cd.txt
                String path = "src/StoreCDPart2/cd.txt";

                // read list of cd to txt file
                CDs = cdController.readCDToFile(path);
                System.out.println("Read file is success.");

                // To display all of cd to list's cd
                System.out.println("-----List of CD-----");
                for (CD cd2 : CDs) {
                    System.out.println(cd2.toString());
                }
                System.out.println("------------------------------");
            } else if (opt == 7) {
                System.out.println("-----Write list of cd to xml file-----");

                // Get all of cd from database
                CDs = cdController.getAllCDs();

                // the link to cd.txt
                String path = "src/StoreCDPart2/cd.xml";
                
                // 
                cdController.writeListtoXMLFile(path, CDs);
                System.out.println("Write list of cd to xml file is success.\n");
            } else if (opt == 8) {
                System.out.println("-----Read and display list of cd to xml file-----");

                // the link to cd.xml
                String path = "src/StoreCDPart2/cd.xml";

                // read list of cd to xml file
                CDs = cdController.readCDToXMLFile(path);
                System.out.println("Read file is success.");

                // To display all of cd to list's cd
                System.out.println("-----List of CD-----");
                for (CD cd : CDs) {
                    System.out.println(cd.toString());
                }
                System.out.println("------------------------------");
            } else if (opt == 9) {
                break;
            } else {
                throw new ArithmeticException("The function do not exists.");
            }

            // To Continue to use program
            int nextStep = -1;

            while(nextStep != 1 && nextStep != 0) {
                System.out.println("Do you continue to use program? <1 (yes) / 0 (No)>");

                try {
                    nextStep = Integer.parseInt(input.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                if (nextStep != 0 && nextStep != 1) {
                    System.out.println("Please only enter 1 or 0.");
                } else if (nextStep == 0) {
                    run = false;
                }
            }
            //---------------------------------------------------------------------------

        }
        System.out.println("The program finish. See you later.");
    }

}
