
package com.mycompany.gestionbiblioteca;


import GUIBiblioteca.*;

import GuiUsuario.ListaUsuarios;
import GuiUsuario.*;
import GuiUsuario.RegistroUsuario;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        SetDate();
        InitContent();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Principal = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        RegistroL = new javax.swing.JButton();
        Inventario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 640));
        setPreferredSize(new java.awt.Dimension(1020, 640));

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 71, 161));
        menu.setPreferredSize(new java.awt.Dimension(270, 431));

        Principal.setBackground(new java.awt.Color(21, 101, 192));
        Principal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Principal.setForeground(new java.awt.Color(255, 255, 255));
        Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-outline.png"))); // NOI18N
        Principal.setText("Principal");
        Principal.setBorder(null);
        Principal.setBorderPainted(false);
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(21, 101, 192));
        Eliminar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/account-multiple.png"))); // NOI18N
        Eliminar.setText("Usuarios");
        Eliminar.setBorder(null);
        Eliminar.setBorderPainted(false);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.setIconTextGap(15);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(21, 101, 192));
        Registro.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("Registro Usuario");
        Registro.setBorder(null);
        Registro.setBorderPainted(false);
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        RegistroL.setBackground(new java.awt.Color(21, 101, 192));
        RegistroL.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RegistroL.setForeground(new java.awt.Color(255, 255, 255));
        RegistroL.setText("Registro libros");
        RegistroL.setBorder(null);
        RegistroL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroLActionPerformed(evt);
            }
        });

        Inventario.setBackground(new java.awt.Color(21, 101, 191));
        Inventario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Inventario.setForeground(new java.awt.Color(255, 255, 255));
        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book-open-page-variant.png"))); // NOI18N
        Inventario.setText("Libros");
        Inventario.setBorder(null);
        Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventario.setIconTextGap(15);
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(RegistroL, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(RegistroL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        head.setBackground(new java.awt.Color(25, 118, 210));
        head.setPreferredSize(new java.awt.Dimension(750, 150));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DE BIBLIOTECA");

        dateText.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setText("Hoy es 00 de 00  de 00");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(dateText)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(750, 430));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent() {
        ShowJPanel(new Principal());
    }
    
    public void ShowJPanel(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        // TODO add your handling code here:
       // Registro registro = new Registro();
       // registro.setVisible(true);
       ShowJPanel(new RegistroUsuario());
    }//GEN-LAST:event_RegistroActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
      //  EliminarUsuario eliminar = new EliminarUsuario();
      //  eliminar.setVisible(true);
        ShowJPanel(new ListaUsuarios());
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegistroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroLActionPerformed
        // TODO add your handling code here:
       // Biblioteca1 biblioteca = new Biblioteca1();
       // biblioteca.setVisible(true);
        ShowJPanel(new RegistroLibro());
    }//GEN-LAST:event_RegistroLActionPerformed

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        // TODO add your handling code here:
     //   ConsultarLibro consultar = new ConsultarLibro();
      //  consultar.setVisible(true);
        ShowJPanel(new ListaLibros());
    }//GEN-LAST:event_InventarioActionPerformed

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Principal());
    }//GEN-LAST:event_PrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatLightFlatIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Inventario;
    private javax.swing.JButton Principal;
    private javax.swing.JButton Registro;
    private javax.swing.JButton RegistroL;
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
