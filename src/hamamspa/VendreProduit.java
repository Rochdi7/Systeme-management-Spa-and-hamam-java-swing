/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hamamspa;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;
import java.sql.ResultSetMetaData;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rochdi
 */
public class VendreProduit extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VendreProduit() {
        initComponents();
        ShowProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtnametb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtqtytb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpricetb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combofilter = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablebill = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblt = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblnumeroticket = new javax.swing.JLabel();
        btnimprimer = new javax.swing.JButton();
        btnaddtobill = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemlist = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        facture = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 104, 97));

        jPanel3.setBackground(new java.awt.Color(11, 114, 129));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        txtnametb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnametbActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(53, 135, 111));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/businesscard.png"))); // NOI18N
        jLabel3.setText(" Nom :");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information produit"));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtqtytb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtytbActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/boxes.png"))); // NOI18N
        jLabel4.setText(" Quantité :");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Information produit"));

        txtpricetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpricetbActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/price-tag.png"))); // NOI18N
        jLabel5.setText("Prix :");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Information produit"));

        combofilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shampoing", "Savon" }));
        combofilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combofilterItemStateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Filtre :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnametb, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(txtqtytb))
                .addGap(81, 81, 81)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combofilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtpricetb))
                .addGap(268, 268, 268))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnametb, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combofilter)
                                .addComponent(jLabel18))
                            .addComponent(txtqtytb)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtpricetb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Achat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        tablebill.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tablebill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prix", "Quantité", "Total"
            }
        ));
        tablebill.setRowHeight(40);
        tablebill.setRowMargin(1);
        tablebill.setSelectionBackground(new java.awt.Color(11, 114, 129));
        tablebill.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tablebill);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        lblt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblt.setText("Total : ");

        lbltotal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("N Ticket :");

        lblnumeroticket.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblnumeroticket.setText("0");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(lblt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblnumeroticket, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnimprimer))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblnumeroticket)
                    .addComponent(btnimprimer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnaddtobill.setBackground(new java.awt.Color(52, 104, 86));
        btnaddtobill.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnaddtobill.setForeground(new java.awt.Color(255, 255, 255));
        btnaddtobill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/plus.png"))); // NOI18N
        btnaddtobill.setText("Ajouter");
        btnaddtobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtobillActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));

        itemlist.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        itemlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", " Category", "Prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemlist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemlist.setGridColor(new java.awt.Color(0, 0, 153));
        itemlist.setRowHeight(40);
        itemlist.setRowMargin(1);
        itemlist.setSelectionBackground(new java.awt.Color(11, 114, 129));
        itemlist.setShowGrid(true);
        itemlist.setShowHorizontalLines(false);
        itemlist.setShowVerticalLines(false);
        itemlist.getTableHeader().setReorderingAllowed(false);
        itemlist.setUpdateSelectionOnSort(false);
        itemlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemlist);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vendre produit");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(btnaddtobill)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaddtobill)))
                .addContainerGap(549, Short.MAX_VALUE))
        );

        facture.setColumns(20);
        facture.setRows(5);
        jScrollPane3.setViewportView(facture);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1964, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 518, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(966, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                public void numerotickets(){
        
        Random ran = new Random();
        int n=ran.nextInt(100000)+1;
        String val =String.valueOf(n);
        lblnumeroticket.setText(val);
    }
                ResultSet rs = null,rs1=null;
    Connection conn= null;
    Statement st = null,st1=null;
    
     private void filterProduct() {
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM produitvendre WHERE Category = '" + combofilter.getSelectedItem().toString() + "'");

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
        itemlist.setModel(model);

        // Close resources
        rs.close();
        st.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    
    private void ShowProduct(){
     
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM produitvendre");
            
            DefaultTableModel model = new DefaultTableModel();
            // Add column headers
            model.addColumn("Pnum");
            model.addColumn("Pname");
            model.addColumn("Category");
            model.addColumn("Price");

            // Add rows from the ResultSet
            while (rs.next()) {
                int id = rs.getInt("Pnum");
                String name = rs.getString("Pname");
                String category = rs.getString("Category");
                double price = rs.getDouble("Price");

                model.addRow(new Object[]{id, name, category, price});
            }
            
           itemlist.setModel(model);

            // Close resources
            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to connect to database.");
        }
    }
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
    try{
        CountBill();

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl","root","");
        PreparedStatement pst = conn.prepareStatement("insert into billtbl (BNum, BDate, Amount) values (?,?,?)");
        pst.setInt(1, BNum);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDateTime now =LocalDateTime.now(); 
        pst.setString(2,now.toString().substring(1, 10));
        pst.setInt(3, bilTotal);

        int row = pst.executeUpdate();
        JOptionPane.showConfirmDialog(this, "bill Added!!!");
        conn.close();
        ShowProduct();
    }
    catch(SQLException ex){
        JOptionPane.showConfirmDialog(this, ex);
    }
}


      int key=0;
      int bilTotal=0;
    private void txtnametbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnametbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnametbActionPerformed

    private void txtqtytbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtytbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtytbActionPerformed

    private void txtpricetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpricetbActionPerformed

    }//GEN-LAST:event_txtpricetbActionPerformed

    private void combofilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combofilterItemStateChanged
        filterProduct();
    }//GEN-LAST:event_combofilterItemStateChanged

    private void btnimprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimerActionPerformed
        try {
    Random ran = new Random();
    int n = ran.nextInt(100000) + 1;
    String val = String.valueOf(n);
    lblnumeroticket.setText(val);
    facture.setText(facture.getText() + "      \t Hamam & Spa AL Salam - Marrakech      \n\n");

    facture.setText(facture.getText() + "                  \t\t Recu de paiement       \n");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
    LocalDateTime now = LocalDateTime.now();
    facture.setText(facture.getText() + "  " + now + "  \n");
    facture.setText(facture.getText() + "N° :  " + val + "\n");

    facture.setText(facture.getText() + "--------------------------------------------------------------------\n");

    facture.setText(facture.getText() + " Achat        \t quantité        \t       prix " + "\n");
    facture.setText(facture.getText() + "--------------------------------------------------------------------\n");

    String total = lbltotal.getText();

    DefaultTableModel df = (DefaultTableModel) tablebill.getModel();

    for (int i = 0; i < tablebill.getRowCount(); i++) {
        String name = df.getValueAt(i, 1).toString();
        String price = df.getValueAt(i, 2).toString();
        String quantity = df.getValueAt(i, 3).toString();

        facture.setText(facture.getText() + name + "\t" + quantity + "\t" + price + "\n");

    }
    facture.setText(facture.getText() + "-------------------------------------------------------------------\n");
    facture.setText(facture.getText() + "TOTAL :   ");
    facture.setText(facture.getText() + "\t" + total + " DH \n");

    facture.setText(facture.getText() + "\n\n");
    facture.setText(facture.getText() + "Merci pour votre achat. Nous espérons vous revoir bientôt!");

    facture.print();
    insertbill();
    lbltotal.setText("");
    bilTotal = 0;
} catch (Exception e) {

}
    }//GEN-LAST:event_btnimprimerActionPerformed

    private void btnaddtobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtobillActionPerformed

        if (txtnametb.getText().isEmpty() || txtqtytb.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Missing information!");
} else {
    try {
        double price = Double.parseDouble(txtpricetb.getText());
        int quantity = Integer.parseInt(txtqtytb.getText());
        double total = price * quantity;
        bilTotal += total;
        lbltotal.setText(String.valueOf(bilTotal));
        DefaultTableModel model = (DefaultTableModel) tablebill.getModel();
        String nextRowId = String.valueOf(model.getRowCount() + 1);
        model.addRow(new Object[]{
            nextRowId,
            txtnametb.getText(),
            price,
            quantity,
            total
        });
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price or quantity format!");
    }
        }
    }//GEN-LAST:event_btnaddtobillActionPerformed

    private void itemlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemlistMouseClicked

        DefaultTableModel model = (DefaultTableModel) itemlist.getModel();
        int MyIndex = itemlist.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtnametb.setText((model.getValueAt(MyIndex, 1).toString()));
        // combocategory.setText((model.getValueAt(MyIndex, 1).toString()));
        txtpricetb.setText((model.getValueAt(MyIndex, 3).toString()));
    }//GEN-LAST:event_itemlistMouseClicked

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
            java.util.logging.Logger.getLogger(VendreProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendreProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendreProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendreProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendreProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddtobill;
    private javax.swing.JButton btnimprimer;
    private javax.swing.JComboBox<String> combofilter;
    private javax.swing.JTextArea facture;
    private javax.swing.JTable itemlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblnumeroticket;
    private javax.swing.JLabel lblt;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tablebill;
    private javax.swing.JTextField txtnametb;
    private javax.swing.JTextField txtpricetb;
    private javax.swing.JTextField txtqtytb;
    // End of variables declaration//GEN-END:variables
}