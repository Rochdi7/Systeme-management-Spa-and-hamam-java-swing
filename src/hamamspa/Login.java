/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hamamspa;

import javax.swing.JOptionPane;

/**
 *
 * @author rochdi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        lblcontinue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/name-tag.png"))); // NOI18N
        jLabel2.setText("Utilisateur :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 70, 120, 30);

        txtusername.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtusername);
        txtusername.setBounds(110, 110, 200, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/padlock.png"))); // NOI18N
        jLabel3.setText("Mot de Passe :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 150, 130, 32);

        txtpassword.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(110, 190, 200, 30);

        btnsignup.setBackground(new java.awt.Color(36, 104, 97));
        btnsignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/key.png"))); // NOI18N
        btnsignup.setText("Se connecter");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup);
        btnsignup.setBounds(140, 240, 150, 40);

        lblcontinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgHamam/WhatsApp Image 2024-03-25 at 11.38.20 AM (1).jpeg"))); // NOI18N
        getContentPane().add(lblcontinue);
        lblcontinue.setBounds(0, -40, 670, 410);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 220, 37, 16);

        setSize(new java.awt.Dimension(657, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
         if(txtusername.getText().isEmpty() || txtpassword.getText().isEmpty()){
             
         }
         else if(txtusername.getText().equals("admin") && txtpassword.getText().equals("admin")){
             new Administrateur.Admin().setVisible(true);
             this.dispose();
              
         }
         else if(txtusername.getText().equals("user") && txtpassword.getText().equals("user")){
             new SecrétaireMenu().setVisible(true);
             this.dispose();
         }
         else{
             JOptionPane.showConfirmDialog(this, "incorrect informations");
         }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

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
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcontinue;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}