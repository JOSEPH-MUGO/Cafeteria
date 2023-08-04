/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafeteria.management.system;

import db.CategoryDb;
import db.ProductDb;
import javax.swing.table.DefaultTableModel;
import model.Product;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Category;

/**
 *
 * @author DELL
 */
public class View_Edit_and_Delete_product extends javax.swing.JFrame {

    /**
     * Creates new form View_Edit_and_Delete_product
     */
    public View_Edit_and_Delete_product() {
        initComponents();
        btnupd.setEnabled(false);
        btnde.setEnabled(false);
    }

    public void validatebtn() {
        String Name = txtname.getText();
        String Category = (String) ComboBox1.getSelectedItem();
        String Price = txtprice.getText();
        if (!Name.equals("") && !Price.equals("") && Category != null) {
            btnupd.setEnabled(true);
            btnde.setEnabled(true);
        } else {
            btnupd.setEnabled(false);
            btnde.setEnabled(false);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        btnupd = new javax.swing.JButton();
        btnde = new javax.swing.JButton();
        btncl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view edit delete product.png"))); // NOI18N
        jLabel1.setText("View,Edit & Delete product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 139, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 164, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Price :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 227, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Category :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 198, -1, -1));

        lblid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblid.setText("00");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 140, -1, -1));

        ComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(ComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 196, 243, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 162, 243, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 225, 243, -1));

        btnupd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnupd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnupd.setText("update");
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });
        getContentPane().add(btnupd, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 265, -1, -1));

        btnde.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnde.setText("Delete");
        btnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeActionPerformed(evt);
            }
        });
        getContentPane().add(btnde, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 267, -1, -1));

        btncl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btncl.setText("clear");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        getContentPane().add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 267, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 68, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        validatebtn();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyReleased
        // TODO add your handling code here:
        validatebtn();
    }//GEN-LAST:event_txtpriceKeyReleased

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        int id = Integer.parseInt(lblid.getText());
        product.setId(id);
        product.setName(txtname.getText());
        product.setCategory((String) ComboBox1.getSelectedItem());
        product.setPrice(txtprice.getText());
        ProductDb.update(product);
        setVisible(false);
        new View_Edit_and_Delete_product().setVisible(true);
    }//GEN-LAST:event_btnupdActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> list = ProductDb.getAllRecords();
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getId(), productObj.getName(), productObj.getCategory(), productObj.getPrice()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblid.setText(id);
        String Name = model.getValueAt(index, 1).toString();
        txtname.setText(Name);
        String Category = model.getValueAt(index, 2).toString();
        String Price = model.getValueAt(index, 3).toString();
        txtprice.setText(Price);
        btnupd.setEnabled(true);
        btnde.setEnabled(true);
        ComboBox1.removeAllItems();
        ComboBox1.addItem(Category);
        ArrayList<Category> categorylist = CategoryDb.getAllRecords();
        Iterator<Category> itr = categorylist.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            if (!categoryObj.getName().equals("")) {
                ComboBox1.addItem(categoryObj.getName());
            }

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeActionPerformed
        // TODO add your handling code here:
        String id = lblid.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete  this product", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            ProductDb.delete(id);
            setVisible(false);
            new View_Edit_and_Delete_product().setVisible(true);
        }
    }//GEN-LAST:event_btndeActionPerformed

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new View_Edit_and_Delete_product().setVisible(true);
    }//GEN-LAST:event_btnclActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Edit_and_Delete_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Edit_and_Delete_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Edit_and_Delete_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Edit_and_Delete_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Edit_and_Delete_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JButton btncl;
    private javax.swing.JButton btnde;
    private javax.swing.JButton btnupd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
