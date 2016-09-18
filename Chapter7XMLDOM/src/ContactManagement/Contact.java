/**
 * 
 */
package ContactManagement;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * @author hv
 *
 */
public class Contact {
    
    private String name;
    private String phone;
    
    public Contact() {
        super();
    }

    public Contact(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }
    
  /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Contact name=" + name + ", phone=" + phone;
    }

public void addContact() throws FileNotFoundException, SAXException, IOException {
        
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement;
            String filePath = "src/ContactManagement/contact.xml";
            File xmlFile = new File(filePath);
            
            // file exists
            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            }
            // file not exists
            else {
                rootElement = doc.createElement("contacts"); // create root
                doc.appendChild(rootElement);
            }
            
            // contact
            Element contact = doc.createElement("contact");
            rootElement.appendChild(contact);
            
            //hoten element
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(this.name));
            contact.appendChild(name);
            
            // phone element
            Element phone = doc.createElement("phone");
            phone.appendChild(doc.createTextNode(this.phone));
            contact.appendChild(phone);
            
            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/ContactManagement/contact.xml"));
            transformer.transform(source, result);
            System.out.println("Add a new contact is success.");
            
        } catch (ParserConfigurationException | TransformerException pce) {
            System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
        }
    }
}
