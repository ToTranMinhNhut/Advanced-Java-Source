/**
 * 
 */
package ContactManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author hv
 *
 */
public class ContactManagementMain {

    /**
     * @param args
     * @throws IOException 
     * @throws ParserConfigurationException 
     * @throws SAXException 
     * @throws TransformerException 
     */
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choose a function");
        System.out.println("1 - View contacts");
        System.out.println("2 - Search contact");
        System.out.println("3 - Add a new contact");
        System.out.println("4 - Detele a contact");
        System.out.println("5 - Update contact");

        int opt = 0;
        String name = "";
        String phone = "";

        try {
            opt = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }


        if (opt == 1) {

            String filePath = "src/ContactManagement/contact.xml";
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("contact");
                //  System.out.println("Here");

                // now xml is loaded as document in memory, lets convert it to Object List
                List<Contact> listCT = new ArrayList();
                for (int i = 0; i < nodeList.getLength(); i++) {
                    listCT.add(getContact(nodeList.item(i)));
                    // System.out.println(nodeList.item(i).getNodeName());
                }

                // lets print list information
                for (Contact contact : listCT) {
                    System.out.println(contact.toString());
                }

            } catch (SAXException | IOException e1) {
                System.out.println("Error: " + e1.getMessage());
            }

        } else if (opt == 2) {
            System.out.println("Please enter name's customer that want to search:  ");
            name = input.readLine();

            String filePath = "src/ContactManagement/contact.xml";
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("contact");
                //  System.out.println("Here");

                // now xml is loaded as document in memory, lets convert it to Object List
                List<Contact> listCT = new ArrayList();
                for (int i = 0; i < nodeList.getLength(); i++) {
                    listCT.add(getContact(nodeList.item(i)));
                    // System.out.println(nodeList.item(i).getNodeName());
                }

                // lets print list information
                for (Contact contact : listCT) {
                    if (contact.getName().equalsIgnoreCase(name)) {
                        System.out.println(contact.toString());
                    }
                }

            } catch (SAXException | IOException e1) {
                System.out.println("Error: " + e1.getMessage());
            }

        } else if (opt == 3) {
            System.out.println("-----Add a new contact-----");

            try {
                System.out.println("Please enter name: ");
                name = input.readLine();

                System.out.println("Please enter phone: ");
                phone  = input.readLine();
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }

            Contact contact = new Contact(name, phone);
            contact.addContact();
        } else if (opt == 4) {

            System.out.println("Please enter name's customer that want to search:  ");
            name = input.readLine();

            String filePath = "src/ContactManagement/contact.xml";
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("contact");
                //  System.out.println("Here");

                // now xml is loaded as document in memory, lets convert it to Object List
                List<Contact> listCT = new ArrayList();
                for (int i = 0; i < nodeList.getLength(); i++) {
                    listCT.add(getContact(nodeList.item(i)));
                    // System.out.println(nodeList.item(i).getNodeName());
                }

                // lets print list information
                List removedList = new ArrayList();
                for (Contact contact : listCT) {
                    if (contact.getName().equalsIgnoreCase(name)) {
                        removedList.add(contact);
                    }
                }
                listCT.removeAll(removedList);

                for (Contact contact : listCT) {
                    System.out.println(contact.toString());
                }

                for (Contact contact : listCT) {
                    contact.delete(contact.getName(), contact.getPhone());

                }

            } catch (SAXException | IOException e1) {
                System.out.println("Error: " + e1.getMessage());
            }

        } else if (opt == 5) {

        } else {
            throw new ArithmeticException("The function do not exists.");
        }



    }

    public static Contact getContact(Node node) {
        Contact ct = new Contact();

        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            ct.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
            ct.setPhone(element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue());
        }

        return ct;
    }
}
