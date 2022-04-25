package javalab;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaLabMenu {
    /**
     * ArrayList de Jugadores
     */
    private static ArrayList<Player> players = new ArrayList<Player>();

    /**
     * ArrayList de Partidas
     */
    private static ArrayList<Game> games = new ArrayList<Game>();

    /**
     * ArrayList de Preguntas
     */
    private static ArrayList<Question> questions = new ArrayList<Question>();

    /**
     * Verdadero si hay un usuario activo
     */
    private static boolean activePlayer = false;

    /**
     * Método principal, en la que se ejecuta el menú principal.
     * @param args None
     */
    public static void main(String[] args) {
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
            System.out.println("\nEncabezado del juego." +
                    "\nNivel, Premio acumulado" +
                    "\ntoString de Question con opciones 1, 2, 3 y 4." +
                    "\n5. Retirarse");


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

    //Metodo para jugar

    public static void juego(){
        //arregloAux

        Question auxPre[5];


        for (int i = 0; i < auxPre.length; i++){
            auxPre[i] = Game.
        }
        do {
            System.out.println();
        }while (true);

    }

    /**
     * Agrega un Objeto Game al ArrayList de partidas.
     */
    public static void newGame() {

    }

    /**
     * @return Devuelve si hay un usuario activo.
     */
    public static boolean isActivePlayer() {
        return activePlayer;
    }

    /**
     * Agrega un Objeto Player al ArrayList de jugadores con el String ingresado por el usuario.
     */
    public static void newPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introducí tu nombre para comenzar a jugar");
        String newPlayer = scanner.nextLine();
        players.add(new Player(newPlayer));
        setActivePlayer(true);
    }

    /**
     * Muestra en consola el String de los tres jugadores con mejor puntaje
     */
    public static void getPodium() {
        System.out.println(checkPodium() +
                "\nPresione enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * @return Devuelve un String del jugador con mejor puntaje
     * TODO Devolver los tres mejores
     */
    public static String checkPodium() {
        if (games.isEmpty()) {
            return "Vacante";
        }
        return "1er lugar: " + compareTo(games);
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

    public static void setActivePlayer(boolean activePlayer) {
        JavaLabMenu.activePlayer = activePlayer;
    }

    public static String compareTo(ArrayList<Game> arrayList) {
        Game mayor = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getScore() > mayor.getScore()) {
                mayor = arrayList.get(i);
            }
        }
        return mayor.toString();
    }
}
