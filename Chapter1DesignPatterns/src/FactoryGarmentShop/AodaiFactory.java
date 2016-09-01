package FactoryGarmentShop;


/**
 * This class is used for processing businesses of instance aodai factory
 * 
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 2:40:20 PM
 */
public class AodaiFactory {

	public AodaiFactory(){

	}
	
	/*
	 * 
	 * input nothing
	 * output
	 */
	public Aodai getAodai(String aodaiType){
	    
	    if (aodaiType == null) {
            return null;
        }
        
        if (aodaiType.equalsIgnoreCase("TRADITIONAL")) {
            return new TraditionalAodai();
        }
        
        if (aodaiType.equalsIgnoreCase("FASHION")) {
            return new FashionAodai();
        }
        
        if (aodaiType.equalsIgnoreCase("CHINESE DRESS")) {
            return new ChineseDress();
        }
	    
		return null;
	}

}