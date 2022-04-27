package javalab;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javalab.GameLogic.*;

public class JavaLabMenu {
    /**
     * Método principal, en la que se ejecuta el menú principal.
     *
     * @param args None
     */
    public static void main(String[] args) {
        GameLogic.declareQuestion();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("\n\n*** ¡Te damos la bienvenida al juego! ***" +
                    "\nPor favor, elijí una opción introduciendo el número correspondiente:" +
                    "\n1. Nuevo juego" +
                    "\n2. Ver podio" +
                    "\n3. Cambiar el nombre de usuario" +
                    "\n4. Salir");
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        if (!isActivePlayer()) {
                            newPlayer();
                        }
                        play();
                    }
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

    /**
     * Submenú juego
     */
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;
        Player actualPlayer = players.get(activePlayerIndex);
        while (!exit) {
            System.out.println("\nPregunta nivel " + (actualPlayer.getLevel() + 1) + ":");
            int questionNumber = getNumber();
            Question actualQuestion = questions[actualPlayer.getLevel()][questionNumber];
            actualQuestion.printQuestions();
            System.out.println(" 5. Retirarse con el pozo.");
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> exit = handleAnswer(1, actualQuestion, actualPlayer);
                    case 2 -> exit = handleAnswer(2, actualQuestion, actualPlayer);
                    case 3 -> exit = handleAnswer(3, actualQuestion, actualPlayer);
                    case 4 -> exit = handleAnswer(4, actualQuestion, actualPlayer);
                    case 5 -> {
                        System.out.println("La partida ha finalizado." +
                                "\nTe retiras con u$s " + actualPlayer.getActualScore() + ".");
                        actualPlayer.setHistoricalScore();
                        actualPlayer.resetLevelAndScore();
                        exit = true;
                    }
                    default -> System.out.println("Elija el nro. de opción para continuar");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Por favor, elija el nro. de opción para continuar");
                scanner.next();
            }
        }
    }
}
