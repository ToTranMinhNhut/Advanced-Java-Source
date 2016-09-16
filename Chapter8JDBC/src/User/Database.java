/**
 * 
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hv
 *
 */
public class Database {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/store?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";
    
    
    /*
     * This method is used for connecting to database
     * 
     * 
     */
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER_CLASS);
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        return conn;
    }
}
