package FactoryGarmentShop;



/**
 * This class is used for processing businesses of instance traditional aodai
 * 
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 2:40:16 PM
 */
public class TraditionalAodai implements Aodai {

	public TraditionalAodai(){

	}

    /* (non-Javadoc)
     * @see FactoryGarmentShop.Aodai#sew()
     * 
     * This method is used for sewing a traditional aodai
     * Input nothing
     * Output nothing
     */
    @Override
    public void sew() {
        
        System.out.println("You are sewing TRADITIONAL AO DAI");
    }
}