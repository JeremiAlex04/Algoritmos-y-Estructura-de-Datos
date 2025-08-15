package PILAS;

import javax.swing.JOptionPane;

/**
 *
 * @author RAT
 */
public class Principal_Pilas extends javax.swing.JFrame {

    //Variable global
    int Cima;
    int tamaño;
    //Creación de objeto
    Pila P;

    public Principal_Pilas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //PROCEDIMIENTOS
    void Mostrar() {
        //Limpiando el TextArea
        jTxtA_PILA.setText("");
        //Cargar el TextArea
        for (int i = P.vectorPila.length - 1; i >= 0; i--) {
            jTxtA_PILA.append( P.vectorPila[i] + "\n");
        }
    }

    void VaciarPila() {
        for (int i = 0; i < P.vectorPila.length; i++) {
            P.vectorPila[i] = 0;
        }
        Cima = -1;
    }

    //FUNCIONES
    int UbicacionCima() {
        return Cima;
    }

    int Eliminar() {
        int elemento = P.vectorPila[Cima];
        P.vectorPila[Cima] = 0;
        Cima--;
        return elemento;
    }

    boolean EstaVacia() {
        return Cima == -1;
    }

    boolean EstaLlena() {
        return Cima == (P.vectorPila.length - 1);
    }

    int ValorCima() {
        return P.vectorPila[Cima];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblTamaño = new javax.swing.JLabel();
        jBtnConstruir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_PILA = new javax.swing.JTextArea();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnPOS_Cima = new javax.swing.JButton();
        jBtnVAL_Cima = new javax.swing.JButton();
        jBtnVaciar = new javax.swing.JButton();
        jLblVacia = new javax.swing.JLabel();
        jLblLlena = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UTP - PILAS");

        jLblTamaño.setText("Tamaño:");

        jBtnConstruir.setText("Construir Pila");
        jBtnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConstruirActionPerformed(evt);
            }
        });

        jTxtA_PILA.setColumns(20);
        jTxtA_PILA.setRows(5);
        jScrollPane1.setViewportView(jTxtA_PILA);

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.setToolTipText("");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnPOS_Cima.setText("Posicion Cima");
        jBtnPOS_Cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPOS_CimaActionPerformed(evt);
            }
        });

        jBtnVAL_Cima.setText("Valor Cima");
        jBtnVAL_Cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVAL_CimaActionPerformed(evt);
            }
        });

        jBtnVaciar.setText("Vaciar PILA");
        jBtnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVaciarActionPerformed(evt);
            }
        });

        jLblVacia.setText("¿Vacia?");
        jLblVacia.setToolTipText("Dale Click para saber la respuesta");
        jLblVacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblVaciaMouseClicked(evt);
            }
        });

        jLblLlena.setText("¿Llena?");
        jLblLlena.setToolTipText("Dale Click para saber la respuesta");
        jLblLlena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblLlenaMouseClicked(evt);
            }
        });

        jButton1.setText("¿Esta llena?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("¿ Esta Vacia ?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLblTamaño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnVAL_Cima, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jBtnConstruir, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLblVacia)
                                .addComponent(jLblLlena, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jBtnPOS_Cima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jBtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jBtnVaciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jBtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblVacia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jBtnConstruir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblLlena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jBtnPOS_Cima)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnVAL_Cima)
                    .addComponent(jLblTamaño))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConstruirActionPerformed

        tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el tamaño de la PILA:"));
        P = new Pila(tamaño);
        jLblTamaño.setText("Tamaño: " + tamaño);
        Mostrar();
    }//GEN-LAST:event_jBtnConstruirActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed

        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
        P.Agregar(valor);
        Mostrar();


    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnPOS_CimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPOS_CimaActionPerformed
        JOptionPane.showMessageDialog(null, "Posicion de la Cima " + P.UbicacionCima());
    }//GEN-LAST:event_jBtnPOS_CimaActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        //Eliminar
        P.Eliminar();
        Mostrar();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jLblVaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVaciaMouseClicked
        if (P.EstaVacia() == true) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("No esta vacia");
            System.out.println("Hay" + (P.UbicacionCima() + 1) + "Elementos en la pila");
        }

    }//GEN-LAST:event_jLblVaciaMouseClicked

    private void jLblLlenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLlenaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLblLlenaMouseClicked

    private void jBtnVAL_CimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVAL_CimaActionPerformed
        //Valor de la Cima
        JOptionPane.showMessageDialog(null, "Valor de la cima: " + P.ValorCima());


    }//GEN-LAST:event_jBtnVAL_CimaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Pregunta la ¿La pila esta vacia? Si - No
        if (P != null) {
            if (P.EstaVacia()) {
                JOptionPane.showMessageDialog(null, "La pila esta vacia");

            } else {
                JOptionPane.showMessageDialog(null, "La pila no esta vacia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay construccion de Pila");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pregunta la Pila esta llena ¿Esta Llena?
        /*
        try {
            if (P.EstaLlena()) {
                JOptionPane.showMessageDialog(null, "La pila esta llena");
            } else {
                JOptionPane.showMessageDialog(null, "La pila no esta llena");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay construccion de Pila");
        }
         */

        if (P != null) {
            if (P.EstaLlena()) {
                JOptionPane.showMessageDialog(null, "La pila esta llena");
            } else {
                JOptionPane.showMessageDialog(null, "La pila no esta llena");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay construccion de Pila");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVaciarActionPerformed
        //Vaciar la Pila
        P.VaciarPila();
        Mostrar();

    }//GEN-LAST:event_jBtnVaciarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Pilas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnConstruir;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnPOS_Cima;
    private javax.swing.JButton jBtnVAL_Cima;
    private javax.swing.JButton jBtnVaciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLblLlena;
    private javax.swing.JLabel jLblTamaño;
    private javax.swing.JLabel jLblVacia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_PILA;
    // End of variables declaration//GEN-END:variables
}
