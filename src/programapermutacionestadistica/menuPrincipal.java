package programapermutacionestadistica;

public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form programaPermutacionEstadistica
     */
    public menuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Principal");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonPermutacion = new javax.swing.JButton();
        etiquetaNombrePrograma = new javax.swing.JLabel();
        etiquetaNombrePrograma2 = new javax.swing.JLabel();
        etiquetaNombrePrograma1 = new javax.swing.JLabel();
        botonPermutacion1 = new javax.swing.JButton();
        botonPermutacion2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPermutacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermutacion.setText("Permutación");
        botonPermutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPermutacionActionPerformed(evt);
            }
        });
        jPanel1.add(botonPermutacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 50));

        etiquetaNombrePrograma.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etiquetaNombrePrograma.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombrePrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma.setText("Permutación, Variacion y Permutación con Repeticion");
        etiquetaNombrePrograma.setAlignmentY(0.0F);
        etiquetaNombrePrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));
        etiquetaNombrePrograma.getAccessibleContext().setAccessibleDescription("");

        etiquetaNombrePrograma2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        etiquetaNombrePrograma2.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombrePrograma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma2.setText("Técnicas de conteo");
        etiquetaNombrePrograma2.setAlignmentY(0.0F);
        etiquetaNombrePrograma2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 11, -1, -1));

        etiquetaNombrePrograma1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombrePrograma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma1.setText("Bienvenido, por favor seleccione la técnica de conteo que desea realizar:");
        etiquetaNombrePrograma1.setAlignmentY(0.0F);
        etiquetaNombrePrograma1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 199, -1, -1));

        botonPermutacion1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermutacion1.setText("Variación");
        botonPermutacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPermutacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPermutacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonPermutacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, 50));

        botonPermutacion2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermutacion2.setText("Permutación Con Repetición");
        botonPermutacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPermutacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPermutacion2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonPermutacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 50));

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

    private void botonPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPermutacionActionPerformed
        permutacion a = new permutacion();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPermutacionActionPerformed

    private void botonPermutacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPermutacion1ActionPerformed
        variacion a = new variacion();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPermutacion1ActionPerformed

    private void botonPermutacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPermutacion2ActionPerformed
        permutacionConRepeticion a = new permutacionConRepeticion();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPermutacion2ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPermutacion;
    private javax.swing.JButton botonPermutacion1;
    private javax.swing.JButton botonPermutacion2;
    private javax.swing.JLabel etiquetaNombrePrograma;
    private javax.swing.JLabel etiquetaNombrePrograma1;
    private javax.swing.JLabel etiquetaNombrePrograma2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
