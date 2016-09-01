package FactoryGarmentShop;



/**
 * This class is used for processing businesses of instance fashion aodai
 * 
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 2:40:18 PM
 */
public class FashionAodai implements Aodai {

	public FashionAodai(){

	}

	public void finalize() throws Throwable {

	}

	 /* (non-Javadoc)
     * @see FactoryGarmentShop.Aodai#sew()
     * 
     * This method is used for sewing a fashion aodai
     * Input nothing
     * Output nothing
     */
    @Override
    public void sew() {
        
        System.out.println("You are sewing FASHION AO DAI");
    }

}