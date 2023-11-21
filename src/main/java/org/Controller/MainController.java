package org.Controller;

import org.Service.StoreService;

public class MainController {
    StoreService storeService = new StoreService();

    public String productRegist(String productName, int price, int count){
        return storeService.productRegist(productName,price,count);
    }

    public void productCountCheck(String productName){
        storeService.priceCountCheck(productName);
    }
    public void productPrint(){
        storeService.productPrint();
    }
}
