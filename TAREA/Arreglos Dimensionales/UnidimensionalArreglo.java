/*
EJERCICIO APLICATIVO
Ingresar un arreglo unidimensional que permita ingresar números
aleatorios.
*/
import javax.swing.JOptionPane;


public class UnidimensionalArreglo {
    public static void main(String[] args) {
        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        int A [] = new int [nro];
        for (int i=0; i < nro; i++){
            A[i] = (int)(Math.random()*15+5);
            System.out.println("Arreglo " + i + " --> " + A[i]);
        }
    }
}