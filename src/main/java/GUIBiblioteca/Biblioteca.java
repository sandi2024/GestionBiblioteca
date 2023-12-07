
package GUIBiblioteca;


import GestionLibros.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Biblioteca extends javax.swing.JPanel {

    MetodosB biblioteca = new MetodosB();
    private Object frame;
    
    public Biblioteca() {
        initComponents();
        
    }

    public Biblioteca(MetodosB gestionLibros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldFolio = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEdicion = new javax.swing.JTextField();
        jTextFieldIsbn = new javax.swing.JTextField();
        jButtonFisico = new javax.swing.JButton();
        jButtonDigital = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Folio:");

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Edicion:");

        jLabel5.setText("ISBN:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextFieldFolio.setText("jTextField1");

        jTextFieldTitulo.setText("jTextField2");

        jTextFieldAutor.setText("jTextField3");

        jTextFieldEdicion.setText("jTextField4");

        jTextFieldIsbn.setText("jTextField5");

        jButtonFisico.setText("Agregar Libro Fisico");
        jButtonFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFisicoActionPerformed(evt);
            }
        });

        jButtonDigital.setText("Agregar Libro Digital");
        jButtonDigital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jTextFieldTitulo)
                            .addComponent(jTextFieldAutor)
                            .addComponent(jTextFieldEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFisico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDigital, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonFisico)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigital))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFisicoActionPerformed
        // TODO add your handling code here:
        String folio = jTextFieldFolio.getText();
        String titulo = jTextFieldTitulo.getText();
        String autor = jTextFieldAutor.getText();
        String edicion = jTextFieldEdicion.getText();
        String isbn = jTextFieldIsbn.getText();
        int numeroCopias = Integer.parseInt(JOptionPane.showInputDialog(frame, "Número de copias:"));
        
        int number1 = Integer.parseInt(edicion);
        LibroFisico libroFisico = new LibroFisico(folio, titulo, autor, number1, isbn, numeroCopias);
        biblioteca.registrarLibro(libroFisico);
        biblioteca.guardarLibros(libroFisico);
 //       mostrarLibros(jTextArea1);
    }//GEN-LAST:event_jButtonFisicoActionPerformed

    private void jButtonDigitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDigitalActionPerformed
        // TODO add your handling code here:
        String folio = jTextFieldFolio.getText();
        String titulo = jTextFieldTitulo.getText();
        String autor = jTextFieldAutor.getText();
        String edicion = jTextFieldEdicion.getText();
        String isbn = jTextFieldIsbn.getText();
        String formato = JOptionPane.showInputDialog(frame, "Formato:");
        
        int number2 = Integer.parseInt(edicion);
        
        LibroDigital libroDigital = new LibroDigital(folio, titulo, autor, number2, isbn, formato);
        biblioteca.registrarLibro(libroDigital);
        biblioteca.guardarLibros(libroDigital);
  //      mostrarLibros(jTextArea1);
    }//GEN-LAST:event_jButtonDigitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDigital;
    private javax.swing.JButton jButtonFisico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldEdicion;
    private javax.swing.JTextField jTextFieldFolio;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
//    public static void mostrarLibros(JTextArea textArea) {
//        textArea.setText("");
 //       biblioteca.getLibros().forEach(libro -> {
  //          textArea.append(libro.toString() + "\n");
 //       });
 //   }

}

