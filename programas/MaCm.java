package programas;

import java.util.Scanner;

public class MaCm {
    public static void macm (){
    Scanner sc = new Scanner(System.in);

    System.out.println("[metros]: ");
    double m = sc.nextDouble();

    double centimetros = m * 100;

    System.out.println(m + "metros son centimeros" + centimetros);
    }
}