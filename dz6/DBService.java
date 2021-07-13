package ru.romankuznetsov.dz_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBService {
    private DBService(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=spring_shop", "postgres", "admin");
        } catch (SQLException e) {
            throw new RuntimeException("error during DB connection", e);
        }
    }
}
