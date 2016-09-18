/**
 * 
 */
package User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.Database;


/**
 * @author hv
 *
 */
public class UserController {

    Database db = new Database();
    
    /*
     * this method is used for getting account of user
     * 
     * 
     */
    public User loginUser(String username, String password) throws ClassNotFoundException, SQLException {

        User user = null;

        try (Connection conn = db.connect()) {
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM user WHERE username like '" + username + "' and password like '" + password + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                user = new User();
                user.setPassword(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                break;
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return user;
    }
    
    /*
     * This method is used for adding a new account of user
     * 
     * 
     */
    public void addUser(User user) throws ClassNotFoundException, SQLException {
        
        try (Connection conn = db.connect()) {
            
            String sql = "INSERT INTO user VALUES(NULL,'" + user.getUsername() + "','" + user.getPassword() + "')";
            java.sql.PreparedStatement statement =  conn.prepareStatement(sql);
            statement.execute();
        }
    }
}
