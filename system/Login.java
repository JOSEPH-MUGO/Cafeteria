/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafeteria.management.system;

import db.UserDb;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author DELL
 */
public class Login extends javax.swing.JFrame {
     public String EmailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        jBlogin.setEnabled(false);
    }
    public void clear(){
        jtxtEmail.setText("");
        jpassword.setText("");
        jBlogin.setEnabled(false);
    }
    public void validateFields(){
        String Email = jtxtEmail.getText();
        String Password = jpassword.getText();
        if( Email.matches(EmailPattern) && !Password.equals(""))
        {
        jBlogin.setEnabled(true);
    }else{
            jBlogin.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jBlogin = new javax.swing.JButton();
        jBclear = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jBFpassword = new javax.swing.JButton();
        jBreg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jtxtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 246, -1));

        jpassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 246, -1));

        jBlogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jBlogin.setText("login");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });
        getContentPane().add(jBlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jBclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        jBclear.setText("clear");
        jBclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclearActionPerformed(evt);
            }
        });
        getContentPane().add(jBclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jBexit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit small.png"))); // NOI18N
        jBexit.setText("Exit");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });
        getContentPane().add(jBexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jBFpassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jBFpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change Password.png"))); // NOI18N
        jBFpassword.setText("Forget password?");
        jBFpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jBFpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jBreg.setText("Register");
        jBreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregActionPerformed(evt);
            }
        });
        getContentPane().add(jBreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setText("Don't have an account?");
        jTextPane1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/first page background.PNG"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFpasswordActionPerformed

    private void jBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloginActionPerformed
        // TODO add your handling code here:
        String Email = jtxtEmail.getText();
        String Password = jpassword.getText();
        User user=null;
        user= UserDb.login(Email, Password);
        
        if(user == null)
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Sorry,Incorrect Email or Password!</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        else{
            if(user.getStatus().equals("false")){
                ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null,"<html><b>Wait for Admin approval</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
                clear();
            }
            if(user.getStatus().equals("true")){
                setVisible(false);
                new Home(Email).setVisible(true);
            }
        }
    }//GEN-LAST:event_jBloginActionPerformed
private JFrame frame;
    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Login", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jBexitActionPerformed

    private void jtxtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEmailKeyReleased
        // TODO add your handling code here:
       validateFields();
    }//GEN-LAST:event_jtxtEmailKeyReleased

    private void jpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jpasswordKeyReleased

    private void jBclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jBclearActionPerformed

    private void jBregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jBregActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFpassword;
    private javax.swing.JButton jBclear;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBlogin;
    private javax.swing.JButton jBreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtxtEmail;
    // End of variables declaration//GEN-END:variables
}
