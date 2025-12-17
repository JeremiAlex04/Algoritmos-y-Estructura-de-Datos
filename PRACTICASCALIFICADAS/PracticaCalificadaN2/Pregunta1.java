package PRACTICASCALIFICADAS.PracticaCalificadaN2;
/*
Crear un NODO donde este tenga un puntero y 3 atributos distintos 
(no puede repetir los tipos de datos). Información: Restaurant.
*/
public class Pregunta1 {
    //Restaurante Nodo
    class Nodo {
        String nombreRestaurant;
        int numeroMesas;
        boolean tieneEstacionamiento;
        Nodo siguiente;

        public Nodo(String nombreRestaurant, int numeroMesas, boolean tieneEstacionamiento) {
            this.nombreRestaurant = nombreRestaurant;
            this.numeroMesas = numeroMesas;
            this.tieneEstacionamiento = tieneEstacionamiento;
            this.siguiente = null;
        }
    }
    
}
