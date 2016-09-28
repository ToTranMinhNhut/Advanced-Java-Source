/**
 * 
 */
package StoreCDPart2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
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
 * @version 1.0
 * @since 9/19/2016
 * 
 * This class is used to process businesses of cd
 */
public class CDController {

    Database db = new Database();

    /*
     * This method is used to insert a new CD to Mysql database
     * Input cd Object
     * Output nothing
     */
    public void addNewCD(CD cd) throws ClassNotFoundException, SQLException {

        try (Connection conn = db.connect()) {
            String sql = "INSERT INTO cd VALUES(NULL,'" + cd.getName() + "','" + cd.getSinger()
            + "','" + cd.getNumberSongs() + "','" + cd.getPrice() + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }

    /*
     * This method is used to search a cd by name of cd.
     * Input nameCD variable has String type
     * Output return cds List.
     */
    public List<CD> searchCD (String nameCD) throws ClassNotFoundException, SQLException {
        List<CD> cds ;

        try (Connection conn = db.connect()) {
            // To make query
            cds = new ArrayList<CD>();
            String sql = "SELECT * FROM cd WHERE name like '%" + nameCD + "%'";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Add all cd to list
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));

                cds.add(cd);
            }
        }
        return cds;
    }

    /*
     * This method is used to get all of CDs
     * Input nothing
     * Output return cds List
     */
    public List<CD> getAllCDs() throws ClassNotFoundException, SQLException {
        List<CD> cds ;

        try (Connection conn = db.connect()) {
            // To make query
            cds = new ArrayList<CD>();
            String sql = "SELECT * FROM cd";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Add all cd to list
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));

                cds.add(cd);
            }
        }
        return cds;
    }

    /*
     * This method is used to update number's songs of cd and price of cd to a cd
     * Input cd Object
     * Output nothing
     */
    public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "UPDATE cd SET numbersongs = " + cd.getNumberSongs() + ", price = " + cd.getPrice()
            + " WHERE id = '" + cd.getId() + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }

    /*
     * This method is delete a cd
     * Input cd variable has int type
     * Output nothing
     */
    public void deleteCD(int idCD) throws ClassNotFoundException, SQLException {
        try (Connection conn = db.connect()) {
            String sql = "DELETE FROM cd WHERE id = '" + idCD + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }

    /*
     * This method is used to write a list of cd to txt file
     * Input path is String Object and cds List has CD type
     * Output nothing
     */
    public void writeCDToFile(String path, List<CD> cds) throws FileNotFoundException, IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
        // write the number of element in list to txt file
        output.writeInt(cds.size());

        // write list of cd to txt file
        for (CD cd : cds) {
            output.writeObject(cd);
            output.flush();
        }
        output.reset();
        output.close();
    }

    /*
     * This method is used to read all of cds to txt file
     * Input path String Object
     * Output return cds List has CD type
     */
    public List<CD> readCDToFile(String path) throws IOException, ClassNotFoundException {
        List<CD> cds = new ArrayList<>();
        FileInputStream file = new FileInputStream(path);

        if (file.available() != 0) {
            ObjectInputStream input = new ObjectInputStream(file);

            // read the number of Object to txt file
            int size = input.readInt();

            // read all of Objects to txt file
            for (int i = 0; i < size; i++) {
                cds.add((CD) input.readObject());
            }

            input.close();
        }

        return cds;
    }

    /*
     * This method is used to write a list of cd to xml file
     * Input path is String Object and cds List has CD type
     * Output nothing
     */
    public void writeListtoXMLFile(String path, List<CD> cds) throws ParserConfigurationException, TransformerException, SAXException, IOException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement;

        // To add cds root
        rootElement = doc.createElement("CDs");
        doc.appendChild(rootElement);

        // add list of cds
        for (int i = 0; i < cds.size(); i++) {
            //To add cd element
            Element cd = doc.createElement("cd");
            rootElement.appendChild(cd);

            //To add id element
            Element id = doc.createElement("id");
            id.appendChild(doc.createTextNode(Integer.toString(cds.get(i).getId())));
            cd.appendChild(id);

            //  To add name element
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(cds.get(i).getName()));
            cd.appendChild(name);

            // To add singer element
            Element singer = doc.createElement("singer");
            singer.appendChild(doc.createTextNode(cds.get(i).getSinger()));
            cd.appendChild(singer);

            // To add number of songs element
            Element numberSongs = doc.createElement("numbersongs");
            numberSongs.appendChild(doc.createTextNode(Integer.toString(cds.get(i).getNumberSongs())));
            cd.appendChild(numberSongs);

            // To add price element
            Element price = doc.createElement("price");
            price.appendChild(doc.createTextNode(Double.toString(cds.get(i).getPrice())));
            cd.appendChild(price);
        }

        //To write the content into xml file
        TransformerFactory tranFFactory = TransformerFactory.newInstance();
        Transformer tranF = tranFFactory.newTransformer();
        DOMSource dSource = new DOMSource(doc);

        StreamResult result = new StreamResult(new File(path));
        tranF.transform(dSource, result);

    }

    /*
     * This method is used to get a cd node to cd.xml
     * Input node Node Object
     * Output return cd Object
     */
    public CD getNodeCD(Node node) {
        CD cd = new CD();
        
        // set information(id, name, singer, numbersongs, price) of cd to cd Object by cd node from cd.xml
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            cd.setId(Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent()));
            cd.setName(element.getElementsByTagName("name").item(0).getTextContent());
            cd.setSinger(element.getElementsByTagName("singer").item(0).getTextContent());
            cd.setNumberSongs(Integer.parseInt(element.getElementsByTagName("numbersongs").item(0).getTextContent()));
            cd.setPrice(Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent()));
        }
        return cd;
    }

    /*
     * This method is used to read all of cd Object to cd.xml
     * Input path String Object
     * Output return cds List has CD type
     */
    public List<CD> readCDToXMLFile(String path) throws ParserConfigurationException, SAXException, IOException {
        List<CD> cds = new ArrayList<>();
        
        File xmlFile = new File(path);
        if (xmlFile.exists()) {
            // read all of cds from cd.xml
            if (xmlFile.length() != 0) {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();

                NodeList nodeList = doc.getElementsByTagName("cd");
                
                // To add cd node to list of cds
                for (int i = 0; i < nodeList.getLength(); i++) {
                    cds.add(getNodeCD(nodeList.item(i)));
                }
            }
        }

        return cds;
    }
}

