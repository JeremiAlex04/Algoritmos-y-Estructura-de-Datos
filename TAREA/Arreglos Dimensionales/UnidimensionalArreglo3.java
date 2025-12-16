import javax.swing.*;
/*
EJERCICIO APLICATIVO 3
Almacenar los votos obtenidos por los 20 candidatos. Estos son ingresados
por el usuario
*/
public class UnidimensionalArreglo3 extends JFrame {

    DefaultListModel<String> modeloLista;
    JList<String> jList1;
    JButton btnagregar;

    public UnidimensionalArreglo3() {
        setTitle("Votos de Candidatos");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        modeloLista = new DefaultListModel<>();
        jList1 = new JList<>(modeloLista);
        btnagregar = new JButton("Ingresar votos");

        btnagregar.addActionListener(e -> btnagregarActionPerformed());

        add(new JScrollPane(jList1), "Center");
        add(btnagregar, "South");
    }

    private void btnagregarActionPerformed() {
        int votos[] = new int[20];
        modeloLista.clear();

        for (int i = 0; i < 20; i++) {
            String input = JOptionPane.showInputDialog(
                "INGRESAR CANTIDAD DE VOTOS - " + (i + 1)
            );

            if (input == null || input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Proceso cancelado");
                return;
            }

            votos[i] = Integer.parseInt(input);
            modeloLista.addElement((i + 1) + ".- " + votos[i]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnidimensionalArreglo3().setVisible(true);
        });
    }
}
