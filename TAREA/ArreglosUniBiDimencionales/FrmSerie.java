package TAREA.ArreglosUniBiDimencionales;
/*
Formulario 1: Diseñe un programa que imprima y sume 40 términos de la siguiente serie. 
Los términos serán mostrados en una columna a razón de un término por fila 
(Puede usar textfields Número Inicial y/o Razón) : 4, 7, 10, 13, 16, 19, 22,…
*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmSerie extends JFrame {

    private JTextField txtInicial, txtRazon, txtSuma;
    private JTable tabla;
    private DefaultTableModel modelo;
    private JButton btnGenerar;

    public FrmSerie() {
        setTitle("Serie Aritmética - 40 Términos");
        setSize(400, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblInicial = new JLabel("Número Inicial:");
        lblInicial.setBounds(20, 20, 120, 25);
        add(lblInicial);

        txtInicial = new JTextField("4");
        txtInicial.setBounds(150, 20, 100, 25);
        add(txtInicial);

        JLabel lblRazon = new JLabel("Razón:");
        lblRazon.setBounds(20, 60, 120, 25);
        add(lblRazon);

        txtRazon = new JTextField("3");
        txtRazon.setBounds(150, 60, 100, 25);
        add(txtRazon);

        btnGenerar = new JButton("Generar Serie");
        btnGenerar.setBounds(120, 100, 150, 30);
        add(btnGenerar);

        modelo = new DefaultTableModel();
        modelo.addColumn("Términos");

        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 150, 150, 200);
        add(scroll);

        JLabel lblSuma = new JLabel("Suma Total:");
        lblSuma.setBounds(200, 200, 100, 25);
        add(lblSuma);

        txtSuma = new JTextField();
        txtSuma.setBounds(200, 230, 120, 25);
        txtSuma.setEditable(false);
        add(txtSuma);

        btnGenerar.addActionListener(e -> generarSerie());
    }

    private void generarSerie() {
        modelo.setRowCount(0);

        int inicial = Integer.parseInt(txtInicial.getText());
        int razon = Integer.parseInt(txtRazon.getText());

        int suma = 0;
        int termino = inicial;

        for (int i = 1; i <= 40; i++) {
            modelo.addRow(new Object[]{termino});
            suma += termino;
            termino += razon;
        }

        txtSuma.setText(String.valueOf(suma));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrmSerie().setVisible(true);
        });
    }
}
