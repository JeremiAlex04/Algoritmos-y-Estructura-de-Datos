package PRACTICASCALIFICADAS.PracticaCalificadaN2;
import PRACTICASCALIFICADAS.PracticaCalificadaN2.Nodo;

public class Pregunta4 {
    public class Operacion {
        //Metodo para insertar Inicio
        // Para desarrollar este Pregunta4
        //He utilizo los atributos de la primera pregunta

        //Metodo 
        //Parametriza los valores de los datos de la clase Nodo
        Nodo InsertarInicio(Nodo inicio, String nombre_restaurante, int foro_personas, double ingresoMensual) {

            Nodo nuevo = new Nodo(nombre_restaurante, foro_personas, ingresoMensual);

            nuevo.siguiente = inicio; // el nuevo apunta al inicio
            inicio = nuevo;           // ahora el inicio es el nuevo

            return inicio;
        }
    }
}
