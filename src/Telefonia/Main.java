package Telefonia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList <Principal> llamadas = new ArrayList<>();
        Principal tel = new Principal();



        boolean salir = false;

        while (!salir){

            System.out.println("BIENVENIDO");
            System.out.println("1. Registrar llamada: ");
            System.out.println("2. LLamadas: ");
            System.out.println("3. Consolidado: ");
            System.out.println("4. Reiniciar: ");
            System.out.println("5. salir");

            int opc = teclado.nextInt();

            switch (opc){
                case 1:
                    System.out.println("¿Ha que linea desea registrar llamada?: ");
                    break;
                case 2:
                    Local local = new Local(1800, 3, 1, 30045689, 06, "Bogotá");
                    System.out.println(local.toString());
                    LagaDistancia lagaDistancia = new LagaDistancia(7200, 6, 2, 1800900, 123, "Mexico");
                    System.out.println(lagaDistancia.toString());
                    Celular celular = new Celular(4250, 5, 1, "3138691979");
                    System.out.println(celular.toString());
                    break;
                case 3:
                    System.out.println(llamadas.size());
                    break;
                case 4:
                    System.out.println("en proceso...");
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Hasta la proxima");

            }
        }
    }
}