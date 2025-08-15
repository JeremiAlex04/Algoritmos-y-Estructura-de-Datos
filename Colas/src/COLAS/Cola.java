package COLAS;

import javax.swing.JOptionPane;

public class Cola {

    int VectorCola[];
    int inicio, fin;
    int tamaño;

    public Cola(int tamaño) {
        this.tamaño = tamaño;
        inicio = -1;
        fin = -1;
        this.VectorCola = new int[tamaño];
    }

    boolean estaLlenaCola() {
        if (fin == tamaño - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaVaciaCola() {
        if (fin == -1 && inicio == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    //Agregar un elemento
    void agregar(int dato) {
        fin++;//fin=fin+1
        inicio = 0;
        VectorCola[fin] = dato;
    }
    
    

    int eliminar() {
        int elemento = VectorCola[0];
        for (int i = 0; i < fin; i++) {
            VectorCola[i] = VectorCola[i + 1];
        }
        fin--;//fin=fin-1

        if (fin == -1) {
            inicio = -1;
        }
        return elemento;
    }
    

    
    
    int EnCola() {
        return fin + 1;
    }

    
    void mostrarCola() {
        String m = "";
        for (int i = 0; i <= fin; i++) {
            m = m + " | " + VectorCola[i] + " | ";
        }
        System.out.println(m);
    }

    void VaciarCola() {
        inicio = -1;
        fin = -1;
    }

}
