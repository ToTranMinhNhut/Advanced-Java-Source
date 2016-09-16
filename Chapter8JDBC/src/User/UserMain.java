/**
 * 
 */
package User;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @author hv
 *
 */
public class UserMain {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        /*
         * To login user, then adding a new account of user. 
         * 
         */
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String username = "";
        String password = "";

        UserController userController = new UserController();
        User user = null;
        
        System.out.println("-----Login-----");
        try {
            System.out.println("please enter username: ");
            username = input.readLine();
            
            System.out.println("please enter password: ");
            password = input.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            user = userController.loginUser(username, password);
            if (user == null) {
                System.out.println("Invalid Username or Password");
            } else {
                System.out.println("Welcom to OurStore");
                
                System.out.println("-----Add a new account-----");
                String newUsername = "";
                String newPassword = "" ;
                
                // input username and password of new user
                try {
                    System.out.println("Please enter username: ");
                    newUsername = input.readLine();
                    
                    System.out.println("Please enter password: ");
                    newPassword = input.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
                // add user to database
                User newUser = new User(newUsername, newPassword);
                userController.addUser(newUser);
                System.out.println("New account is created. Now you can use it to login");
                         
           }
        } catch (SQLException | ClassNotFoundException | HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
