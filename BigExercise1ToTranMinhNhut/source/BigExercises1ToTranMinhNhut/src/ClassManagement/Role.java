package ClassManagement;



/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 2:02:07 PM
 */
public class Role {

	private String name;
	private int id;
	
	public Role(){
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}