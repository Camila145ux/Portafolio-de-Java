package programas;

import java.util.Scanner;

public class MayorMenor2 {
public static void MayorMenor() {
Scanner scannNumeros = new Scanner(System.in);

System.out.println("[n1]: ");
double n1 = scannNumeros.nextDouble();

System.out.println("[n2]: ");
double n2 = scannNumeros.nextDouble();
    if (n1 > n2){
        System.out.println("EL numero mayor es: " + n1);
        System.out.println("EL numero mayor es: " + n2);
    } else {
        System.out.println("EL numero mayor es: " + n2);
        System.out.println("EL numero mayor es: " + n1);
    }

}
}
