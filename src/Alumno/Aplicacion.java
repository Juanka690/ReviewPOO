package Alumno;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos que va a calificar: ");
            int cantidadAlumnos = scanner.nextInt();

        for (int j = 0; j < cantidadAlumnos; j++) {

            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.next();

            System.out.print("Ingrese la edad del estudiante: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese la cantidad de asignaturas que va a calificar: ");
            int cantidadAsignaturas = scanner.nextInt();

            Alumno alumno = new Alumno(nombre, edad);


            for (int i = 0; i < cantidadAsignaturas; i++) {
                System.out.println("Ingrese el nombre de la asignatura " + (i + 1) + ":");
                String nombreAsignatura = scanner.next();

                System.out.println("Ingrese la nota obtenida en la asignatura " + (i + 1) + ":");
                float notaAsignatura = scanner.nextFloat();

                alumno.addAsignatura(new Asignatura(nombreAsignatura, notaAsignatura));
            }

            alumno.getInformacion();
        }
    }
}