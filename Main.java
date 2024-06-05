import Grados.FcCf;
import Lista.Listadecompras;
import interfaz_grafica.Banner;
import opciones.ListaOpciones;
import programas.IMC;
import java.util.Scanner;
import maths.Matematicas;
import Conversor_de_unidades.unidades;
import opciones.ListaOpciones;

public class Main {
    public static void main(String[] args) {

        //lista de opciones
             String[] listaDeOpciones = {
                "Calculadora", "IMC",
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
                    Matematicas.matexd();
                    break;
                case 2:

                    IMC.programaIMC();
                    break;
                case 3:
                    break;

                case 4:
                    unidades.proceso();
                    programas = false;
                    break;

                case 5:
                    FcCf.gradosxd();
                    break;

                case 6:
                    Listadecompras.programas();
                    break;

                case 10:
                    programas = false;
                    break;

            }
        }while (programas);

    }
}






