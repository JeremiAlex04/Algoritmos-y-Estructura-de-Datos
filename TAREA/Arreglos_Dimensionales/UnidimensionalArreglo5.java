/*
EJERCICIO APLICATIVO 5
Se pide crear una lista que almacene 10 registros: estos datos serán 
Apellidos, edades y distritos del aula 115.
*/


import javax.swing.*;

public class UnidimensionalArreglo5 extends JFrame {

    DefaultListModel<String> modeloApellidos;
    DefaultListModel<String> modeloEdades;
    DefaultListModel<String> modeloDistritos;

    JList<String> listApellidos;
    JList<String> listEdades;
    JList<String> listDistritos;

    JButton btnAgregar;

    String[] apellidos = {
        "Escobar R.", "Sanchez F.", "Duran P.", "Tello G.", "Angeles A.",
        "Florian M.", "Quinteros H.", "Monge L.", "Cruz R.", "Cutipa H."
    };

    int[] edades = {22, 30, 23, 34, 38, 37, 33, 21, 31, 20};

    String[] distritos = {
        "Chorrillos", "Lince", "San Borja", "Zárate", "Jesús María",
        "S.J.M", "S.J.M", "Surco", "Molina", "Chorrillos"
    };

    int indice = 0;

    public UnidimensionalArreglo5() {
        setTitle("Registro de Datos");
        setSize(550, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Modelos
        modeloApellidos = new DefaultListModel<>();
        modeloEdades = new DefaultListModel<>();
        modeloDistritos = new DefaultListModel<>();

        // Listas
        listApellidos = new JList<>(modeloApellidos);
        listEdades = new JList<>(modeloEdades);
        listDistritos = new JList<>(modeloDistritos);

        JScrollPane sp1 = new JScrollPane(listApellidos);
        JScrollPane sp2 = new JScrollPane(listEdades);
        JScrollPane sp3 = new JScrollPane(listDistritos);

        sp1.setBounds(20, 60, 160, 180);
        sp2.setBounds(195, 60, 80, 180);
        sp3.setBounds(290, 60, 200, 180);

        // Botón
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(200, 15, 120, 30);
        btnAgregar.addActionListener(e -> agregarRegistro());

        add(btnAgregar);
        add(sp1);
        add(sp2);
        add(sp3);
    }

    private void agregarRegistro() {
        if (indice < apellidos.length) {
            modeloApellidos.addElement((indice + 1) + ".- " + apellidos[indice]);
            modeloEdades.addElement(String.valueOf(edades[indice]));
            modeloDistritos.addElement(distritos[indice]);
            indice++;
        } else {
            JOptionPane.showMessageDialog(this, "Ya se registraron los 10 alumnos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnidimensionalArreglo5().setVisible(true);
        });
    }
}
