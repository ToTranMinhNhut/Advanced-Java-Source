/**
 * 
 */
package ContactManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * @author hv
 *
 */
public class XMLProcess {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    private ArrayList<Contact> list;

    public XMLProcess() {
        super();
        this.list = new ArrayList<Contact>();
    }
    
    public void addContact(String Phone, String name) {
        boolean numFlag = false;
        boolean nameFlag = false;
        for (int i = 0; i < this.list.size(); i++) {
            numFlag = false;
            nameFlag = false;
            if (this.list.get(i).getPhone().compareTo(Phone) == 0) {
                numFlag = true;
            }
            if (this.list.get(i).getName().compareToIgnoreCase(name) == 0) {
                nameFlag = true;
            }

            if (numFlag == true && nameFlag == true) {
                break;
            }
        }

        //If the list hasn't contact, then add contact
        if (numFlag == true && nameFlag == true && this.list.size() > 0) {
            System.out.println("The contact existed in list");
        } else {
            this.list.add(new Contact(Phone, name));
            System.out.println("Add contact successfully!");
        }
    }

    //list of contact satify the name
    private ArrayList<Integer> searchContactRegardingName(String name) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getName().compareToIgnoreCase(name) == 0) {
                index.add(i);
            }
        }
        return index;
    }

    //search name
    public void searchName(String name) {
        ArrayList<Integer> index = searchContactRegardingName(name);
        for (int i = 0; i < index.size(); i++) {
            System.out.println("[Phone] " + this.list.get(index.get(i)).getPhone());
            System.out.println("");
        }
    }

    //list contact satify the Phone
    private ArrayList<Integer> searchContactRegardingNumPhone(String Phone) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getPhone().compareTo(Phone) == 0) {
                index.add(i);
            }
        }
        return index;
    }

    //search Phone
    public void searchPhone(String Phone) {
        ArrayList<Integer> index = searchContactRegardingNumPhone(Phone);
        for (int i = 0; i < index.size(); i++) {
            System.out.println("[Name] " + this.list.get(index.get(i)).getName());
            System.out.println("");
        }
    }

    //remove contact regarding to his Phone
    public void removeContactRegardingNumPhone(String Phone) throws IOException {
        ArrayList<Integer> index = searchContactRegardingNumPhone(Phone);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getPhone() + " - " + this.list.get(index.get(i)).getName());
                }
                //Choose the item which wanna remove
                System.out.print("Choose: ");
                ans = Integer.parseInt(input.readLine());
                if (ans >= 1 && ans <= index.size()) {
                    break;
                }
            }
            //remove
            this.list.remove(index.get(ans - 1).intValue());
            System.out.println("Remove contact successfully");
        } else {
            System.out.println(Phone + " doesn't exist in list");
        }
    }

    //remove contact regarding to his name
    public void removeContactRegardingName(String name) throws IOException {
        ArrayList<Integer> index = searchContactRegardingName(name);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getName() + " - " + this.list.get(index.get(i)).getPhone());
                }
                //Choose the item which wanna remove
                System.out.print("Choose: ");
                ans = Integer.parseInt(input.readLine());
                if (ans >= 1 && ans <= index.size()) {
                    break;
                }
            }
            //remove
            this.list.remove(index.get(ans - 1).intValue());
            System.out.println("Remove contact successfully");
        } else {
            System.out.println(name + " doesn't exist in list");
        }
    }

    //update the Phone regarding to name
    public void updateContact(String name) throws IOException {
        System.out.println("== Update information of contact ==");
        ArrayList<Integer> index = searchContactRegardingName(name);
        if (index.size() > 0) {
            //Show list results
            int ans = 0;
            while (true) {
                for (int i = 0; i < index.size(); i++) {
                    System.out.println((i + 1) + ". " + this.list.get(index.get(i)).getName() + " - " + this.list.get(index.get(i)).getPhone());
                }
                //Choose the item which wanna update

                System.out.print("Choose: ");
                ans = Integer.parseInt(input.readLine());
                if (ans >= 1 && ans <= index.size()) {
                    break;
                }
            }
            //update information
            System.out.print("Fill new Phone: ");
            String newPhone = input.readLine();
            this.list.set(index.get(ans - 1), new Contact(newPhone, this.list.get(index.get(ans - 1)).getName()));
            System.out.println("Update successfully");
        } else {
            System.out.println(name + " doesn't exist in list");
        }
    }

    public void showAllContact() {
        System.out.println("Number of contacts: " + this.list.size());
        if (this.list.size() > 0) {
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println(i + 1);
                System.out.println("\t[Name] " + this.list.get(i).getName());
                System.out.println("\t[Phone] " + this.list.get(i).getPhone());
                System.out.println("");
            }
        }
    }

    private NodeList readListNode(String path, String name) throws org.xml.sax.SAXException {

        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        NodeList nList = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //normalize tree
            doc.getDocumentElement().normalize();
            nList = doc.getElementsByTagName(name);
        } catch (ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
        }
        return nList;
    }

    //Read file XML and add contact into list contact
    public void loadContact() throws org.xml.sax.SAXException {
        NodeList nList = readListNode("src\\ContactManagement\\contact.xml", "contact");
        if (nList != null) {
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = (Node) nList.item(i);
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                String phone = element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue();
                Contact contact = new Contact(phone, name);
                list.add(contact);
            }
        }
    }

    //Search contact
    public void searchContact(String name) {
        list.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).forEach(e -> e.toString());
    }

    public void updateFileContact() throws TransformerConfigurationException, TransformerException {

        Path path = Paths.get("src\\ContactManagement\\contact.xml");
        if (!Files.exists(path)) {
            File file = new File("src\\ContactManagement\\contact.xml");
        }

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            //create root elements
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("contacts");
            doc.appendChild(rootElement);

            for (int i = 0; i < list.size(); i++) {
                Contact c = list.get(i);
                //contact element
                Element contact = doc.createElement("contact");
                rootElement.appendChild(contact);

                //name element
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(c.getName()));
                contact.appendChild(name);

                //phone element
                Element phone = doc.createElement("phone");
                phone.appendChild(doc.createTextNode(c.getPhone()));
                contact.appendChild(phone);
            }
            //Write the content into file contact.xml
            TransformerFactory tranformer = TransformerFactory.newInstance();
            Transformer tf = tranformer.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src\\ContactManagement\\contact.xml"));
            tf.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
