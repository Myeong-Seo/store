package org.Model;

public class Store {
    String productName;
    int price;

    int ea;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEa() {
        return ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }

    @Override
    public String toString() {
        return "Store{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", ea=" + ea +
                '}';
    }
}
