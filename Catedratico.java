/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author USUARIO 2022
 */
public class Catedratico {
    private static int contador = 1; // Contador para asignar números únicos
    private int numeroCatedratico;
    private String nombre;
    private String apellido;

    // Constructor de la clase
    public Catedratico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCatedratico = contador++; // Asigna automáticamente el número y aumenta el contador
    }

    // Método para imprimir los datos del catedrático
    public void imprimirDatos() {
        System.out.println("Catedratico: " + nombre + " " + apellido + ", Numero: " + numeroCatedratico);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Catedratico.contador = contador;
    }

     //Getters y setters
    public int getNumeroCatedratico() {
        return numeroCatedratico;
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
