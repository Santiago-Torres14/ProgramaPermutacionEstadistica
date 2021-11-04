package programapermutacionestadistica;

import javax.swing.JOptionPane;

public class variacion extends javax.swing.JFrame {

    public variacion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Variación");
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
        botonPermutacion = new javax.swing.JButton();
        etiquetaNombrePrograma2 = new javax.swing.JLabel();
        etiquetaNombrePrograma1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoN = new javax.swing.JTextField();
        botonPermutacion1 = new javax.swing.JButton();
        etiquetaNombrePrograma3 = new javax.swing.JLabel();
        etiquetaNombrePrograma4 = new javax.swing.JLabel();
        campoR = new javax.swing.JTextField();
        etiquetaNombrePrograma5 = new javax.swing.JLabel();
        etiquetaNombrePrograma6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPermutacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermutacion.setText("Calcular");
        botonPermutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPermutacionActionPerformed(evt);
            }
        });
        jPanel1.add(botonPermutacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 552, 150, 50));

        etiquetaNombrePrograma2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        etiquetaNombrePrograma2.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombrePrograma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma2.setText("Variación");
        etiquetaNombrePrograma2.setAlignmentY(0.0F);
        etiquetaNombrePrograma2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 16, -1, -1));

        etiquetaNombrePrograma1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombrePrograma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma1.setText("n =");
        etiquetaNombrePrograma1.setAlignmentY(0.0F);
        etiquetaNombrePrograma1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulaVariacion.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 273, -1, -1));
        jPanel1.add(campoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 470, 80, 30));

        botonPermutacion1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermutacion1.setText("Menú Principal");
        botonPermutacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPermutacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPermutacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonPermutacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 552, -1, 50));

        etiquetaNombrePrograma3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etiquetaNombrePrograma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma3.setText("<html>\n<p> <center>En las permutaciones cuando no se utilizan todos los elementos, sino una parte de ellos,</center></p>\n<p> <center>algunos lo denominan como Variaciones, cuya fórmula está dada así:</center></p>\n</html>\n");
        etiquetaNombrePrograma3.setAlignmentY(0.0F);
        etiquetaNombrePrograma3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        etiquetaNombrePrograma3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etiquetaNombrePrograma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        etiquetaNombrePrograma4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombrePrograma4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma4.setText("r =");
        etiquetaNombrePrograma4.setAlignmentY(0.0F);
        etiquetaNombrePrograma4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 510, -1, -1));
        jPanel1.add(campoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 510, 80, 30));

        etiquetaNombrePrograma5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombrePrograma5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma5.setText("n = La cantidad total de elementos");
        etiquetaNombrePrograma5.setAlignmentY(0.0F);
        etiquetaNombrePrograma5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma5, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 396, -1, -1));

        etiquetaNombrePrograma6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombrePrograma6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombrePrograma6.setText("r = La cantidad parcial de elementos necesarios para realizar la variación");
        etiquetaNombrePrograma6.setAlignmentY(0.0F);
        etiquetaNombrePrograma6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiquetaNombrePrograma6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 428, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPermutacionActionPerformed

        try {
            int n, r, factorialn = 1, denominador, factorialdenominador = 1, variacion;
            n = Integer.parseInt(campoN.getText());
            r = Integer.parseInt(campoR.getText());
            for (int i = n; i > 0; i--) {
                factorialn = factorialn * i;
            }

            denominador = n - r;

            for (int i = denominador; i > 0; i--) {
                factorialdenominador = factorialdenominador * i;
            }

            variacion = factorialn / factorialdenominador;

            JOptionPane.showMessageDialog(null, "La variación con los numeros insertados como n= " + n + " y r= " + r + " dan como resultado " + variacion, "Resultado", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un NUMERO para calcular su factorial en el campo de texto", "Error en el valor introducido", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botonPermutacionActionPerformed

    private void botonPermutacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPermutacion1ActionPerformed
        menuPrincipal a = new menuPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPermutacion1ActionPerformed

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
            java.util.logging.Logger.getLogger(variacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(variacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(variacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(variacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new variacion().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPermutacion;
    private javax.swing.JButton botonPermutacion1;
    private javax.swing.JTextField campoN;
    private javax.swing.JTextField campoR;
    private javax.swing.JLabel etiquetaNombrePrograma1;
    private javax.swing.JLabel etiquetaNombrePrograma2;
    private javax.swing.JLabel etiquetaNombrePrograma3;
    private javax.swing.JLabel etiquetaNombrePrograma4;
    private javax.swing.JLabel etiquetaNombrePrograma5;
    private javax.swing.JLabel etiquetaNombrePrograma6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
