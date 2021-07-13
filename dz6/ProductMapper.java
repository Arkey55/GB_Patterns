package ru.romankuznetsov.dz_6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public List<Product> findAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("select id, title, price from products");
        try(ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                Product product = new Product(resultSet.getLong(1), resultSet.getString(2), resultSet.getBigDecimal(3));
                products.add(product);
                ProductIdentityMap.addProduct(product);
            }
        }
        return products;
    }

    public Product findById(Long id) throws SQLException {
        Product product = ProductIdentityMap.getProduct(id);
        if (product != null){
            return product;
        } else {
            PreparedStatement statement = connection.prepareStatement("select id, title, price from products where id = ?");
            statement.setLong(1, id);
            try(ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()) {
                    product = new Product(resultSet.getLong(1), resultSet.getString(2), resultSet.getBigDecimal(3));
                }
            }
            System.out.println("from db");
            return product;
        }
    }

    public void deleteById(Long id) {
        try{
            PreparedStatement statement = connection.prepareStatement("delete from products where id = ?");
            statement.setLong(1, id);
            statement.execute();
            ProductIdentityMap.deleteProduct(id);
        } catch (SQLException e) {
            throw new RuntimeException("error in delete method", e);
        }
    }

    public void saveProduct(Product product){
        try {
            PreparedStatement statement = connection.prepareStatement("insert into products (title, price) values (?, ?)");
            statement.setString(1, product.getTitle());
            statement.setBigDecimal(2, product.getPrice());
            statement.execute();
            ProductIdentityMap.addProduct(product);
        } catch (SQLException e){
            throw new RuntimeException("error in save method", e);
        }

    }
}
