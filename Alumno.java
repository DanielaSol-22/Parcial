/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author USUARIO 2022
 */
public class Alumno {
    private static int contador = 1; // Contador para asignar carnets únicos
    private int carnet;
    private String nombre;
    private String apellido;

    // Constructor de la clase
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = contador++; // Asigna automáticamente el carnet y aumenta el contador
    }

    // Método para imprimir los datos del alumno
    public void imprimirDatos() {
        System.out.println("Alumno: " + nombre + " " + apellido + ", Carnet: " + carnet);
    }

    // Getters y setters si es necesario
    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
