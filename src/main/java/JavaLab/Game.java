package JavaLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        // Menú
        while (!exit) {
            System.out.println("\nEncabezado del juego." +
                    "\nNivel, Premio acumulado" +
                    "\ntoString de Question con opciones 1, 2, 3 y 4." +
                    "\n5. Retirarse");

            // Comprueba si el usuario ingresó un número válido y llama al método correspondiente.
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> checkAnswer(1);
                    case 2 -> checkAnswer(2);
                    case 3 -> checkAnswer(3);
                    case 4 -> checkAnswer(4);
                    case 5 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("Elija el nro. de opción para continuar");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Por favor, elija el nro. de opción para continuar");
                scanner.next();
            }
        }
        System.out.println("El juego ha finalizado.");
    }

    // TODO Chequea si la opción elegida es la correcta
    public static void checkAnswer(int answer) {
        // Si es correcta:
        checkLevel();
        // Si no vuelve al menú principal
    }

    // TODO Chequea en qué nivel está, si es menor a 5 avanza al siguiente. Si es igual a 5,
    //  graba el Score y vuelve al menú principal
    public static void checkLevel() {
    }
}
