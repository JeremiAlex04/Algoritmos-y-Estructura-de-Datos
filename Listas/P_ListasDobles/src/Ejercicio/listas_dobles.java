/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeremi Alexander
 */
public class listas_dobles extends javax.swing.JFrame {

    /**
     * Creates new form listas_dobles
     */
    //Declaracion del formato de la tabla
    DefaultTableModel miModelo;
    String[] cabecera = {"Nº", "Codigo", "Nombres", "Apellidos", "Sexo", "Sueldo"};
    String[][] data = {};

    //Declaracion de variables locales
    public Nodo ini, fin;
    public Nodo pFound;
    int num = 0;

    public listas_dobles() {
        initComponents();

        //Inicializando los punteros
        ini = fin = pFound = null;

        //Habilitando los encabezados de la tabla
        miModelo = new DefaultTableModel(data, cabecera);
        tblRegistros.setModel(miModelo);

    }

    @SuppressWarnings("unchecked")
    Nodo Buscar(Nodo inicio, String cod) {
        Nodo pos = inicio;
        //Recorriendo la lista para encontrar la informacion
        while (pos != null && !cod.equalsIgnoreCase(pos.codigo)) {
            pos = pos.sig;

        }

        return pos;
    }

    Nodo InsetarFinal(Nodo inicio, String cod, String nom, String ape, String sex, float suel) {
        Nodo nuevo = new Nodo(cod, nom, ape, sex, suel);

        //Realizando los enlaces correspondientes
        nuevo.sig = inicio;
        if (inicio == null) {
            fin = nuevo;
            fin.sig = null;
        }
        if (inicio != null) {
            inicio.ant = nuevo;
        }
        inicio = nuevo;
        return inicio;
    }

    void Eliminar() {
        Nodo actual;
        boolean encontrado = false;
        actual = ini;

        //Bucle de busqueda
        while ((actual != null) && (!encontrado)) {
            encontrado = actual.codigo.equalsIgnoreCase(txtCodigo.getText().trim());
            if (!encontrado) {
                actual = actual.sig;
            }
        }

        //Realizando los enlaces
        if (actual != null) {
            if (actual == ini) {
                ini = actual.sig; //Borrar el primero
                if (actual.sig != null) {
                    actual.sig.ant = null;
                }
            } else if (actual.sig != null) { //No es el ultimo 
                actual.ant.sig = actual.sig;
                actual.sig.ant = actual.ant;
            } else {
                actual.ant.sig = null; //el ultimo
                fin = actual.ant; //movimiento el final
            }
            actual = null;

        }
    }

    void Resumen() {
        Nodo aux = ini;
        String nom = "", acum = "";
        float suma = 0, mayor = -9999;
        float s;

        //Recorriendo la lista
        while (aux != null) {
            s = aux.sueldo;
            if (s > mayor) {
                mayor = s;
                nom = aux.nombre + " " + aux.apellido;
            }
            suma = suma + s;
            aux = aux.sig;
        }

        //Colocando la informacion en los objetivos
        txtNomMay.setText(nom);

        //Dandole formato al acumulado
        DecimalFormat df2 = new DecimalFormat("####.00");
        acum = df2.format(suma);
        txtAcumulado.setText(acum);
    }

    void Habilitar() {
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    void Deshabilitar() {
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }

    void LimpiarEntradas() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
        txtApellidos.setText("");
        cbxSexo.setSelectedIndex(0);
        txtCodigo.requestFocus();
    }

    void vaciar_tabla() {
        //Obeteniendo el numero de filas de la tabla

        int filas = tblRegistros.getRowCount();
        for (int i = 0; i < filas; i++) {
            miModelo.removeRow(0);
        }

    }

