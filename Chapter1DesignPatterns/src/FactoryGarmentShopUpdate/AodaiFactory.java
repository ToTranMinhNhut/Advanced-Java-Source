package FactoryGarmentShopUpdate;


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
            TraditionalAodaiShop tShop = new TraditionalAodaiShop();
            return tShop.traditionalAodai;
        }
        
        if (aodaiType.equalsIgnoreCase("FASHION")) {
            FashionAodaiShop fShop = new FashionAodaiShop();
            return fShop.fashionAodai;
        }
        
        if (aodaiType.equalsIgnoreCase("CHINESE DRESS")) {
            ChineseDressShop cShop = new ChineseDressShop();
            return cShop.chineseDress;
        }
	    
		return null;
	}

}