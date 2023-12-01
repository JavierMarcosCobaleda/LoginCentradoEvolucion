/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logincentrado;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class LoginCentradoEvolucion extends javax.swing.JFrame {
    int xMouse,yMouse;
    /**
     * Creates new form LoginCentrado
     */
    public LoginCentradoEvolucion() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelFondo = new javax.swing.JPanel();
        panelDesplazar = new javax.swing.JPanel();
        xSalir = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfpassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        entrar = new javax.swing.JPanel();
        labelAcceder = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(0, 102, 255));
        panelFondo.setLayout(new java.awt.GridBagLayout());

        panelDesplazar.setBackground(new java.awt.Color(255, 255, 255));
        panelDesplazar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDesplazarMouseDragged(evt);
            }
        });
        panelDesplazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDesplazarMousePressed(evt);
            }
        });

        xSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xSalir.setText("X");
        xSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDesplazarLayout = new javax.swing.GroupLayout(panelDesplazar);
        panelDesplazar.setLayout(panelDesplazarLayout);
        panelDesplazarLayout.setHorizontalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesplazarLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(xSalir)
                .addContainerGap())
        );
        panelDesplazarLayout.setVerticalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesplazarLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(xSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 110, 0, 0);
        panelFondo.add(panelDesplazar, gridBagConstraints);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setPreferredSize(new java.awt.Dimension(350, 390));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        tfusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfusuario.setForeground(new java.awt.Color(153, 153, 153));
        tfusuario.setText("mail@gmail.com");
        tfusuario.setToolTipText("");
        tfusuario.setBorder(null);
        tfusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfusuarioMousePressed(evt);
            }
        });
        panelLogin.add(tfusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        tfpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfpassword.setForeground(new java.awt.Color(153, 153, 153));
        tfpassword.setText("********");
        tfpassword.setBorder(null);
        tfpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfpasswordMousePressed(evt);
            }
        });
        panelLogin.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, -1));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 10));

        entrar.setBackground(new java.awt.Color(153, 153, 153));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });

        labelAcceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAcceder.setForeground(new java.awt.Color(255, 255, 255));
        labelAcceder.setText("ACCEDER");
        entrar.add(labelAcceder);

        panelLogin.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.login-2.png"))); // NOI18N
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 32, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 106, 0, 106);
        panelFondo.add(panelLogin, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusuarioMousePressed
        if(tfusuario.getText().equals("mail@gmail.com")){
            tfusuario.setText("");
            tfusuario.setForeground(Color.black);
        }

        if(String.valueOf(tfpassword.getPassword()).isEmpty()){
            tfpassword.setText("********");
            tfpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfusuarioMousePressed

    private void tfpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfpasswordMousePressed
        if(String.valueOf(tfpassword.getPassword()).equals("********")){
            tfpassword.setText("");
            tfpassword.setForeground(Color.black);
        }

        if(tfusuario.getText().isEmpty()){
            tfusuario.setText("mail@gmail.com");
            tfusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfpasswordMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        if(tfusuario.getText().equals("mail@gmail.com")){
            JOptionPane.showMessageDialog(null, "debes introducir un usuario", "Error", JOptionPane.WARNING_MESSAGE);
        }

        else if(String.valueOf(tfpassword.getPassword()).equals("********")){
            JOptionPane.showMessageDialog(null, "debes introducir un password", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_entrarMouseClicked

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        entrar.setBackground(Color.red);
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
        entrar.setBackground(Color.gray);
    }//GEN-LAST:event_entrarMouseExited

    private void xSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xSalirMouseClicked

    private void panelDesplazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_panelDesplazarMousePressed

    private void panelDesplazarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xMouse,y-yMouse);        // TODO add your handling code here:
    }//GEN-LAST:event_panelDesplazarMouseDragged

    private void xSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xSalirMouseEntered
        xSalir.setForeground(Color.red);
    }//GEN-LAST:event_xSalirMouseEntered

    private void xSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xSalirMouseExited
        xSalir.setForeground(Color.black);
    }//GEN-LAST:event_xSalirMouseExited

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
            java.util.logging.Logger.getLogger(LoginCentradoEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCentradoEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCentradoEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCentradoEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCentradoEvolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAcceder;
    private javax.swing.JPanel panelDesplazar;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField tfusuario;
    private javax.swing.JLabel xSalir;
    // End of variables declaration//GEN-END:variables
}
