/**
 * 
 */
package Product;

import java.sql.Connection;
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
public class CategoryController {
    
    private List<Category> listCate;
    
    Database db = new Database();

    public CategoryController() {
        super();
        listCate = new ArrayList<>();
    }
    
    public List<Category> getAllCategory() throws ClassNotFoundException, SQLException {
        
        try (Connection conn = db.connect()) {
            
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM category";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                listCate.add(category);
            }
        }
     
        return listCate;
    }
    
}
