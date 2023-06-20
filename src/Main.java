import conicas2.Elipse;
import conicas2.Parabola_Equipo2;
import conicas2.circunferencia_grupo2;
import conicas2.hiperbole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Llamamos al m[etodo para el scanner
        Scanner entrada = new Scanner(System.in);

        /* En esta seccion agregaremos las instancias, dependiendo de cada sub equipo y conica */
        //Parabola
        Parabola_Equipo2 figura3  = new Parabola_Equipo2(6.3f, 7.9f,8.7f, 6.12f,4.5f);
        Parabola_Equipo2 figura4  = new Parabola_Equipo2(2.33f, 3.33f, 5.55f, 6.66f, 7.77f);

        //Hiperbola
        hiperbole figura1 = new hiperbole(2.63, 5.78);
        hiperbole figura2 = new hiperbole(6.33, 12.96);

        //Circunferencia
        circunferencia_grupo2 figura5 = new circunferencia_grupo2(6.37f, 9.99f);
        circunferencia_grupo2 figura6 = new circunferencia_grupo2(1.23f, 4.635f);

        //Elipse
        Elipse figura7 = new Elipse(6.453, 12.44);
        Elipse figura8 = new Elipse(9.99, 6.66);

        //Creamos la pantalla del menu principal
        System.out.println("\n\t*************************Figuras 3D*************************");

        System.out.println("\nMENU DE OPCIONES");

        System.out.println("\n 1) Parabola");
        System.out.println(" 2) Hiperbole");
        System.out.println(" 3) Circunferencia");
        System.out.println(" 4) Elipse");

        System.out.println("\nSeleccione una opcion: ");
        int opt = entrada.nextInt();


        switch (opt) {
            case 1 -> {
                System.out.println("\nPARABOLA");
                System.out.println("\n\t* Primera instancia: ");
                figura3.Parabola_Equipo2_ImpVer();
                System.out.println("\n\t* Segunda instancia: ");
                figura4.Parabola_Equipo2_ImpVer();
            }
            case 2 -> {
                System.out.println("\nHIPERBOLE");
                System.out.println("\n\t* Primera instancia: ");
                figura1.variables();
                System.out.println("\n\t* Segunda instancia: ");
                figura2.variables();
            }
            case 3 -> {
                System.out.println("\nCIRCUNFERENCIA");
                System.out.println("\n\t* Primera instancia: ");
                figura5.imprimir_Datos();
                System.out.println("\n\t* Segunda instancia: ");
                figura6.imprimir_Datos();
            }
            case 4 -> {
                System.out.println("\nELIPSE");
                System.out.println("\n\t* Primera instancia: ");
                figura7.imprimir_Datos();
                System.out.println("\n\t* Segunda instancia: ");
                figura8.imprimir_Datos();
            }
            default -> System.out.println("ERROR");
        }

    }
}