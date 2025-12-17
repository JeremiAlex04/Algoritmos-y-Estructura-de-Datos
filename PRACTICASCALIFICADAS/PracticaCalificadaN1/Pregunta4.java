package PRACTICASCALIFICADAS.PracticaCalificadaN1;
/*
Según el arreglo  A = [3, 8, 12, 5, 10]
- Se requiere generar un recorrido
- Dentro del recorrido se requiere  identificar a los impares
- Debe imprimir solo los impares 
*/
public class Pregunta4 {
    public static void main(String[] args) {
        int  a[] = {3,8,12,5,10};
        System.err.println("Coleccion de Nros: 3, 8, 12, 5, 10");
        System.out.println("Recorrido de Nros Impares: ");
        for (int i = 0; i< a.length; i++) {
            System.out.println(".- "+a[i]);
        }

        System.out.println("\nEvaluar los impares e imprimir: ");
        for (int i = 0; i< a.length; i++) {
            if (a[i] % 2 == 0) {
                
            } else {
                System.out.println(".- "+a[i]);
            }
        }
    }
}
