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

    public Product(int id, String name, double price, int amout, int categoryid) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.amout = amout;
        this.categoryid = categoryid;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#finalize()
     */
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price
                + ", amout=" + amout + ", categoryid=" + categoryid + "]";
    }
    
}
