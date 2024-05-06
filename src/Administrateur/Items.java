/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrateur;
import hamamspa.VendreProduit;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rochdi
 */
public class Items extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    public Items() {
        initComponents();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
            showProduct();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    ResultSet rs = null,rs1=null;
    Connection conn= null;
    Statement st = null,st1=null;
    
    
    
    public void showProduct() {
    try {
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM ProductTbl");

        // Create a table model
        DefaultTableModel model = new DefaultTableModel();

        // Get metadata of the ResultSet
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Add columns to the model
        for (int i = 1; i <= columnCount; i++) {
            model.addColumn(rsmd.getColumnName(i));
        }

        // Add rows to the model
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        // Set the model to the JTable
        tableproduct.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void filterProduct() {
    try {
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM ProductTbl WHERE Category = '" + combofilter.getSelectedItem().toString() + "'");

        // Create a new DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Get metadata of the ResultSet
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Add columns to the model
        for (int i = 1; i <= columnCount; i++) {
            model.addColumn(rsmd.getColumnName(i));
        }

        // Add rows to the model
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        // Set the model to the JTable
        tableproduct.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        combocategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        combofilter = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 104, 97));

        jPanel3.setBackground(new java.awt.Color(11, 114, 129));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        combocategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hamam", "Massage", "Manicure & Pédicure", "Soins Esthétiques", "épililation", "Coiffure ", "Maquillage" }));

        jLabel4.setBackground(new java.awt.Color(53, 135, 111));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/categorization.png"))); // NOI18N
        jLabel4.setText("Category :");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Information Produit"));

        jLabel3.setBackground(new java.awt.Color(53, 135, 111));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/businesscard.png"))); // NOI18N
        jLabel3.setText("Nom :");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information produit"));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(53, 135, 111));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/price-tag.png"))); // NOI18N
        jLabel5.setText("Price :");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Information produit"));

        btnadd.setBackground(new java.awt.Color(11, 114, 129));
        btnadd.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/plus.png"))); // NOI18N
        btnadd.setText("Ajouter");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(11, 114, 129));
        btndelete.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/bin.png"))); // NOI18N
        btndelete.setText("Supprimer");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(11, 114, 129));
        btnedit.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/circle.png"))); // NOI18N
        btnedit.setText("Modifier ");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        combofilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hamam", "Massage", "Manicure & Pédicure", "Soins Esthétiques", "épililation", "Coiffure ", "Maquillage" }));
        combofilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combofilterItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Filtre :");

        btnrefresh.setBackground(new java.awt.Color(11, 114, 129));
        btnrefresh.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/refresh.png"))); // NOI18N
        btnrefresh.setText("refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnadd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btndelete)
                        .addComponent(combocategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnedit)))
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combofilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnrefresh)
                .addGap(271, 271, 271))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combocategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btndelete)
                    .addComponent(btnedit))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combofilter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnrefresh)))
                .addContainerGap())
        );

        tableproduct.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        tableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", " Category", "Price"
            }
        ));
        tableproduct.setGridColor(new java.awt.Color(0, 0, 153));
        tableproduct.setRowHeight(40);
        tableproduct.setRowMargin(1);
        tableproduct.setSelectionBackground(new java.awt.Color(11, 114, 129));
        tableproduct.setShowGrid(true);
        tableproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableproduct);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(280, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1218, 867));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     int PrNum;
    private void CountProd(){
        try{
            st1 = conn.createStatement();
            rs1 = st1.executeQuery("select Max(PNum) from ProductTbl");
            rs1.next();
            PrNum = rs1.getInt(1)+1;
        }
        catch(Exception e){
            
        }
    }
    
    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if(txtname.getText().isEmpty() || txtprice.getText().isEmpty() || combocategory.getSelectedIndex() == -1){
            JOptionPane.showConfirmDialog(null, "Missing Information");
        }else{
            
            try{
                CountProd();
                
                  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl","root","");
                  PreparedStatement pst = conn.prepareStatement("insert into producttbl values (?,?,?,?)");
                  pst.setInt(1, PrNum);
                  pst.setString(2, txtname.getText());
                  pst.setString(3, combocategory.getSelectedItem().toString());
                  pst.setInt(4, Integer.valueOf(txtprice.getText()));
                  int row = pst.executeUpdate();
                  JOptionPane.showConfirmDialog(this, "Item Added!!!");
                  conn.close();
                  showProduct();
            }
            catch(SQLException ex){
                JOptionPane.showConfirmDialog(this, ex);
            }
          
        }
        
    }//GEN-LAST:event_btnaddActionPerformed
int key = 0;
    private void tableproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) tableproduct.getModel();
        int MyIndex = tableproduct.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtname.setText((model.getValueAt(MyIndex, 1).toString()));
       // combocategory.setText((model.getValueAt(MyIndex, 1).toString()));
        txtprice.setText((model.getValueAt(MyIndex, 3).toString()));
        
        
    }//GEN-LAST:event_tableproductMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
                                          
    if(txtname.getText().isEmpty() || txtprice.getText().isEmpty() || combocategory.getSelectedIndex() == -1){
        JOptionPane.showConfirmDialog(null, "Missing Information");
    } else {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
            PreparedStatement pst = conn.prepareStatement("update producttbl set Pname=?, Category=?, Price=? where PNum=?");
            pst.setString(1, txtname.getText());
            pst.setString(2, combocategory.getSelectedItem().toString());
            pst.setInt(3, Integer.valueOf(txtprice.getText()));
            pst.setInt(4, key);
            int row = pst.executeUpdate();
            if(row > 0) {
                JOptionPane.showMessageDialog(this, "Item Updated!!!");
                showProduct();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update item.");
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    


          
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         if(txtname.getText().isEmpty() || txtprice.getText().isEmpty() || combocategory.getSelectedIndex() == -1){
            JOptionPane.showConfirmDialog(null, "Missing Information");
        }else{
            
            try{
                CountProd();
                
                  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl","root","");
                  PreparedStatement pst = conn.prepareStatement("delete from producttbl where PNum =?");
                  pst.setInt(1, key);
                  int row = pst.executeUpdate();
                  JOptionPane.showConfirmDialog(this, "Item Deleted!!!");
                  conn.close();
                  showProduct();
            }
            catch(SQLException ex){
                JOptionPane.showConfirmDialog(this, ex);
            }
          
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void combofilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combofilterItemStateChanged
        filterProduct();
        
    }//GEN-LAST:event_combofilterItemStateChanged

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
       showProduct();
    }//GEN-LAST:event_btnrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JComboBox<String> combocategory;
    private javax.swing.JComboBox<String> combofilter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableproduct;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
