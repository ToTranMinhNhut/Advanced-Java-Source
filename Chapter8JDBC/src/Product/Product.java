/**
 * 
 */
package Product;

/**
 * @author hv
 *
 */
public class Product {
    
    private int id;
    private String name;
    private double price;
    private int amout;
    private int categoryid;
    
    public Product() {
        super();
    }

    public Product(String name, double price, int amout, int categoryid) {
        super();
        this.name = name;
        this.price = price;
        this.amout = amout;
        this.categoryid = categoryid;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Product id =" + id + " name=" + name + ", price=" + price
                + ", amout=" + amout + ", categoryid=" + categoryid;
    }
    
}
