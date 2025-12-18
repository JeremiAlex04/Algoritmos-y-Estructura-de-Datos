package TAREA.ArreglosUniBiDimencionales;

import javax.swing.*;

public class FrmPatronNumerico extends JFrame {

    private JTextArea txtResultado;
    private JButton btnMostrar;

    public FrmPatronNumerico() {
        setTitle("Formulario 2 - Patrón Numérico");
        setSize(350, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(100, 20, 120, 30);
        add(btnMostrar);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(50, 70, 230, 200);
        add(scroll);

        btnMostrar.addActionListener(e -> mostrarPatron());
    }

    private void mostrarPatron() {
        txtResultado.setText("");

        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                txtResultado.append(j + "");
            }
            txtResultado.append("\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrmPatronNumerico().setVisible(true);
        });
    }
}
