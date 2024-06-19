package calculadora;
import mis_Metodos.ListaOpciones;

import java.util.Scanner;


public class AritmeticaBasica {

    public static void matexd(){

        String[] opcionesMate = {"Suma","Resta","Multiplicación","División"};
        ListaOpciones.cargarOpciones(opcionesMate);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar  el número de la operación  (1/2/3/4): ");
        int opcion = scanner.nextInt();

        System.out.print("primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcion){
            case 1:
                System.out.println("Resultado Suma" + sumar(num1,num2));
                break;
        }

        scanner.close();
    }

    public static double sumar(double n1, double n2){
        return n1+n2;
    }

}
