/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hamamspa;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rochdi
 */
public class SelectionnerReservation extends javax.swing.JFrame {

    private double totalprice = 0.0;
    
    public SelectionnerReservation() {
        initComponents();
        afficherclient();
        afficherChambre();
        afficherservice();
    }
    ResultSet rs = null,rs1=null;
    Connection conn= null;
    Statement st = null,st1=null;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combocustomer = new javax.swing.JComboBox<>();
        txtduration = new javax.swing.JTextField();
        comboemployee = new javax.swing.JComboBox<>();
        comboroom = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableservices = new javax.swing.JTable();
        btnajouter = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblticketn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblprixtotal = new javax.swing.JLabel();
        btnimprimer = new javax.swing.JButton();
        btnbook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        combotime = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        facture = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1599, 1088));

        jPanel1.setBackground(new java.awt.Color(36, 104, 97));

        combocustomer.setBackground(new java.awt.Color(36, 104, 97));
        combocustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocustomerActionPerformed(evt);
            }
        });

        txtduration.setBackground(new java.awt.Color(36, 104, 97));
        txtduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurationActionPerformed(evt);
            }
        });

        comboemployee.setBackground(new java.awt.Color(36, 104, 97));
        comboemployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "khadija", "Aya", "Amina" }));
        comboemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboemployeeActionPerformed(evt);
            }
        });

        comboroom.setBackground(new java.awt.Color(36, 104, 97));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selection Votre favorable Employee :");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Display", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selectionner Chambre :");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Display", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entrer La Duration :");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Display", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nom De Client :");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableservices.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        tableservices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", " Category", "Price"
            }
        ));
        tableservices.setGridColor(new java.awt.Color(0, 0, 153));
        tableservices.setInheritsPopupMenu(true);
        tableservices.setRowHeight(40);
        tableservices.setRowMargin(1);
        tableservices.setSelectionBackground(new java.awt.Color(11, 114, 129));
        tableservices.setShowGrid(true);
        tableservices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableservicesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableservices);
        if (tableservices.getColumnModel().getColumnCount() > 0) {
            tableservices.getColumnModel().getColumn(0).setResizable(false);
            tableservices.getColumnModel().getColumn(1).setMinWidth(150);
            tableservices.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableservices.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        btnajouter.setBackground(new java.awt.Color(52, 104, 86));
        btnajouter.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnajouter.setForeground(new java.awt.Color(255, 255, 255));
        btnajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/plus.png"))); // NOI18N
        btnajouter.setText("Ajouter Votre Service");
        btnajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        lblticketn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Numero Tickets :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Prix Total :");

        lblprixtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblprixtotal.setForeground(new java.awt.Color(255, 0, 0));
        lblprixtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnimprimer.setBackground(new java.awt.Color(52, 104, 86));
        btnimprimer.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnimprimer.setForeground(new java.awt.Color(255, 255, 255));
        btnimprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/bill.png"))); // NOI18N
        btnimprimer.setText("Imprimer");
        btnimprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimerActionPerformed(evt);
            }
        });

        btnbook.setBackground(new java.awt.Color(52, 104, 86));
        btnbook.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnbook.setForeground(new java.awt.Color(255, 255, 255));
        btnbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/reserve.png"))); // NOI18N
        btnbook.setText("Réserver");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblticketn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnimprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblprixtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprixtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnimprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblticketn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Et Heure De Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14))); // NOI18N

        combotime.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        combotime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00" }));
        combotime.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temps De Réservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14))); // NOI18N
        combotime.setName("Temps De Réservation"); // NOI18N
        combotime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotimeActionPerformed(evt);
            }
        });

        jDateChooser1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date De Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combotime, 0, 257, Short.MAX_VALUE))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(combotime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnajouter))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combocustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboemployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboroom, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1367, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combocustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(txtduration, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(comboroom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1402, Short.MAX_VALUE))
        );

        facture.setColumns(20);
        facture.setRows(5);
        jScrollPane3.setViewportView(facture);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(489, 489, 489))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void afficherservice(){
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl","root","");
        String query = "SELECT * FROM ProductTbl";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        tableservices.setModel(model);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            model.addColumn(rsmd.getColumnName(i));
        }

        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
