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

public class Asignacion {
    private Alumno alumno;
    private List<Curso> cursos;

    // Constructor de la clase
    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new ArrayList<>();
    }

    // Método para agregar un curso al alumno
    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
            curso.agregarEstudiante(alumno);
        } else {
            System.out.println("No se puede agregar el curso " + curso.getNombre() + " porque no hay cupo disponible.");
        }
    }

    // Getters y Setters
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
