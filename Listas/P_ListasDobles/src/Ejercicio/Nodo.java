/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Jeremi Alexander
 */
public class Nodo {

    String codigo;
    String nombre;
    String apellido;
    String sexo;
    float sueldo;
    Nodo sig;
    Nodo ant;

    public Nodo(String codigo, String nombre, String apellido, String sexo, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.sueldo = sueldo;
        sig = ant = null;
    }

}
