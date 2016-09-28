/**
 * 
 */
package StoreCDPart2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hv
 * @version 1.0
 * @since 9/19/2016
 * 
 * This class is used to process businesses of instance Database.
 */
public class Database {
    
    /* 
     * The information configuration is used to connect to Mysql database
     * The information such as: URL, Driver, username and password.
     */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";
    //--------------------------------------------------------------------------------------------

    /*
     * This method is used for connecting to MySql database.
     * Input nothing.
     * Output return conn variable has Connection type.
     */
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER_CLASS);
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        return conn;
    }
}
