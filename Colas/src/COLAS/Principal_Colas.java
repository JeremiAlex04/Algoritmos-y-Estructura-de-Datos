/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COLAS;

import javax.swing.JOptionPane;

/**
 *
 * @author RAT
 */
public class Principal_Colas extends javax.swing.JFrame {

    //Variable global
    int tamaño, fin, inicio;
    //Creación de objeto
    Cola C;

    public Principal_Colas() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    //Metodos y funciones para aplicar en los botones
    //Procedimiento para agregar
    void agregar(int dato) {

        if (!estaLlenaCola()) {
            fin++;//fin=fin+1
            inicio = 0;
            C.VectorCola[fin] = dato;
        } else {
            JOptionPane.showMessageDialog(this, "La cola esta llena");
        }

    }

    //Procemiento para mostar
    void Mostrar() {
        //Limpiando el TextArea
        jTxtA_PILA.setText("");
        //Cargar el TextArea

        for (int i = 0; i < C.VectorCola.length; i++) {

            if (i > C.fin) {
                jTxtA_PILA.append(" | " + "0" + " | ");
            } else {
                jTxtA_PILA.append(" | " + C.VectorCola[i] + " | ");
            }

        }

    }

    //Funcion para determinar si la cola esta llena
    boolean estaLlenaCola() {
        if (fin == tamaño - 1) {
            return true;
        } else {
            return false;
        }
    }

