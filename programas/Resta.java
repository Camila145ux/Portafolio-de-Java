package programas;
import java.util.Scanner;

public class Resta {

public static void restar(){
    Scanner scannNumeros = new Scanner(System.in);

    System.out.println("[n1]: ");
    double n1 = scannNumeros.nextDouble();

     System.out.println("[n2]: ");
    double n2 = scannNumeros.nextDouble();

    System.out.println("[Re]: " + (n1 - n2));

}
}
