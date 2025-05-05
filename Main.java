import java.util.Scanner;
import programas.Opciones;
import vistas.vista;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int opcion;

        

         do {
            vistas.vista.banner();
            programas.Opciones.opciones();

            //menu
            System.out.println("[0] salir");
            System.out.print("[?] ");
            opcion = scanner.nextInt();



            // opciones
            switch (opcion) {
                case 1:
                   System.out.println("----------------------------");
                   programas.Sumar.suma();
                   System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("---------------------------");
                    programas.Resta.restar();
                    System.out.println("----------------------");
                    break;
                case 3:
                    System.out.println("---------------------------");
                    programas.Multi.multiplicacion();
                    System.out.println("----------------------");
                    break;
                case 4:
                    System.out.println("---------------------------");
                    programas.Division.dividir();
                    System.out.println("-------------------------");
                    break;
                case 5:
                    System.out.println("---------------------------");
                    programas.Modulo.modulos();
                    System.out.println("-------------------------");
                    break;
                case 6:
                    System.out.println("---------------------------");
                    programas.Promediotres.promedio();
                    System.out.println("-------------------------");
                    break;
                case 7:
                    System.out.println("---------------------------");
                    programas.MayorMenor2.MayorMenor();
                    System.out.println("-------------------------");
                    break;
                case 8:
                System.out.println("---------------------------");
                programas.MayorMenor3.mayorymenor();
                System.out.println("-------------------------");
                break;
                case 9:
                System.out.println("---------------------------");
                programas.MaCm.macm();
                System.out.println("-------------------------");
                break;
                case 10:
                System.out.println("---------------------------");
                programas.KgaG.kgAg();
                System.out.println("-------------------------");
                break;

                    default:
                    System.out.println("Opción no válida");
                    break;
    
            }
         } while (opcion != 0);

    }
}