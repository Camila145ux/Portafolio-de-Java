package programas;

public class Opciones {
   static String lista [] = {
        "la suma de dos numeros ",
        "resta de dos numeros",
        "multiplicacion de dos numeros",
        "division de dos numeros",
        "Modulo(residuo de una division)",
        "Promedio de tres numeros",
        "Numero mayor y menor entre dos numeros",
        "Numero mayor y menor entre tres numeros",
        "Conversion de metros a centimetros",
        "Conversion de kilogramos a gramos"
    };

    //METODO PARA MOSTRAR OPCIONES
    public static void opciones() {
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+ (i+1) +"]" + lista[i]);
        }
    }

}