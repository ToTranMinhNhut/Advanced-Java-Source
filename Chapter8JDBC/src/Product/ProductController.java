/**
 * 
 */
package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Database.Database;

/**
 * @author minhnhutvaio
 *
 */
public class ProductController {

    private Database db = new Database();

    public void insertProduct (Product product) throws ClassNotFoundException, SQLException {

        try (Connection conn = db.connect()) {
            String sql = "INSERT INTO product VALUES(NULL,'" + product.getName() + "','" + product.getPrice()
            + "','" + product.getAmout() + "','" + product.getCategoryid() + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }
    
    public List<Product> searchProduct(String nameProduct) throws ClassNotFoundException, SQLException {
        
        List<Product> rs;
        
        try (Connection conn = db.connect()) {
            rs = new ArrayList<>();
            
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM product WHERE name like '%" + nameProduct + "%'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Product p = new Product();
                
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                p.setAmout(resultSet.getInt("amout"));
                p.setCategoryid(resultSet.getInt("categoryid"));
                
                rs.add(p);
            }
        }
        return rs;
    }
    
    public List<Product> getAllProducts() throws ClassNotFoundException, SQLException {
        
        List<Product> products;
        
        try (Connection conn = db.connect()) {
            products = new ArrayList<>();
            
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                Product p = new Product();
                
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                p.setAmout(resultSet.getInt("amout"));
                p.setCategoryid(resultSet.getInt("categoryid"));
                
                products.add(p);
            }
        }
        return products;
    }
    
    public void updateProduct(Product p) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "UPDATE product SET price = " + p.getPrice() + ", amout = " + p.getAmout() + " WHERE id = '" + p.getId() + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }
    
    public void deleteProduct(int idProduct) throws ClassNotFoundException, SQLException {
        
        try (Connection conn = db.connect()) {
            String sql = "DELETE FROM product WHERE id = '" + idProduct + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }
}
