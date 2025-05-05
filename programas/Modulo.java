package programas;

import java.util.Scanner;

public class Modulo {

public static void modulos(){
    Scanner scannNumeros = new Scanner(System.in);

    System.out.println("[n1]: ");
    double n1 = scannNumeros.nextDouble();

     System.out.println("[n2]: ");
    double n2 = scannNumeros.nextDouble();

    System.out.print("[Re]: " + (n2 % n1));

}
}
