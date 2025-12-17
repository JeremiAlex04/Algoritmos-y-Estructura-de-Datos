import javax.swing.*;
import java.awt.*;

/*
EJERCICIO APLICACTIVO 2:
Realizar un programa que permita el Ingreso de valores aleatorios al arreglo
unidimensional
*/

public class UnidimensionalArreglo2 extends JFrame {

    DefaultListModel<String> modeloLista;
    JList<String> jList1;
    JButton btnagregar;

    public UnidimensionalArreglo2() {
        setTitle("Arreglo Unidimensional");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        modeloLista = new DefaultListModel<>();
        jList1 = new JList<>(modeloLista);

        btnagregar = new JButton("Generar números");
        btnagregar.addActionListener(e -> btnagregarActionPerformed());

        add(new JScrollPane(jList1), BorderLayout.CENTER);
        add(btnagregar, BorderLayout.SOUTH);
    }

    private void btnagregarActionPerformed() {
        modeloLista.clear();
        int[] Numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            Numeros[i] = (int)(Math.random() * 100) + 1;
            modeloLista.addElement("Arreglo "+(i + 1) + ".- " + Numeros[i]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnidimensionalArreglo2().setVisible(true);
        });
    }
}
