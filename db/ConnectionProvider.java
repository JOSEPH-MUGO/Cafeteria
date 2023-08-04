/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
/**
 *
 * @author Joseph mugo
 */
public class ConnectionProvider {
    public static Connection getCon(){
      Connection con =null;          
     try {
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","");
         return con;
         
         
     } catch (Exception e){
         e.printStackTrace();
         return null;
     }
    }
    
}
