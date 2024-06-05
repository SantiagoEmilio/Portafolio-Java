package programas;

import java.util.Scanner;

public class IMC {

    public static double calcular (double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void programaIMC() {
        Scanner intDato = new Scanner(System.in);

        System.out.print("Ingrese el peso: ");
        double peso = intDato.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = intDato.nextDouble();

        double imc = calcular (peso, altura);
        System.out.println("Tu IMC es: " + imc);
    }
}







