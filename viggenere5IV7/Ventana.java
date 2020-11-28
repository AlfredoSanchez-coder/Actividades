
package viggenere5IV7;

/**
 *
 * @author alfre
 */

import java.util.Locale;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    Viggecod vige= new Viggecod();
    
    public Ventana() {
        this.setTitle("CIFRADO VIGGENERE SWyA 5IV7");
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_msj = new javax.swing.JTextArea();
        btn_des = new javax.swing.JButton();
        btn_cifra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Cifrado Viggenere");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Introduzca mensaje a cifrar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 30));

        txt_key.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_keyActionPerformed(evt);
            }
        });
        getContentPane().add(txt_key, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 30));

        txt_msj.setColumns(20);
        txt_msj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_msj.setRows(5);
        jScrollPane1.setViewportView(txt_msj);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 390, 120));

        btn_des.setBackground(new java.awt.Color(255, 255, 255));
        btn_des.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_des.setText("Descifrar");
        btn_des.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desActionPerformed(evt);
            }
        });
        getContentPane().add(btn_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 170, 30));

        btn_cifra.setBackground(new java.awt.Color(255, 255, 255));
        btn_cifra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cifra.setForeground(new java.awt.Color(51, 51, 51));
        btn_cifra.setText("Cifrar texto");
        btn_cifra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cifra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cifraActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cifra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Introduzca la clave para cifrar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Cerrar ventana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desActionPerformed
        // TODO add your handling code here:
        if (txt_key.getText().length() < 1 || txt_msj.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Campos vacios, por favor introduzca datos", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            if (txt_key.getText().length() > txt_msj.getText().length()) {
            JOptionPane.showMessageDialog(null, "No se puede desencriptar por que la clave es mas grande que el mensaje", "Error", JOptionPane.WARNING_MESSAGE);
         }else{
            txt_msj.setText(vige.desencriptarTextoCifrado(txt_msj.getText(), txt_key.getText().toUpperCase()));
            }
        }      
        
    }//GEN-LAST:event_btn_desActionPerformed

    private void txt_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_keyActionPerformed

    private void btn_cifraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cifraActionPerformed
        if (txt_key.getText().length() < 1 || txt_msj.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Campos vacios, por favor introduzca datos", "Error", JOptionPane.WARNING_MESSAGE);
            }else{
                if (txt_key.getText().length() > txt_msj.getText().length()) {
              JOptionPane.showMessageDialog(null, "No se puede desencriptar por que la clave es mas grande que el mensaje", "Error", JOptionPane.WARNING_MESSAGE);
            }else{
            txt_msj.setText(vige.encriptarTextoClaro(txt_msj.getText().toUpperCase(), txt_key.getText().toUpperCase()));
            }
        }    
    }//GEN-LAST:event_btn_cifraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cifra;
    private javax.swing.JButton btn_des;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextArea txt_msj;
    // End of variables declaration//GEN-END:variables
}
