/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.User;
import java.util.*;
/**
 *
 * @author DELL
 */
public class UserDb {
    public static void save(User user){
    String query = "insert into user (Name,Email,Phone_Number,Password,Security_question,Answer,Status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPhone_Number()+"','"+user.getPassword()+"','"+user.getSecurity_question()+"','"+user.getAnswer()+"','true')";
    DbOperations.setDataOrDelete(query, "Registration successfully!");
     }
    public static User login(String Email,String Password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from User where Email= '"+Email+"' and Password= '"+Password+"'");
            while( rs.next()){
            user = new User();
            user.setStatus(rs.getString("Status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
           
        }
        return user;
    }
    
    public static User getSecurity_question(String Email){
        User user = null;
        try{
        ResultSet rs =DbOperations.getData("select *from user where Email ='"+Email+"'");
        while(rs.next()){
            user = new User();
        user.setSecurity_question(rs.getString("Security_question" ));
        user.setAnswer(rs.getString("Answer"));
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    public static void Update(String Email,String NP){
        String query ="update user set Password = '"+NP+"' where Email = '"+Email+"' ";
        DbOperations.setDataOrDelete(query,"Password changed successfully!");
    }
    
    public static ArrayList<User> getAllRecords(String Email){
        ArrayList<User> arraylist = new ArrayList<>();
        try{
        ResultSet rs = DbOperations.getData("select *from the User where Email like '%"+Email+"%' ");
        while(rs.next()){
            User user = new User();
            user.setID(rs.getInt("id"));
            user.setName(rs.getString("Name"));
            user.setEmail(rs.getString("Email"));
            user.setPhone_Number(rs.getString("Phone_Number"));
            user.setSecurity_question(rs.getString("Security_question"));
            user.setAnswer(rs.getString("Answer"));
            arraylist.add(user);
            
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    public static void changestatus(String Email,String Status){
        String query ="update user set Status= '"+Status+"' where Email = '"+Email+"'";
        DbOperations.setDataOrDelete(query, "Status changed successfully");
    }
    
    public static void changePassword(String Email,String OldPassword,String newPassword){
        try{
        ResultSet rs = DbOperations.getData("select *from User where Email='"+Email+"' and Password='"+OldPassword+"'");
        if(rs.next()){
            Update(Email, newPassword);
        }else{
            JOptionPane.showMessageDialog(null,"Incorrect Old password!");
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
        public static void changeSecurityQuestion(String Email,String Password,String SecurityQuestion,String Answer){
        try{
        ResultSet rs = DbOperations.getData("select *from User where Email='"+Email+"' and Password='"+Password+"'");
        if(rs.next()){
            update(Email, SecurityQuestion, Answer);
        }else{
            JOptionPane.showMessageDialog(null,"Incorrect password!");
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
        public static void update(String Email,String SecurityQuestion,String Answer){
            String query = "update user set Security_question = '"+ SecurityQuestion+"',Answer= '"+Answer+"' where Email='"+Email+"'";
            DbOperations.setDataOrDelete(query, "Security question changed successfully");
        }
}

