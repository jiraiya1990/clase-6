package Clase6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        List<persona> listaPersonas = new ArrayList<>();
        
        int opc = 0;
        char tipoPersona;

        while (opc != 3) {

            System.out.println("Bienvenido a la base de datos del colegio");
            System.out.println();
            System.out.println("1 - Agregar una persona ");
            System.out.println();
            System.out.println("2 - Ver personal");
            System.out.println();
            System.out.println("3 - Salir");

            opc = input.nextInt();

            if (opc == 1) {
                System.out.println("Ingrese 'a' si la persona es un profesor, o 'b' si es un estudiante");
                tipoPersona = input.next().charAt(0);

                System.out.println("Ingrese el nombre de la persona");
                String nombre = input.next();
                System.out.println();

                System.out.println("Ingrese la CI");
                int CI = input.nextInt();
                System.out.println();

                System.out.println("Ingrese la edad ");
                int edad = input.nextInt();
                System.out.println();


                if (tipoPersona == 'a') {


                    System.out.println("Ingrese el salario ");
                    int salario = input.nextInt();
                    System.out.println();

                    System.out.println("Ingrese la materia asignada");
                    String materia = input.next();
                    System.out.println();

                    persona personaNueva = new profesor(nombre, CI, edad, salario, materia);

                    listaPersonas.add(personaNueva);
                    System.out.println("Se ha ingresado un nuevo profesor");

                } else if (tipoPersona == 'b') {
                    System.out.println("Ingrese el numero del estudiante");
                    int nroEstudiante = input.nextInt();
                    System.out.println();

                    System.out.println("Ingrese el grupo del alumno");
                    String grupo = input.next();
                    System.out.println();

                    System.out.println("Ingrese 0 si el alumno tiene materias previas o 1 si no");
                    int tienePrevias = input.nextInt();
                    boolean previas;

                    if (tienePrevias == 0) {
                        previas = true;
                    } else {
                        previas = false;

                    }

                    persona alumno1 = new alumno(nombre, CI, edad, nroEstudiante, grupo, previas);
                    listaPersonas.add(alumno1);

                    System.out.println("Se ha ingresado un nuevo alumno");
                    System.out.println();


                }

            } else if (opc == 2) {
                for (persona pers : listaPersonas) {
                    System.out.println(pers);
                }
            } else {
                System.out.println("Saliendo del programa....");
            }


        }


    }


}
