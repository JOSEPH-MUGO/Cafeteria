/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Bill {
    private int id;
    private String Name;
    private String Email;
    private String Phone_NO;
    private String Date;
    private String Total;
    private String Created_by;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone_NO() {
        return Phone_NO;
    }

    public void setPhone_NO(String Phone_NO) {
        this.Phone_NO = Phone_NO;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getCreated_by() {
        return Created_by;
    }

    public void setCreated_by(String Created_by) {
        this.Created_by = Created_by;
    }
    
}
