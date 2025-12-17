package PRACTICASCALIFICADAS.PracticaCalificadaN1;
/*
PREGUNTA 3:
Dado A = ["Carlos", "Miguel", "Bryan", "Andres", "Simon"]:
- Declara el arreglo
- Elimina el elemento en la posición 3 del arreglo 
*/

public class Pregunta3 {
    public static void main(String[] args) {
        String a[] = { "Carlos", "Miguel", "Andres", "Andres", "Simon" };
        System.out.println("Antes: ");
        for (int i = 0; i< a.length; i++) {
            System.out.println("Posicion "+i+": "+a[i]);
        }

        System.out.println("\nDespues: ");

        for (int i = 0; i< 10; i++){
            if (i == 3){
                a[i] = "";
            }
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.println("Posicion "+i+": "+a[i]);
        }

    }
}
