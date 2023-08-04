package db;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 * Database operations utility class
 */
public class DbOperations {
    public static void setDataOrDelete(String Query, String msg) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);

            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String Query)
    {
        
            try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);
            return rs;
            }
            catch(Exception e){
             JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
             return null;

            }
    }
}
