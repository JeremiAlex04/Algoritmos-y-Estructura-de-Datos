/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PILAS;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {

        //int tamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el tamaño de la PILA:"));
        int tamaño = 5;
        Pila P = new Pila(tamaño);
        
        System.out.println("INICIO DE LA PILA");
        P.Agregar(23);
        P.Agregar(15);
        P.Agregar(33);
        P.Agregar(40);
        P.Agregar(700);
        P.Mostrar();
        System.out.println("Vaciar Pila");
        P.VaciarPila();
        P.Mostrar();
        P.Agregar(99);
        P.Agregar(44);
        P.Mostrar();
        // System.out.println("valor elimino: "+P.Eliminar());
        // P.Mostrar();
        
        System.out.println("valor Cima: " + P.UbicacionCima());
        //System.out.println("valor Cima: "+P.ValorCima());
        
        if (P.EstaLlena() == true) {
            System.out.println("Esta llena la pila");
        } else {
            System.out.println("Falta" + (tamaño - P.UbicacionCima() - 1) + " elementos para llenarse");
        }
        
        if (P.EstaVacia() == true) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("No esta vacia");
            System.out.println("Hay" + (P.UbicacionCima() + 1) + "Elementos en la pila");
            
        }
    }
    
}
