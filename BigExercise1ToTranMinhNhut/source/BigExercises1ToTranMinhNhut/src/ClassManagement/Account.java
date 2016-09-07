package ClassManagement;



/**
 * This class is used for processing businesses of instance account
 * 
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 2:02:06 PM
 */
public class Account {

	private String password;
	private String username;
	public Role role;
	public Teacher teacher;
	
	public Account(){
	}
	
	public Account(String password, String username, Role role) {
        super();
        this.password = password;
        this.username = username;
        this.role = role;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    
    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /*
	 * This method is used for logging in account
	 * Input: Two variables has String type
	 * Output: return value has int type
	 */
	int login(String username, String password) {
	    
	    if (this.username.equals(username)) {
	        if (this.password.equals(password)) {
	            return this.role.getId();
	        }
	    }
	    return -1;
	}
	
	/*
	 * This method is used for logging out account 
	 * Input: nothing
	 * Output: return value has boolean type
	 */
	boolean logout() {
	    return true;
	}
}