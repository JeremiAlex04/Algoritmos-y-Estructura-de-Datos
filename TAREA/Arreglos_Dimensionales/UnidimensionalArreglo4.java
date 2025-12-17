/*
EJERCICIO APLICATIVO 4
Ahora aplicando los pasos anterires desarrollar lo siguiente: 
Se tiene una lista llamado Amigos: Verónica E., Gelnda D., Victor S., 
Rogelio T., Waldir C., Eduardo A., Carlos M., Henrry Q., Miguel F., 
Manue T, Juan C. Se necesita almacenarlo en un Arreglo y mostrarlo.
*/

import javax.swing.*;

public class UnidimensionalArreglo4 extends JFrame {

    DefaultListModel<String> modeloLista;
    JList<String> jList1;       
    JButton btnMostrar;            

    String[] amigos = {
        "Verónica E.", "Gelnda D.", "Victor S.", "Rogelio T.", "Waldir C.",
        "Eduardo A.", "Carlos M.", "Henrry Q.", "Miguel F.", "Manuel T.", "Juan C."
    };

    int indice = 0;

    public UnidimensionalArreglo4() {
        setTitle("Lista de Amigos");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        modeloLista = new DefaultListModel<>();
        jList1 = new JList<>(modeloLista);
        btnMostrar = new JButton("Mostrar Amigos");

        btnMostrar.addActionListener(e -> btnMostrarActionPerformed());

        add(new JScrollPane(jList1), "Center");
        add(btnMostrar, "South");
    }

    private void btnMostrarActionPerformed() {
        if (indice < amigos.length) {
            modeloLista.addElement("Nro de amigo " + (indice + 1) + ": " + amigos[indice]);
            indice++;
        } else {
            JOptionPane.showMessageDialog(this, "Ya se mostraron todos los amigos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UnidimensionalArreglo4().setVisible(true);
        });
    }
}
