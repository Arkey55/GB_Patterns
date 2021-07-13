package ru.romankuznetsov.dz_6;

import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {
    private static Map<Long, Product> productMap = new HashMap<>();

    public static void addProduct(Product product){
        productMap.put(product.getId(), product);
    }

    public static Product getProduct(Long id){
        return productMap.get(id);
    }

    public static void deleteProduct(Long id){
        productMap.remove(id);
    }

}
