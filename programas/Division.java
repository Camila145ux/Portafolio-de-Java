package programas;
import java.util.Scanner;

public class Division {

public static void dividir(){
    Scanner scannNumeros = new Scanner(System.in);

    System.out.println("[n1]: ");
    double n1 = scannNumeros.nextDouble();

     System.out.println("[n2]: ");
    double n2 = scannNumeros.nextDouble();

    System.out.println("[Re]: " + (n1 / n2));

    if (n2 == 0) {
    System.out.print("No es posible dividir");
    } else {
        System.out.println("[Re]: " + (n1 + n2));
    }
     if (n1 == 0) {
    System.out.print("No es posible dividir");
    } else {
        System.out.println("[Re]: " + (n1 + n2));
    }


}
}
