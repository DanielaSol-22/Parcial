/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcial;

/**
 *
 * @author USUARIO 2022
 */
    
public class Test {
    public static void main(String[] args) {
        // Crear Catedráticos
        Catedratico catedratico1 = new Catedratico("Manuel", "Garcia");
        Catedratico catedratico2 = new Catedratico("David", "Velez");
        Catedratico catedratico3 = new Catedratico("Luis", "Martinez");

        // Crear Cursos
        Curso curso1 = new Curso("Matematicas", "MATE", 2); // Capacidad para 2 estudiantes
        Curso curso2 = new Curso("Historia", "HIST", 5); // Capacidad para 5 estudiantes
        Curso curso3 = new Curso("Ciencia", "SCI", 5); // Capacidad para 5 estudiantes

        // Crear Alumnos
        Alumno alumno1 = new Alumno("Chris", "Camacho");
        Alumno alumno2 = new Alumno("Rick", "Hernandez");
        Alumno alumno3 = new Alumno("Jose", "Ramirez");

        // Crear Asignaciones
        Asignacion asignacion1 = new Asignacion(alumno1);
        Asignacion asignacion2 = new Asignacion(alumno2);
        Asignacion asignacion3 = new Asignacion(alumno3);

        // Asignar cursos a alumnos
        asignacion1.addCurso(curso1); // Se debe agregar al curso1, que tiene 2 cupos
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        asignacion2.addCurso(curso1); // Este debe fallar si el curso1 ya está lleno
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        asignacion3.addCurso(curso1); // Debería fallar si el curso1 está lleno
        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);

        // Imprimir datos de los catedráticos
        System.out.println("Datos de Catedraticos:");
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        // Imprimir datos de los alumnos
        System.out.println("\nDatos de Alumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();

        // Imprimir datos de los cursos y los alumnos inscritos
        System.out.println("\nDatos de Cursos y Estudiantes Inscritos:");
        imprimirDatosCursos(curso1, curso2, curso3);
    }

    // Método para imprimir datos de los cursos
    private static void imprimirDatosCursos(Curso... cursos) {
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNombre() + " (" + curso.getCodigo() + ")");
            System.out.println("Cupo Maximo: " + curso.getMaxEstudiantes() + ", Inscritos: " + curso.getEstudiantes().size());
            for (Alumno estudiante : curso.getEstudiantes()) {
                System.out.println("  - " + estudiante.getNombre() + " " + estudiante.getApellido() + " (Carnet: " + estudiante.getCarnet() + ")");
            }
            System.out.println();
        }
    }
}