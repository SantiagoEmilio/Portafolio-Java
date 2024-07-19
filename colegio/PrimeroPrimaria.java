package colegio;

import java.util.Scanner;

public class PrimeroPrimaria {
    public static void programa() {
        System.out.println("PrimeroPrimaria");

        // Estudiante
        Estudiantes estudiante1 = new Estudiantes("André", "biato@scl.edu.gt", "primero Primaria", 8, true);
        Estudiantes estudiante2 = new Estudiantes("Gabriel", "gabri@scl.edu.gt", "primero Primaria", 7, true);
        Estudiantes estudiante3 = new Estudiantes("Alejandra", "Alet@scl.edu.gt", "primero Primaria", 7, true);
        Estudiantes estudiante4 = new Estudiantes("pedro","pedro@scl.edu.gt","primero primaria",8,false);

        //CURSOS
        Cursos curso1 = new Cursos("Matemáticas","ciencia","1");
        Cursos curso2 = new Cursos("lenguaje","comunicación","2");
        Cursos curso3 = new Cursos("Sociales","ciencia","3");
        Cursos curso4 = new Cursos("Filosofía","Lógica","4");

        Scanner scr = new Scanner(System.in);

/*
        //NOMBRE,correo,Grado,edad y solvencia de estudiante

        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        System.out.println(estudiante4.getNombre());

        System.out.println(estudiante1.getCorreo());
        System.out.println(estudiante2.getCorreo());
        System.out.println(estudiante3.getCorreo());
        System.out.println(estudiante4.getCorreo());

        System.out.println(estudiante1.getedad());
        System.out.println(estudiante2.getedad());
        System.out.println(estudiante3.getedad());
        System.out.println(estudiante4.getedad());

        System.out.println(estudiante1.getsolvencia());
        System.out.println(estudiante2.getsolvencia());
        System.out.println(estudiante3.getsolvencia());
        System.out.println(estudiante4.getsolvencia());



        //NOMBRE,CATEGORIA Y PERIODO DE CURSOS

        System.out.println(curso1.getNombre());
        System.out.println(curso2.getNombre());
        System.out.println(curso3.getNombre());
        System.out.println(curso4.getNombre());

        System.out.println(curso1.getCategoria());
        System.out.println(curso2.getCategoria());
        System.out.println(curso3.getCategoria());
        System.out.println(curso4.getCategoria());

        System.out.println(curso1.getPeriodo());
        System.out.println(curso2.getPeriodo());
        System.out.println(curso3.getPeriodo());
        System.out.println(curso4.getPeriodo());


 */
        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        System.out.println(estudiante4.getNombre());

        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        System.out.println(estudiante4.getNombre());

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(curso3.toString());
        System.out.println(curso4.toString());

    }
}
