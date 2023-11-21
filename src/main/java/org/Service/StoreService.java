package org.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StoreService {
    Map productPrice = new HashMap<String, Integer>();
    Map productCount = new HashMap<String, Integer>();

    public String productRegist(String productName, int price, int count) {
        productPrice.put(productName, price);
        productCount.put(productName, count);
        return productName;
    }

    public void priceCountCheck(String productName) {

        if (productPrice.containsKey(productName)) {
            System.out.print(productPrice.get(productName) + "원, 개수는 ");
            System.out.print(productCount.get(productName) + "개");
        }
    }

    public void productPrint() {
        Set<Map.Entry<String, Integer>> allProduct = productPrice.entrySet();
        if(allProduct.isEmpty()){
            System.out.println("--- 현재 등록된 상품이 없습니다. ---");
        }
        else {
            for (Map.Entry<String, Integer> entry : allProduct) {
                String key = entry.getKey();
                int value = entry.getValue();
                int count = (int) productCount.get(key);
                System.out.println("상품명 : " + key + ", 가격 : " + value + ", 개수 : " + count);
            }
        }
    }
}
