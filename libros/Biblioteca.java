package libros;

import java.util.Scanner;

public class Biblioteca {

    public static void programa(){
        System.out.println("Bibliteca");

        libro libro1 = new libro("EL Padrino","Mario puso", "10/3/1969");
        libro libro2 = new libro("El Principito","Antonie", "6/4/1943");
        libro libro3 = new libro("El niño con el pijama de rayas", "John Boyne", "5/1/2006");
        libro libro4 = new libro("la calle donde tu vives", "Hector Gaitán", "1960");
        libro libro5 = new libro("El Nombre de la Rosa", "Umberto Eco","1980");
        libro libro6 = new libro("Don quijote de la Mancha", "Miguel de  cervantes", "1605");
        libro libro7 = new libro("El código de Da Vinci","Dan Brown","18/3/2003");
        libro libro8 = new libro("Orgullo y prejuicio", "Jane Austen","1813");
        libro libro9 = new libro("crimen y castigo","Fiódor Dostoyevski","1866");
        libro libro10 =new libro("En busca del tiempo perdido","Marcel Proust","1914");



        Scanner scr = new Scanner(System.in);


        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());

        //AUTORES
        libro1.setAutor("Santiago");
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());


        System.out.println(libro1.toString());
    }
}


