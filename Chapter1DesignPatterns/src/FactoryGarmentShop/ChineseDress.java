package FactoryGarmentShop;



/**
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 2:40:18 PM
 */
public class ChineseDress implements Aodai {

	public ChineseDress(){

	}

	 /* (non-Javadoc)
     * @see FactoryGarmentShop.Aodai#sew()
     * 
     * This method is used for sewing a chinese dress
     * Input nothing
     * Output nothing
     */
    @Override
    public void sew() {
        
        System.out.println("You are sewing CHINESE DRESS");
    }
}