package FactoryGarmentShopUpdate;



/**
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 3:23:31 PM
 */
public class ChineseDressShop implements GarmentShop{

    public ChineseDress chineseDress;

    public ChineseDressShop(){
        chineseDress = new ChineseDress();
    }
}