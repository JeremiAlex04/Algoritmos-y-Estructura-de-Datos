package PILAS;

import javax.swing.JOptionPane;

public class Pila {

   int vectorPila[];
    int Cima;

    public Pila(int tamaño) {
        vectorPila = new int[tamaño];
        Cima = -1;
    }

    void Agregar(int dato) {
        Cima++;//Cima=Cima+1;
        vectorPila[Cima] = dato;
    }

    void Mostrar() {
        String Acum = "";
        for (int i = 0; i < vectorPila.length; i++) {
            Acum = "\n" + vectorPila[i] + Acum;
        }

        System.out.println(Acum);
    }
    

    int Eliminar() {
        int elemento = vectorPila[Cima];
        vectorPila[Cima] = 0;
        Cima--;
        return elemento;
    }

    void VaciarPila() {
        for (int i = 0; i < vectorPila.length; i++) {
            vectorPila[i] = 0;
        }
        Cima = -1;
    }

    int UbicacionCima() {
        return Cima;
    }

    int ValorCima() {
        return vectorPila[Cima];
    }

    boolean EstaVacia() {
        return Cima == -1;
    }

    boolean EstaLlena() {
        return Cima == (vectorPila.length - 1);
    }

}
