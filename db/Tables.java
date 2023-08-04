package db;

import javax.swing.JOptionPane;

/**
 * @author Joseph mugo
 */
public class Tables {
    public static void main(String[] args) {
        try {
            String UserTable = "create table User(id int AUTO_INCREMENT primary key,Name varchar(200),Email varchar(200),Phone_Number varchar(20),Password varchar(200),Security_question varchar(200),Answer varchar(200),Status varchar(200),UNIQUE (Email))";
            String Admin ="insert into User(Name,Email,Phone_Number,Password,Security_question,Answer,Status)values('Admin','josephmugo0740@gmail.com','0707212847','Joesam@12','what is your favourite pet?','cat','true')";
            String CategoryTable = "create table Category(id int AUTO_INCREMENT primary key,Name varchar(200))";
            String BillTable = "create table Bill(id int primary key,Name varchar(200),Email varchar(200),Phone_NO varchar(15),Date varchar(50),Total varchar(200),Created_by varchar(200))";
            String ProductTable = "create table Product(id int AUTO_INCREMENT primary key,Name varchar(200),Category varchar(200),Price varchar(200))";
            DbOperations.setDataOrDelete(ProductTable, "Product table created successfully!");
            DbOperations.setDataOrDelete(CategoryTable, "Category Table created successfully");
            DbOperations.setDataOrDelete(UserTable, "UserTable created successfully");
            DbOperations.setDataOrDelete(Admin, "Admin created successfully");
            DbOperations.setDataOrDelete(BillTable, "Bill Table created successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

