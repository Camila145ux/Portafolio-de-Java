package programas;
import java.util.Scanner;

public class KgaG {
    public static void kgAg() {
    
        double kg , g;

        Scanner menu = new Scanner(System.in);
        System.out.println("Kilogramos:");
        kg = menu.nextDouble();
        g = kg * 1000;
        System.out.println("El peso en gramos es: " + g);
    }
}