reservation();
    }//GEN-LAST:event_btnbookActionPerformed

    private void combotimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotimeActionPerformed

    private void comboemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboemployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboemployeeActionPerformed

    private void tableservicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableservicesMouseClicked
         
      

    }//GEN-LAST:event_tableservicesMouseClicked
     
private void updateTotalPrice() {
    double totalPrice = 0.0;
    DefaultTableModel model = (DefaultTableModel) tableservices.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        double price = Double.parseDouble(model.getValueAt(i, 2).toString());
        totalPrice += price;
    }
    lblprixtotal.setText(String.valueOf(totalPrice));
}


    
    
    private void btnajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterActionPerformed
          DefaultTableModel model = (DefaultTableModel) tableservices.getModel();
    int[] selectedRows = tableservices.getSelectedRows();
    double totalPrice = 0.0;

    for (int i = 0; i < selectedRows.length; i++) {
        double price = Double.parseDouble(model.getValueAt(selectedRows[i], 3).toString());
        totalPrice += price;
    }

    totalprice += totalPrice;
    lblprixtotal.setText(String.valueOf(totalprice));
    }//GEN-LAST:event_btnajouterActionPerformed
       int BNum;
    private void CountBill(){
        try{
            st1 = conn.createStatement();
            rs1 = st1.executeQuery("select Max(BNum) from biltbl");
            rs1.next();
            BNum = rs1.getInt(1)+1;
        }
        catch(Exception e){
            
        }
    }
    
   private void insertbill(){
    try {
        CountBill();

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl","root","");
        PreparedStatement pst = conn.prepareStatement("insert into billtbl (BNum, BDate, Amount) values (?,?,?)");

        pst.setInt(1, BNum);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDateTime now = LocalDateTime.now(); 
        pst.setString(2, now.toString().substring(1, 10));
        
        pst.setDouble(3, totalprice); 

        int row = pst.executeUpdate();
        JOptionPane.showConfirmDialog(this, "bill Added!!!");
        conn.close();
        afficherservice();
    } catch(SQLException ex) {
        JOptionPane.showConfirmDialog(this, ex);
    }
}

    
    private void btnimprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimerActionPerformed
    try {
    Random ran = new Random();
    int n = ran.nextInt(100000) + 1;
    String val = String.valueOf(n);
    lblticketn.setText(val);

    facture.setText("");

    facture.setText(facture.getText() + "      \t Hamam & Spa AL Salam - Marrakech      \n\n");

    facture.setText(facture.getText() + "                  \t\t Recu de paiement       \n");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
    LocalDateTime now = LocalDateTime.now();
    facture.setText(facture.getText() + "  " + now + "  \n");
    facture.setText(facture.getText() + "N° :  " + val + "\n");

    facture.setText(facture.getText() + "--------------------------------------------------------------------\n");

    facture.setText(facture.getText() + " Service        \t category        \t       prix " + "\n");
    facture.setText(facture.getText() + "--------------------------------------------------------------------\n");

    double totalPrice = 0.0;

    DefaultTableModel model = (DefaultTableModel) tableservices.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        if (tableservices.isRowSelected(i)) {
            String name = tableservices.getValueAt(i, 1).toString();
            String category = tableservices.getValueAt(i, 2).toString(); 
            String price = tableservices.getValueAt(i, 3).toString(); 

            facture.setText(facture.getText() + name + "\t" + category + "\t" + price + "\n");
            totalPrice += Double.parseDouble(price);
        }
    }

    facture.setText(facture.getText() + "-------------------------------------------------------------------\n");
    facture.setText(facture.getText() + "TOTAL :   ");
    facture.setText(facture.getText() + "\t" + totalPrice + " DH \n");

    facture.setText(facture.getText() + "\n\n");
    facture.setText(facture.getText() + "Merci pour votre réservation. Nous espérons vous revoir bientôt!");

    facture.print();

    insertbill();

    totalprice = 0.0;
    lblprixtotal.setText("");
    updateTotalPrice();

} catch (Exception e) {
    e.printStackTrace();
}




    }//GEN-LAST:event_btnimprimerActionPerformed

    private void combocustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocustomerActionPerformed

    private void txtdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurationActionPerformed
         
      private void afficherChambre() {
        comboroom.removeAllItems(); 

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM room");
            while (resultSet.next()) {
              String room = resultSet.getString("room");
                comboroom.addItem(room); 
            }
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   private void afficherclient() {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
        String query = "SELECT name FROM customer";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String customerName = rs.getString("name");
            combocustomer.addItem(customerName);
        }
        rs.close();
        st.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

  private void reservation() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm"); // Use 'H' for 24-hour clock without leading zero
    String selectedTimeStr = (String) combotime.getSelectedItem();
    LocalTime selectedTime = null;
    try {
        selectedTime = LocalTime.parse(selectedTimeStr, formatter);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une heure valide (HH:mm).");
        return;
    }

    Date selectedDate = jDateChooser1.getDate();
    String Customershow = (String) combocustomer.getSelectedItem();
    int selectedServiceIndex = tableservices.getSelectedRow();
    String service = (String) tableservices.getValueAt(selectedServiceIndex, 1);
    int duration = 0;
    try {
        duration = Integer.parseInt(txtduration.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Veuillez saisir une durée valide (valeur numérique).");
        return;
    }
    String employee = (String) comboemployee.getSelectedItem();
    String room = (String) comboroom.getSelectedItem();

    if (selectedTime != null) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");

            String checkSql = "SELECT * FROM reservations WHERE DATE(reservation) = ? AND TIME(reservation) = ?";
            PreparedStatement checkSt = conn.prepareStatement(checkSql);
            checkSt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(selectedDate));
            checkSt.setString(2, selectedTime.toString());
            ResultSet rs = checkSt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Une autre réservation existe à la date et à l'heure sélectionnées. Veuillez choisir une autre date ou heure.");
            } else {
                String reservationDateTime = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate) + " " + selectedTime;

                String insertSql1 = "INSERT INTO reservations (name, type_service, duration_service, employee_service, reservation, room, prix) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st1 = conn.prepareStatement(insertSql1);
                st1.setString(1, Customershow);
                st1.setString(2, service);
                st1.setInt(3, duration);
                st1.setString(4, employee);
                st1.setString(5, reservationDateTime);
                st1.setString(6, room);
                st1.setDouble(7, Double.parseDouble(lblprixtotal.getText()));
                st1.executeUpdate();
                st1.close();

                String insertSql2 = "INSERT INTO allreservations (name, type_service, duration_service, employee_service, reservation, room, prix) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st2 = conn.prepareStatement(insertSql2);
                st2.setString(1, Customershow);
                st2.setString(2, service);
                st2.setInt(3, duration);
                st2.setString(4, employee);
                st2.setString(5, reservationDateTime);
                st2.setString(6, room);
                st2.setDouble(7, Double.parseDouble(lblprixtotal.getText()));
                st2.executeUpdate();
                st2.close();

                ImageIcon icon = new ImageIcon("C:\\Users\\rochdi\\Documents\\NetBeansProjects\\HamamSpa\\src\\images\\imgHamam\\check-mark.png");
                JOptionPane.showMessageDialog(this, "Réservation Ajouter avec Success!", "Success", JOptionPane.INFORMATION_MESSAGE, icon);

                String updateSql = "UPDATE room SET ava = 'Occupée' WHERE room = ?";
                PreparedStatement updateSt = conn.prepareStatement(updateSql);
                updateSt.setString(1, room);
                updateSt.executeUpdate();
                updateSt.close();
            }

            rs.close();
            checkSt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}






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
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionnerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         SwingUtilities.invokeLater(() -> {
            SelectionnerReservation frame = new SelectionnerReservation();
            frame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajouter;
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnimprimer;
    private javax.swing.JComboBox<String> combocustomer;
    private javax.swing.JComboBox<String> comboemployee;
    private javax.swing.JComboBox<String> comboroom;
    private javax.swing.JComboBox<String> combotime;
    private javax.swing.JTextArea facture;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblprixtotal;
    private javax.swing.JLabel lblticketn;
    private javax.swing.JTable tableservices;
    private javax.swing.JTextField txtduration;
    // End of variables declaration//GEN-END:variables
}
