import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/*
Formulario para registrar Platos de comida, con:
- Código
- Nombre
- Tipo (Entrada, Fondo, Postre)
- Precio
Los datos se almacenan en un ArrayList<Plato> y se muestran en una lista.
*/


public class FrmPlatos extends JFrame {

    private JTextField txtCodigo, txtNombre, txtPrecio;
    private JComboBox<String> cboTipo;
    private JTable tabla;
    private DefaultTableModel modelo;

    private ArrayList<Plato> listaPlatos = new ArrayList<>();

    public FrmPlatos() {
        setTitle("Platos de Comida");
        setSize(550, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 80, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(100, 20, 120, 25);
        add(txtCodigo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 60, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 60, 200, 25);
        add(txtNombre);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(20, 100, 80, 25);
        add(lblTipo);

        cboTipo = new JComboBox<>(new String[]{"Entrada", "Fondo", "Postre"});
        cboTipo.setBounds(100, 100, 120, 25);
        add(cboTipo);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(20, 140, 80, 25);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(100, 140, 100, 25);
        add(txtPrecio);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(100, 180, 120, 30);
        add(btnAgregar);

        // TABLA
        modelo = new DefaultTableModel(
            new Object[]{"Código", "Nombre", "Tipo", "Precio"}, 0
        );
        tabla = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 230, 500, 100);
        add(scroll);

        btnAgregar.addActionListener(e -> agregarPlato());
    }

    private void agregarPlato() {
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String tipo = cboTipo.getSelectedItem().toString();
        double precio = Double.parseDouble(txtPrecio.getText());

        Plato p = new Plato(codigo, nombre, tipo, precio);
        listaPlatos.add(p);

        modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getNombre(),
            p.getTipo(),
            ("S/ "+p.getPrecio())
        });

        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }

    public static void main(String[] args) {
        new FrmPlatos().setVisible(true);
    }
}
