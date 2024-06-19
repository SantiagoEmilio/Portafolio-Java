package conversor;
import mis_Metodos.ListaOpciones;

import java.util.List;
import java.util.Scanner;
public class conversorDeMonedas {

    public static String[] opcionesMonedas = {
            "quetzales / Dolares", "Dolares / quetzales" ,
            "quetzales / pesos MX" , "pesos MX / quetzales"
    };

    public static  void programa(){
        ListaOpciones.cargarOpciones(opcionesMonedas);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?]");
        String rScanner =scanner.nextLine();

        switch (rScanner){
            case "1":


            System.out.println("[Q]");
            double rQ = scanner.nextDouble();
            System.out.print("[S]" + quetalesDolares(rQ));
            break;


            case "2":
            System.out.print("[s]");
            double rD = scanner.nextDouble();
            System.out.print("[Q]" + DolaresAquetzales(rD));
            break;


            case "3":
            System.out.print("[Q]");
            double rp= scanner.nextDouble();
            System.out.print("[peso mx]" +pesoMX(rp));
            break;


            case "4":
            System.out.print("[mx]");
            double rQ2 = scanner.nextDouble();
            System.out.print("[Q]" + (rQ2));
            break;

        }
    }

  //Funciones
    public static double quetalesDolares(double quetzales){
        double dolares = quetzales * (1/7.5);
        return dolares;
    }
    public static double DolaresAquetzales (double dolares){
        double quetzales  = dolares * (1/7.6);
        return quetzales;
    }
    public static double quetzales (double pesoMX){
        double quetzales  = pesoMX * (1/7.6);
        return pesoMX;
    }
    public static double pesoMX (double quetzales){
        double pesoMX  = quetzales * (1/7.6);
        return quetzales;
    }
}

