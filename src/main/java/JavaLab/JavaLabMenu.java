package JavaLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaLabMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        // Menú
        while (!exit) {
            System.out.println();
            System.out.println("*** ¡Te damos la bienvenida al juego! ***" +
                    "\nPor favor, elijí una opción introduciendo el número correspondiente:" +
                    "\n1. Nuevo juego" +
                    "\n2. Ver podio" +
                    "\n3. Cambiar el nombre de usuario" +
                    "\n4. Salir");

            // Comprueba si el usuario ingresó un número válido y llama al método correspondiente.
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> newGame();
                    case 2 -> getPodium();
                    case 3 -> newPlayer();
                    case 4 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("Elija una opción entre 1 y 18 o 0 para salir");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, elija una de las siguientes opciones para ordenarlos:");
                scanner.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }

    public static void newGame() {
        if (isActiveUser()) {
            Game.game();
        }
    }

    public static boolean isActiveUser() {
        return true;
    }

    public static void newPlayer(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Por favor, introducí tu nombre para comenzar a jugar");
//        String newUser = scanner.nextLine();
    }

    public static void getPodium() {
        System.out.println(Players.checkPodium() +
                "\nPresione enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
