package programas;

import java.util.Scanner;

public class MayorMenor3 {

public static void mayorymenor(){
    Scanner scannNumeros = new Scanner(System.in);

    System.out.println("[n1]: ");
    double n1 = scannNumeros.nextDouble();

     System.out.println("[n2]: ");
    double n2 = scannNumeros.nextDouble();

    System.out.println("[n3]: ");
    double n3 = scannNumeros.nextDouble();

if  (n1 > n2 && n1 > n3){
    System.out.println("El nunmero mayor es:" + n1);
    System.out.println("El nunmero manor es:" + n2);
} else {
    if (n2 > n1 && n2 > n3){
        System.out.println("El numero mayor es: " + n2);
        System.out.println("El nunmero manor es:" + n1);
    } else {
        System.out.println("El numero mayor es: " + n3);
        System.out.println("El nunmero manor es:" + n1);
    }
}
}
}