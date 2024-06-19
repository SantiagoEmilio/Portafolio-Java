package conversor;
import java.util.Scanner;

public class unidades {

    // Conversión de longitud: metros a pies siguientee
    public static double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    // Conversión de longitud: pies a metros
    public static double piesAMetros(double pies) {
        return pies / 3.28084;
    }

    // Conversión de longitud: kilómetros a millas siguente
    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    // Conversión de longitud: millas a kilómetros siguiente
    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }

    public static void proceso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de conversión de longitud:");
        System.out.println("1. Metros a Pies");
        System.out.println("2. Pies a Metros");
        System.out.println("3. Kilómetros a Millas");
        System.out.println("4. Millas a Kilómetros");

        int opcion = scanner.nextInt();
        double valor;
        double resultado;

        switch(opcion) {
            case 1:
                System.out.println("Ingrese metros:");
                valor = scanner.nextDouble();
                resultado = metrosAPies(valor);
                System.out.println(valor + " metros son " + resultado + " pies.");
                break;
            case 2:
                System.out.println("Ingrese pies:");
                valor = scanner.nextDouble();
                resultado = piesAMetros(valor);
                System.out.println(valor + " pies son " + resultado + " metros.");
                break;
            case 3:
                System.out.println("Ingrese kilómetros:");
                valor = scanner.nextDouble();
                resultado = kilometrosAMillas(valor);
                System.out.println(valor + " kilómetros son " + resultado + " millas.");
                break;
            case 4:
                System.out.println("Ingrese las millas:");
                valor = scanner.nextDouble();
                resultado = millasAKilometros(valor);
                System.out.println(valor + " millas son " + resultado + " kilómetros.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}