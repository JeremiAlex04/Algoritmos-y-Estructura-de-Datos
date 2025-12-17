package TAREA.ArreglosParalelos;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SistemaEmpleados_AP extends JFrame {

    // Arreglos paralelos
    private String[] dnis = new String[5];
    private String[] cargos = new String[5];
    private int[] antiguedades = new int[5];
    private int contador = 0;

    // Componentes
    private JTextField txtDni, txtCargo, txtAntiguedad;
    private JTable tablaResultados;
    private DefaultTableModel modeloTabla;
    private JButton btnRegistrar, btnBuscarCargo, btnAntiguedad, btnMostrarTodo;
    private JLabel lblContador;

    public SistemaEmpleados_AP() {
        setTitle("Sistema de Gestión de Empleados - Vista de Tabla");
        setSize(850, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));
        setLocationRelativeTo(null);

        // --- PANEL DE ENTRADA ---
        JPanel pnlEntrada = new JPanel(new GridLayout(4, 2, 10, 10));
        pnlEntrada.setBorder(BorderFactory.createTitledBorder("Entrada de Datos"));

        pnlEntrada.add(new JLabel(" DNI:"));
        txtDni = new JTextField();
        pnlEntrada.add(txtDni);

        pnlEntrada.add(new JLabel(" Cargo:"));
        txtCargo = new JTextField();
        pnlEntrada.add(txtCargo);

        pnlEntrada.add(new JLabel(" Años de Antigüedad:"));
        txtAntiguedad = new JTextField();
        pnlEntrada.add(txtAntiguedad);

        btnRegistrar = new JButton("Guardar en Arreglos");
        btnRegistrar.setBackground(new Color(173, 216, 230));
        pnlEntrada.add(btnRegistrar);

        lblContador = new JLabel(" Registrados: 0 / 5");
        pnlEntrada.add(lblContador);

        // --- PANEL DE TABLA ---
        String[] columnas = { "DNI", "Cargo", "Años", "Estado/Bono" };
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaResultados = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaResultados);

        // --- PANEL DE BOTONES ---
        JPanel pnlAcciones = new JPanel(new FlowLayout());
        btnBuscarCargo = new JButton("Buscar Cargo (Equals)");
        btnAntiguedad = new JButton("Filtrar Antigüedad > 3");
        btnMostrarTodo = new JButton("Mostrar Nómina Completa");

        pnlAcciones.add(btnBuscarCargo);
        pnlAcciones.add(btnAntiguedad);
        pnlAcciones.add(btnMostrarTodo);

        add(pnlEntrada, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(pnlAcciones, BorderLayout.SOUTH);

        // --- LÓGICA DE EVENTOS ---

        btnRegistrar.addActionListener(e -> {
            if (contador < 5) {
                try {
                    // 1. Guardar en los arreglos paralelos
                    dnis[contador] = txtDni.getText();
                    cargos[contador] = txtCargo.getText();
                    antiguedades[contador] = Integer.parseInt(txtAntiguedad.getText());

                    // 2. Mostrar inmediatamente en la tabla para confirmar registro
                    agregarFilaTabla(contador);

                    contador++;
                    lblContador.setText(" Registrados: " + contador + " / 5");

                    // Limpiar campos
                    txtDni.setText("");
                    txtCargo.setText("");
                    txtAntiguedad.setText("");

                    if (contador == 5) {
                        btnRegistrar.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "Se completaron los 5 registros.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido en antigüedad.");
                }
            }
        });

        btnMostrarTodo.addActionListener(e -> {
            if (validar()) {
                refrescarTablaTotal();
            }
        });

        btnBuscarCargo.addActionListener(e -> {
            if (validar()) {
                String busca = JOptionPane.showInputDialog("Cargo exacto:");
                if (busca != null && !busca.isEmpty()) {
                    modeloTabla.setRowCount(0); // Limpiar para mostrar solo resultados
                    for (int i = 0; i < 5; i++) {
                        if (cargos[i].equalsIgnoreCase(busca)) {
                            agregarFilaTabla(i);
                        }
                    }
                }
            }
        });

        btnAntiguedad.addActionListener(e -> {
            if (validar()) {
                modeloTabla.setRowCount(0);
                for (int i = 0; i < 5; i++) {
                    if (antiguedades[i] > 3) {
                        agregarFilaTabla(i);
                    }
                }
            }
        });
    }

    private void agregarFilaTabla(int i) {
        String estado = (antiguedades[i] > 3) ? "Estable (+3 años)" : "Reciente";
        Object[] fila = { dnis[i], cargos[i], antiguedades[i], estado };
        modeloTabla.addRow(fila);
    }

    private void refrescarTablaTotal() {
        modeloTabla.setRowCount(0);
        for (int i = 0; i < 5; i++) {
            agregarFilaTabla(i);
        }
    }

    private boolean validar() {
        if (contador < 5) {
            JOptionPane.showMessageDialog(this, "Faltan registros por completar.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SistemaEmpleados_AP().setVisible(true));
    }
}