    //Funcion para determinar si la cola esta vacia
    boolean estaVaciaCola() {
        if (fin == -1 && inicio == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Funcion para eliminar
    int eliminar() {

        int elemento = C.VectorCola[0];

        for (int i = 0; i < fin; i++) {
            C.VectorCola[i] = C.VectorCola[i + 1];

        }

       

        fin--;//fin=fin-1

        if (fin == -1) {
            inicio = -1;
        }

        return elemento;
    }

    //Funcion de cantidad de datos en cola
    int EnCola() {
        return fin + 1;
    }

    //Procedimieto vaciar la cola
    void VaciarCola() {

        for (int i = 0; i < tamaño; i++) {
            C.VectorCola[i] = 0;
        }
        C.inicio = -1;
        C.fin = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblTamaño = new javax.swing.JLabel();
        jBtnConstruir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_PILA = new javax.swing.JTextArea();
        btn_Agregar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_posDato = new javax.swing.JButton();
        jBtnVAL_Cola = new javax.swing.JButton();
        BtnVaciar = new javax.swing.JButton();
        jLblVacia = new javax.swing.JLabel();
        jLblLlena = new javax.swing.JLabel();
        btn_Estallena = new javax.swing.JButton();
        jBtnVAL_Cima2 = new javax.swing.JButton();
        btn_posInicio = new javax.swing.JButton();
        btn_ValorInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Olivares Chavez Jeremi]");
        setMinimumSize(new java.awt.Dimension(285, 273));

        jLblTamaño.setText("Tamaño:");

        jBtnConstruir.setText("Construir Cola");
        jBtnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConstruirActionPerformed(evt);
            }
        });

        jTxtA_PILA.setColumns(20);
        jTxtA_PILA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTxtA_PILA.setRows(5);
        jScrollPane1.setViewportView(jTxtA_PILA);

        btn_Agregar.setText("Agregar");
        btn_Agregar.setToolTipText("");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_posDato.setText("Posicion Fin");
        btn_posDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posDatoActionPerformed(evt);
            }
        });

        jBtnVAL_Cola.setText("Cant. datos en Cola");
        jBtnVAL_Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVAL_ColaActionPerformed(evt);
            }
        });

        BtnVaciar.setText("Vaciar Cola");
        BtnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVaciarActionPerformed(evt);
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

        btn_Estallena.setText("¿Esta llena?");
        btn_Estallena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstallenaActionPerformed(evt);
            }
        });

        jBtnVAL_Cima2.setText("¿Esta Vacia?");
        jBtnVAL_Cima2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVAL_Cima2ActionPerformed(evt);
            }
        });

        btn_posInicio.setText("Posicion Inicio");
        btn_posInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posInicioActionPerformed(evt);
            }
        });

        btn_ValorInicio.setText("Valor Inicio");
        btn_ValorInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ValorInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLblTamaño)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jBtnConstruir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_posInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(btn_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_posDato, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BtnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtnVAL_Cola, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLblLlena)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_Estallena, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtnVAL_Cima2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_ValorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLblVacia)))
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBtnConstruir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Agregar)
                            .addComponent(btn_Eliminar)
                            .addComponent(BtnVaciar))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLblLlena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Estallena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVAL_Cima2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_posDato)
                    .addComponent(jBtnVAL_Cola)
                    .addComponent(btn_posInicio)
                    .addComponent(btn_ValorInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblTamaño)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConstruirActionPerformed

        tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el tamaño de la COLA:"));
        C = new Cola(tamaño);
        jLblTamaño.setText("Tamaño: " + tamaño);
        Mostrar();
    }//GEN-LAST:event_jBtnConstruirActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa datos"));
        C.agregar(dato);
        Mostrar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_posDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_posDatoActionPerformed
        JOptionPane.showMessageDialog(this, "Posicion de fin: " + C.fin);
        Mostrar();
    }//GEN-LAST:event_btn_posDatoActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        C.eliminar();
        Mostrar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void jLblVaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVaciaMouseClicked


    }//GEN-LAST:event_jLblVaciaMouseClicked

    private void btn_EstallenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstallenaActionPerformed
        //Preguntar si esta llena

        if (C.estaLlenaCola() == true) {
            JOptionPane.showMessageDialog(this, "La Cola esta llena");
        }
        if (C.estaLlenaCola() == false) {
            JOptionPane.showMessageDialog(this, "La Cola no esta llena");
        }


    }//GEN-LAST:event_btn_EstallenaActionPerformed

    private void jBtnVAL_Cima2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVAL_Cima2ActionPerformed
        //Preguntar si esta vacia

        if (C.estaVaciaCola() == true) {
            JOptionPane.showMessageDialog(this, "La Cola esta vacia");
        }
        if (C.estaVaciaCola() == false) {
            JOptionPane.showMessageDialog(this, "La Cola no esta vacia");
        }


    }//GEN-LAST:event_jBtnVAL_Cima2ActionPerformed

    private void jBtnVAL_ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVAL_ColaActionPerformed
        JOptionPane.showMessageDialog(this, "Cantida de datos en Cola: " + C.EnCola());
    }//GEN-LAST:event_jBtnVAL_ColaActionPerformed

    private void BtnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVaciarActionPerformed

        //Vaciar
        VaciarCola();
        Mostrar();


    }//GEN-LAST:event_BtnVaciarActionPerformed

    private void btn_posInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_posInicioActionPerformed
        //Posicion Inicial
        JOptionPane.showMessageDialog(this, "Posicion de inicio: " + C.inicio);
        Mostrar();
    }//GEN-LAST:event_btn_posInicioActionPerformed

    private void btn_ValorInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ValorInicioActionPerformed
        // TODO add your handling code here:
        //Mostar el valor de Inicio
        if (C.inicio == 0) {
            JOptionPane.showMessageDialog(null, "Valor de Inicio: " + C.VectorCola[C.inicio]);
        }

    }//GEN-LAST:event_btn_ValorInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Colas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVaciar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Estallena;
    private javax.swing.JButton btn_ValorInicio;
    private javax.swing.JButton btn_posDato;
    private javax.swing.JButton btn_posInicio;
    private javax.swing.JButton jBtnConstruir;
    private javax.swing.JButton jBtnVAL_Cima2;
    private javax.swing.JButton jBtnVAL_Cola;
    private javax.swing.JLabel jLblLlena;
    private javax.swing.JLabel jLblTamaño;
    private javax.swing.JLabel jLblVacia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_PILA;
    // End of variables declaration//GEN-END:variables
}
