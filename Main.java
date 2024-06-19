import colegio.Escuela;
import colegio.PrimeroPrimaria;
import conversor.FcCf;
import Lista.Listadecompras;
import calculadora.CalcularEdad;
import interfaz_grafica.Banner;
import libros.Biblioteca;
import mis_Metodos.ListaOpciones;
import IMC.IMC;
import java.util.Scanner;
import calculadora.AritmeticaBasica;
import mis_Metodos.mismetodos;


import conversor.unidades;
import conversor.conversorDeMonedas;
public class Main {
    public static void
    main(String[] args) {

        //lista de opciones
             String[] listaDeOpciones = {
                     "calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Grados", "Opción_6",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir" };

        boolean programas= true;
        do {
            Banner.mensaje();
            ListaOpciones.cargarOpciones(listaDeOpciones);
            System.out.print("[?]: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            System.out.println("-----------------------------------------------");

            switch (opcion) {

                case 1:
                    AritmeticaBasica.matexd();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    FcCf.gradosxd();
                    break;

                case 4:
                                        break;
                case 5:
                    CalcularEdad.proceso();
                    break;
                case 6:
                    Listadecompras.programa();
                    break;

                case 7:
                    conversorDeMonedas.programa();
                    break;

                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    PrimeroPrimaria.programa();
                    break;
                case 10:
                    programas = false;
                    break;

            }
        }while (programas);

    }
}






