/**
 * 
 */
package Product;

/**
 * @author hv
 * @version 1.0
 * @since 16/9/2016
 */
public class Category {

    private int id;
    private String name;
    private String description;
   
    public Category() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Category(int id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", description="
                + description + "]";
    }
   
}
