package ru.romankuznetsov.dz_6;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        ProductMapper productMapper = new ProductMapper(DBService.getConnection());
        List<Product> products = productMapper.findAll();
        products.forEach(p -> System.out.println(p.toString()));
        
        Product product = productMapper.findById(2L);
        if (product != null) {
            System.out.println(product);
        }
    }
}
