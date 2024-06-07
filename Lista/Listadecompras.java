package Lista;
import opciones.ListaOpciones;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Listadecompras {

    public static String[] opciones6 = {"Lista de compras", "Salir"};

    public static void programas() {
        ListaOpciones.cargarOpciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        switch (r) {
            case 1:
                listadeNombre();
                break;

            case 2:
                System.out.println("salir");
                break;


             //Agregar  lista Vacia
            String rP;
            double rPc;
           }

            for (int i = 1; i <= 10; i++) {
                Scanner item = new Scanner(System.in);
                System.out.print("Productos: ");
                String rP = item.nextLine();
                System.out.print("Precio: ");
                double rPc = item.nextDouble();
                listadeNombre.add(rP);
            }


                System.out.println(listadeNombre);

            }


    }