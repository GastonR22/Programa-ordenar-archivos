
package interfazGrafica;

import javax.swing.JOptionPane;
import logica.Ordenar;

public class PantallaPrincipal extends javax.swing.JFrame {
    
    public PantallaPrincipal() {
        initComponents();
        inciar();
    }

    public final void inciar(){
        setLocationRelativeTo(null);
        setTitle("Organizador de archivos");
        JOptionPane.showMessageDialog(null, "Bienvenido, para el correcto funcionamiento del programa debe especificar la ruta de una carpeta, y se organizaran los archivos dentro de la misma");
        JOptionPane.showMessageDialog(null, "Ademas deberá marcar los checkbox para que el programa sepa que carpetas desea crear para guardar los archivos");
        JOptionPane.showMessageDialog(null, "En algunos casos es posible que se deban que dar permisos del antivirus ya que estamos moviendo archivos y esto puede ser detectado como un malware");
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
        txtIngresarPath = new javax.swing.JTextField();
        chkbox_texto = new javax.swing.JCheckBox();
        chkbox_imagen = new javax.swing.JCheckBox();
        chkbox_video = new javax.swing.JCheckBox();
        chkbox_ejecucion = new javax.swing.JCheckBox();
        chkbox_audio = new javax.swing.JCheckBox();
        chkbox_comprimido = new javax.swing.JCheckBox();
        btn_ordenarCarpeta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIngresarPath.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txtIngresarPath.setText("Ejemplo : C:\\Users\\Christian\\Desktop\\carpetaEjemplo");
        txtIngresarPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarPathActionPerformed(evt);
            }
        });

        chkbox_texto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_texto.setText("Texto");
        chkbox_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_textoActionPerformed(evt);
            }
        });

        chkbox_imagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_imagen.setText("Imagen");
        chkbox_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_imagenActionPerformed(evt);
            }
        });

        chkbox_video.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_video.setText("Video");
        chkbox_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_videoActionPerformed(evt);
            }
        });

        chkbox_ejecucion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_ejecucion.setText("Ejecución");
        chkbox_ejecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_ejecucionActionPerformed(evt);
            }
        });

        chkbox_audio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_audio.setText("Audio");
        chkbox_audio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_audioActionPerformed(evt);
            }
        });

        chkbox_comprimido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkbox_comprimido.setText("Comprimidos");
        chkbox_comprimido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_comprimidoActionPerformed(evt);
            }
        });

        btn_ordenarCarpeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ordenarCarpeta.setText("Ordenar carpeta");
        btn_ordenarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarCarpetaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Ruta de la carpeta que desea ordenar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Carpetas que desea crear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkbox_texto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbox_audio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbox_video, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkbox_comprimido)
                            .addComponent(chkbox_ejecucion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbox_imagen, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btn_ordenarCarpeta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtIngresarPath, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIngresarPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbox_texto)
                    .addComponent(chkbox_imagen))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbox_video)
                    .addComponent(chkbox_ejecucion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbox_audio)
                    .addComponent(chkbox_comprimido))
                .addGap(32, 32, 32)
                .addComponent(btn_ordenarCarpeta)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarPathActionPerformed
        
    }//GEN-LAST:event_txtIngresarPathActionPerformed

    private void chkbox_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_textoActionPerformed

    private void chkbox_comprimidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_comprimidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_comprimidoActionPerformed

    private void chkbox_ejecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_ejecucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_ejecucionActionPerformed

    private void btn_ordenarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarCarpetaActionPerformed
        boolean texto, video, audio, imagen, ejecucion, comprimido;
        texto = chkbox_texto.isSelected();
        video = chkbox_video.isSelected();
        audio = chkbox_audio.isSelected();
        imagen = chkbox_imagen.isSelected();
        ejecucion = chkbox_ejecucion.isSelected();
        comprimido = chkbox_comprimido.isSelected();
        String path = txtIngresarPath.getText();

        //Condicion para evitar el campo vacio en el text field
        if (path.equals("") || path.equals("Ejemplo : C:\\Users\\Christian\\Desktop\\carpetaEjemplo")) {
            JOptionPane.showMessageDialog(null, "Error, la ruta de la carpeta no puede estar vacía o con el texto por defecto, por favor inténtelo nuevamente");
        } else {

            try {
                Ordenar ordenar = new Ordenar(path, texto, video, audio, imagen, ejecucion, comprimido);
                ordenar.crearCarpetas();
                ordenar.listarArchivosFiltro();
                ordenar.extraerExtension();
                JOptionPane.showMessageDialog(null, "Archivos ordenados exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al tratar de ordenar los archivos, por favor verifique que la ruta de la carpeta este escrita correctamente");
            }
        }


    }//GEN-LAST:event_btn_ordenarCarpetaActionPerformed

    private void chkbox_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_imagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_imagenActionPerformed

    private void chkbox_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_videoActionPerformed

    private void chkbox_audioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_audioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox_audioActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ordenarCarpeta;
    public javax.swing.JCheckBox chkbox_audio;
    public javax.swing.JCheckBox chkbox_comprimido;
    public javax.swing.JCheckBox chkbox_ejecucion;
    public javax.swing.JCheckBox chkbox_imagen;
    public javax.swing.JCheckBox chkbox_texto;
    public javax.swing.JCheckBox chkbox_video;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtIngresarPath;
    // End of variables declaration//GEN-END:variables
}
