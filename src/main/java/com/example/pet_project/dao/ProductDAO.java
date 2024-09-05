//package com.example.pet_project.dao;
//
//import com.example.pet_project.entities.Product;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class ProductDAO {
//
//    private static final String URL = "jdbc:mysql://localhost:3306/my_pet_project";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//
//    public void addProduct(Product product) {
//        String sql = "INSERT INTO products (name, price, stock_quantity, memory_size, color, manufacturer, number_of_sim_cards) VALUES (?, ?, ?, ?, ?, ?, ?)";
//
//        try (
//                Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//                PreparedStatement stmt = conn.prepareStatement(sql)
//        ) {
//            stmt.setString(1, product.getName());
//            stmt.setDouble(2, product.getPrice());
//            stmt.setInt(3, product.getStockQuantity());
//            stmt.setInt(4, product.getMemorySize());
//            stmt.setString(5, product.getColor());
//            stmt.setString(6, product.getManufacturer());
//            stmt.setInt(7, product.getNumberOfSimCards());
//
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
