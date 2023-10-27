import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicacion Calculadora ****");
        //Mostramos el menu
        mostrarMenu();
        while (true) {
            Scanner consola = new Scanner(System.in);
            try {
                System.out.print("Operacion a realizar? ");
                var operacion = Integer.parseInt(consola.nextLine());
                //revisar que este dentro de las operaciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Operacion erronea " + operacion);
                }
                //Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }//fin  try
        }//fin while
    }//fin main

    private static void mostrarMenu() {
        System.out.println("""
                1.  Suma
                2.  Resta
                3.  Multiplicacion
                4.  Dividir
                5.  Salir
                """);

    }
    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona valor operando 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {//suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {//resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);

            }
            case 3 -> { //multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);

            }
            case 4 -> {//division
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
}
