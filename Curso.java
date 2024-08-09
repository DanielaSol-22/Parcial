/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author USUARIO 2022
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private int maxEstudiantes;
    private List<Alumno> estudiantes;

    // Constructor de la clase
    public Curso(String nombre, String codigo, int maxEstudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.maxEstudiantes = maxEstudiantes;
        this.estudiantes = new ArrayList<>();
    }

    // Método para verificar si hay espacio disponible en el curso
    public boolean verificaEspacio() {
        return estudiantes.size() < maxEstudiantes;
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Alumno alumno) {
        if (verificaEspacio()) {
            estudiantes.add(alumno);
        } else {
            System.out.println("No hay espacio disponible en el curso " + nombre);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public void setMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }

    public List<Alumno> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Alumno> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
