/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SignUp_page extends javax.swing.JFrame {

    /**
     * Creates new form Login_page
     */
    public SignUp_page() {
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("SignUp");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 220, 72, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 120, 90, 22);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(160, 180, 90, 22);

        jPasswordField2.setText("jPasswordField1");
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(160, 150, 90, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 90, 90, 22);

        jLabel7.setText("Email :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 120, 60, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/LOGO2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 380, 50);

        jLabel3.setText("Re-write password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 110, 16);

        jLabel6.setText("Password:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 150, 60, 16);

        jLabel4.setText("Username :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 90, 60, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/backGround.JPG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(7, 0, 390, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login_page lp2 = new Login_page();
        lp2.show();
         String username = jTextField2.getText();
    String email = jTextField1.getText();
    char[] password = jPasswordField1.getPassword();
    char[] confirmPassword = jPasswordField2.getPassword();
    
    String passwordString = new String(password);
    String confirmPasswordString = new String(confirmPassword);
    
    if (passwordString.equals(confirmPasswordString)) {
        
        JOptionPane.showMessageDialog(this, "Signup Successful!");
    } else {
       
        JOptionPane.showMessageDialog(this, "Passwords do not match. Please re-write.", "Error", JOptionPane.ERROR_MESSAGE);
        jPasswordField1.setText("");
        jPasswordField2.setText("");
    }
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
            java.util.logging.Logger.getLogger(SignUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