    void VerDatos(int ind) {
        //Variable para recorrer la tabla
        String cod, nom, ape, se, su;
        float s;
        switch (ind) {
            case 1: {
                vaciar_tabla();
                Nodo aux = ini;
                num = 0;
                while (aux != null) {
                    cod = aux.codigo;
                    nom = aux.nombre;
                    ape = aux.apellido;
                    se = aux.sexo;

                    //Dando formato al sueldo
                    DecimalFormat df2 = new DecimalFormat("####.00");
                    su = df2.format(aux.sueldo);
                    num++;
                    Object[] fila = {num, cod, nom, ape, se, su};
                    miModelo.addRow(fila);
                    aux = aux.sig;
                }
            }
            break;
            case 2: {
                vaciar_tabla();
                Nodo aux = fin;
                num = 0;
                while (aux != null) {
                    cod = aux.codigo;
                    nom = aux.nombre;
                    ape = aux.apellido;
                    se = aux.sexo;

                    //Dando formato al sueldo
                    DecimalFormat df2 = new DecimalFormat("####.00");
                    su = df2.format(aux.sueldo);
                    num++;
                    Object[] fila = {num, cod, nom, ape, se, su};
                    miModelo.addRow(fila);
                    aux = aux.ant;
                }
            }
            break;

        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btn_AdelanteAtras = new javax.swing.JButton();
        btn_AtrasAdelante = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtNomMay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        jLabel2.setText("CODIGO:");

        jLabel3.setText("SEXO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("APELLIDOS:");

        jLabel6.setText("SUELDO:");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btn_AdelanteAtras.setText("ADELANTE - ATRAS");
        btn_AdelanteAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdelanteAtrasActionPerformed(evt);
            }
        });

        btn_AtrasAdelante.setText("ATRAS - ADELANTE");
        btn_AtrasAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasAdelanteActionPerformed(evt);
            }
        });

        jButton5.setText("RESTAURAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton8.setText("SALIR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistros);

        jLabel7.setText("EMPLEADO CON EL MAYOR SUELDO");

        jLabel8.setText("MONTO DE SUELDOS ACUMULADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_AdelanteAtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_AtrasAdelante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNomMay, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 75, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAcumulado)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AdelanteAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AtrasAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String cod = txtCodigo.getText();
        String nom = txtNombre.getText().toUpperCase();
        String ape = txtApellidos.getText().toUpperCase();
        String sex = cbxSexo.getSelectedItem().toString();
        String suel = txtSueldo.getText();

        //Creando el nodo de la lista en memoria y colocando la informacion
        ini = InsetarFinal(ini, cod, nom, ape, sex, Float.parseFloat(suel));
        LimpiarEntradas();
        VerDatos(1);
        Resumen();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btn_AtrasAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasAdelanteActionPerformed
        // TODO add your handling code here:
        VerDatos(2);
    }//GEN-LAST:event_btn_AtrasAdelanteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LimpiarEntradas();
        Deshabilitar();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        pFound.codigo = txtCodigo.getText();
        pFound.nombre = txtNombre.getText().toUpperCase();
        pFound.apellido = txtApellidos.getText().toUpperCase();
        pFound.sexo = cbxSexo.getSelectedItem().toString();
        pFound.sueldo = Float.parseFloat(txtSueldo.getText());

        LimpiarEntradas();
        Deshabilitar();
        VerDatos(1);
        Resumen();


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        
        Eliminar();
        LimpiarEntradas();
        VerDatos(1);
        
        if (ini == null) {
            JOptionPane.showMessageDialog(this, "La Lista esta vacia");
            Deshabilitar();
            Resumen();
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String cod = txtCodigo.getText();
        if (cod.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo por favor");
        } else {
            //Llamada a la funcion que retorna la posicion del dato buscado
            pFound = Buscar(ini, cod);
            //Verficando el puntero pFound para mostar la inf. buscada

            if (pFound != null) {
                txtNombre.setText(pFound.nombre);
                txtApellidos.setText(pFound.apellido);
                if (pFound.sexo.equalsIgnoreCase("MASCULINO")) {
                    cbxSexo.setSelectedItem(2);
                } else {
                    cbxSexo.setSelectedIndex(1);
                }
                txtSueldo.setText(String.valueOf(pFound.sueldo));
                //Habilitamos los objetos para eliminar y actualizar
                Habilitar();

            } else {
                JOptionPane.showMessageDialog(this, "El codigo: " + cod + ", no esta en la lista...");
            }

        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btn_AdelanteAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdelanteAtrasActionPerformed
        // TODO add your handling code here:
        
        VerDatos(1);
    }//GEN-LAST:event_btn_AdelanteAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(listas_dobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listas_dobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listas_dobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listas_dobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listas_dobles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_AdelanteAtras;
    private javax.swing.JButton btn_AtrasAdelante;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomMay;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
