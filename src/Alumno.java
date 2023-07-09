import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private int edad;
    private Asignatura[] asignaturas = new Asignatura[4];
    int cantidadAsignaturas = 0;

    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void addAsignatura(Asignatura asignatura) {
        if (cantidadAsignaturas < 4) {
            for (int i = 0; i < cantidadAsignaturas; i++) {
                if (asignaturas[i] == asignatura) {
                    System.out.println("La asignatura ya ha sido agregada.");
                    return;
                }
            }

            asignaturas[cantidadAsignaturas] = asignatura;
            cantidadAsignaturas++;
        } else {
            System.out.println("No se pueden agregar más asignaturas, debido a que se ha alcanzado el limite de 4 asignaturas. ");
        }
    }

    public float promedio(){
        float acumulador = 0;
        for (int i = 0; i < cantidadAsignaturas; i++) {
            acumulador += asignaturas[i].getNota();
        }
        return acumulador / cantidadAsignaturas;
    }

    public void getInformacion() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Asignaturas del estudiante: ");
            for (int i = 0; i < cantidadAsignaturas; i++) {
                System.out.print(asignaturas[i].getNombreAsig() + " | ");
            }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < cantidadAsignaturas; i++) {
            Asignatura asignatura = asignaturas[i];
            System.out.println("Nombre de la asignatura: " + asignatura.getNombreAsig());
            System.out.println("Nota obtenida: " + asignatura.getNota());
            System.out.println("Estado de la asignatura: " + asignatura.aprobado());
            System.out.println("--------------------------------------------------------------");
        }
        System.out.println("Promedio del estudiante: " + promedio());
        System.out.println("--------------------------------------------------------------");
    }

}
