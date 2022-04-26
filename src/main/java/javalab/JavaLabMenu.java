package javalab;

import java.util.InputMismatchException;
import java.util.Scanner;
import static javalab.GameLogic.*;

public class JavaLabMenu {
    /**
     * Método principal, en la que se ejecuta el menú principal.
     * @param args None
     */
    public static void main(String[] args) {
        declareQuestion();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

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
                    case 1 -> {
                        if (isActivePlayer()) {
                            play();
                        } else {
                            newPlayer();
                            play();
                        }
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
     *  Submenú juego
     */
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;
        while (!exit) {
            System.out.println("Pregunta nivel " + players.get(activePlayerIndex).getLevel() + ":");
            int questionNumber = 0;
            Question actualQuestion = questions[players.get(activePlayerIndex).getLevel()][questionNumber];
            actualQuestion.printQuestions();
            System.out.println(" 5. Retirarse");
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        if (1 == actualQuestion.respuestaCorrecta()) {
                            players.get(activePlayerIndex).levelUp();
                            exit = true;
                            play();
                        }
                    }
                    case 2 -> {
                        if (checkAnswer(2, actualQuestion.respuestaCorrecta())) {
                            players.get(activePlayerIndex).levelUp();
                            exit = true;
                            play();
                        }
                    }
                    case 3 -> {
                        if (checkAnswer(3, actualQuestion.respuestaCorrecta())) {
                            players.get(activePlayerIndex).levelUp();
                            exit = true;
                            play();
                        }
                    }
                    case 4 -> {
                        if (checkAnswer(4, actualQuestion.respuestaCorrecta())) {
                            players.get(activePlayerIndex).levelUp();
                            exit = true;
                            play();
                        }
                    }
                    case 5 -> {
                        System.out.println("La partida ha finalizado.");
                        exit = true;
                    }
                    default -> System.out.println("Elija el nro. de opción para continuar");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Por favor, elija el nro. de opción para continuar");
                scanner.next();
            }
        }
        // TODO Actualizar score
        System.out.println("Volviendo al menú principal...");
    }
}
