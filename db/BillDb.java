/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Bill;
import java.util.*;

/**
 *
 * @author DELL
 */
public class BillDb {

    public static String getid() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from Bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id += id;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);

    }

    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getEmail() + "','" + bill.getPhone_NO() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreated_by() + "')";
        DbOperations.setDataOrDelete(query, "Bill details added successfully");
    }

    public static ArrayList<Bill> getAllRecordsByINC(String Date) {
        ArrayList<Bill> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from Bill where Date like '%" + Date + "%'");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("Name"));
                bill.setPhone_NO(rs.getString("Phone_NO"));
                bill.setEmail(rs.getString("Email"));
                bill.setDate(rs.getString("Date"));
                bill.setTotal(rs.getString("Total"));
                bill.setCreated_by(rs.getString("Created_By"));
                arraylist.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    
    public static ArrayList<Bill> getAllRecordsByDesc(String Date) {
        ArrayList<Bill> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from Bill where Date like '%" + Date + "%' order by id Desc");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("Name"));
                bill.setPhone_NO(rs.getString("Phone_NO"));
                bill.setEmail(rs.getString("Email"));
                bill.setDate(rs.getString("Date"));
                bill.setTotal(rs.getString("Total"));
                bill.setCreated_by(rs.getString("Created_by"));
                arraylist.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

}
