import colegio.Escuela;
import colegio.PrimeroPrimaria;
import conversor.FcCf;
import Lista.Listadecompras;
import calculadora.CalcularEdad;
import interfaz_grafica.Banner;
import libros.Biblioteca;
import mis_Metodos.ListaOpciones;
import IMC.IMC;

import java.awt.*;
import java.util.Scanner;
import calculadora.AritmeticaBasica;
import mis_Metodos.mismetodos;
import conversor.unidades;
import conversor.conversorDeMonedas;

import javax.swing.*;
import java.util.Scanner;


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

        //seccion grafica

        //VENTANA

        JFrame miVentana = new JFrame();
        miVentana.setBounds(0,0,500,600);
        miVentana.setLayout(null);


        // PANEL DEL BANNER
        JPanel banner = new JPanel();
        banner.setBackground(Color.blue);
        banner.setBounds(0,0,500,300);

        miVentana.add(banner);
        miVentana.setVisible(true);

        JFrame frame = new JFrame("Rockema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);


        JPanel textPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 1; i <= 6; i++) {
            JLabel label = new JLabel("G3", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            textPanel.add(label);
        }
        mainPanel.add(textPanel, BorderLayout.CENTER);

        JButton button = new JButton("Botón");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 200, 10, 10));
        buttonPanel.add(button);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        frame.setVisible(true);


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

                case 4: break;
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






