package com.workintech.s14d4.main;

import com.workintech.s14d4.product.Bread;
import com.workintech.s14d4.product.Chocolate;
import com.workintech.s14d4.product.Coke;
import com.workintech.s14d4.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweets",15,"Akanzi", "Red",true);
        products[1] = new Bread("Siyez Ekmek", 9, "Taze Ekmek", "einkorn", "brown");
        products[2] = new Coke("Coke", 45, "This is dangerous.", true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null) {
            for(ProductForSale product: products){
                if(product != null) {
                    product.showDetails();
                }
            }
        }

    }
}