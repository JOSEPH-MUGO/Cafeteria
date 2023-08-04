/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import model.Product;
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class ProductDb {

    public static void save(Product product) {
        String query = "insert into product (Name,Category,Price) values('" + product.getName() + "','" + product.getCategory() + "','" + product.getPrice() + "')";
        DbOperations.setDataOrDelete(query, "Product added successfully!");
    }
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arraylist = new ArrayList<>();
        try{
        ResultSet rs = DbOperations.getData("select *from product");
        while(rs.next()){
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("Name"));
            product.setCategory(rs.getString("Category"));
            product.setPrice(rs.getString("Price"));
            arraylist.add(product);
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        return arraylist;
    }
    public static void update(Product product){
        String query = "update product set Name ='"+product.getName()+"', Category='"+product.getCategory()+"', Price ='"+product.getPrice()+"' where id= '"+product.getId()+"'";
        DbOperations.setDataOrDelete(query, "Product updated successfully");
    }
    public static void delete(String id){
        String query = "delete from product where id='"+id+"'";
        DbOperations.setDataOrDelete(query,"product deleted successfully");
    }
    public static ArrayList<Product> getAllRecordsByCategory(String Category){
        ArrayList<Product> arraylist = new ArrayList<>();
        try{
        ResultSet rs = DbOperations.getData("select *from product where Category ='"+Category+"'");
        while(rs.next()){
            Product product = new Product();
            product.setName(rs.getString("Name"));
            arraylist.add(product);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
        public static ArrayList<Product> filterProductByName(String Name, String Category){
        ArrayList<Product> arraylist = new ArrayList<>();
        try{
        ResultSet rs = DbOperations.getData("select *from product where Name like '%"+Name+"%' and Category='"+Category+"'" );
        while(rs.next()){
            Product product = new Product();
            product.setName(rs.getString("Name"));
            arraylist.add(product);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
        public static Product getProductByName(String Name){
            Product product = new Product();
            try{
            ResultSet rs = DbOperations.getData("select *from product where Name= '"+Name+"'");
            while(rs.next()){
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            }
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
            return product;
        }

}
