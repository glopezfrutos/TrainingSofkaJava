package javalab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO Clase Lógica de juego
 */
public class GameLogic {
    /**
     * ArrayList de Jugadores
     */
    static ArrayList<Player> players = new ArrayList<Player>();


    /**
     * Verdadero si hay un usuario activo
     */
    private static boolean activePlayer = false;

    static int activePlayerIndex = -1;

    /**
     * Preguntas
     */
    static final Question[][] questions = new Question[5][5];

    /**
     * Inicialización de Preguntas
     */
    public static void declareQuestion(){
        questions[0][0] = new Question("¿Cuál es el nombre del río más largo del mundo?",
                "Río Nilo", "Río Amazonas", "Río Danubio",
                "Río Uruguay",
                2);
        questions[0][1] = new Question("¿Cuál es el océano más grande del mundo?","Océano Antártico","Océano Atlántico","Océano Indico", "Oceano Pacífico",4);
        questions[0][2] = new Question("¿Cuál es el país más grande del mundo?","China","Brasil","Rusia","India",3);
        questions[0][3] = new Question("¿Cuál es el país más poblado de la tierra?","Estados Unidos","China","Rusia","India",2);
        questions[0][4] = new Question("¿En qué país se encuentra ubicada la Casa Rosada?","Argentina","Colombia","Chile","Perú",1);

        questions[1][0] = new Question("¿Cuándo terminó la II Guerra Mundial?","2001","1914","1953","1945",4);
        questions[1][1] = new Question("¿En qué año llegó Cristobal Colón a América?","1429","1492","1592","1942",2);
        questions[1][2] = new Question("¿Quién es el padre del psicoanálisis?","Freud","Jung","Skinner","Watson",1);
        questions[1][3] = new Question("¿Cuál es el libro sagrado de los musulmanes?","La biblia","El talmud","El corán","Las mil y una noches",3);
        questions[1][4] = new Question("¿En qué país se usó la primera bomba atómica?","Estados Unido","Japón","China","Korea",2);

        questions[2][0] = new Question("¿Cuántos litros de sangre tiene una persona adulta?","Entre 2 y 4 litros","Entre 4 y 6 litros","10 litros","0,5 litros",2);
        questions[2][1] = new Question("¿Quién es el autor de la frase \"Pienso, luego existo\"?","Platón","Galileo Galilei","Descartes","Sócrates",3);
        questions[2][2] = new Question("¿Cuál es el grupo de palabras escritas correctamente?","Metamorfosis, extranjero, diversidac, equilivrio","Metaformosis, estranjero, diversidad, ekilibrio","Metamorfosis, extrangero, dibersidad, equilibrio","Metamorfosis, extranjero, diversidad, equilibrio",4);
        questions[2][3] = new Question("¿Cuanto es 12 x 10 x 0","12","120","1","0",4);
        questions[2][4] = new Question("¿Cuál es el libro más vendido en el mundo después de la Biblia?","El Señor de los Anillos","Don Quijote de la Mancha","El Principito","Cien años de Soledad",2);

        questions[3][0] = new Question("¿Cuántos decimales tiene el número pi π?","Dos","Cien","Infinitos","Muchos",3);
        questions[3][1] = new Question("La sal común está formada por dos elementos, ¿cuáles son?","Sodio y potasio","Sodio y cloro","Sodio y carbono","Potasio y cloro",2);
        questions[3][2] = new Question("¿Cuántos jugadores por equipo participan en un partido de voleibol?","3","5","6","8",3);
        questions[3][3] = new Question("¿Quién pintó la obra \"Guernica\"?","Diego Rivera","Salvador Dalí","Paul Cézanne","Pablo Picasso",4);
        questions[3][4] = new Question("¿Cuánto tiempo tarda la luz del Sol en llegar a la Tierra?","8 minutos","12 minutos","8 segundos","12 horas",1);

        questions[4][0] = new Question("¿En qué orden se presentaron los modelos atómicos?","Thomson, Dalton, Rutherford, Bohr","Dalton, Thomson, Rutherford, cuántico","Bohr, Rutherford, cuántico, Einstein","Dalton, Einstein, cuántico, Sheldon Cooper",2);
        questions[4][1] = new Question("¿En qué país de Africa el español es la lengua oficial?","Cabo Verde","Sierra Leona","Guinea ecuatorial","Liberia",3);
        questions[4][2] = new Question("¿Cuales de las siguientes son enfermedades de transmisión sexual ETS?","Gonorrea, clamidia, sífilis","Chikunguya, malaria, herpes genital","Botulismo, cistitis, chagas","Gonorrea, sida, gripe",1);
        questions[4][3] = new Question("¿Cuál es el animal terrestre más grande en la actualidad?","Diplodocus","Tiburón blanco","Ballena azul","Elefante africano",4);
        questions[4][4] = new Question("¿Cuál es el tipo sanguíneo considerado como donante universal?","Tipo A","Tipo B","Tipo 0","Ninguno de los anteriores",3);
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
        String playerName = scanner.nextLine();
        System.out.println("¡Hola " + playerName + "!\n");
        players.add(new Player(playerName));
        setActivePlayer(true);
    }

    /**
     * Setter activePlayer
     * @param trueOrFalse true
     */
    public static void setActivePlayer(boolean trueOrFalse) {
        activePlayer = trueOrFalse;
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
     * @return Devuelve un String con el podio
     */
    public static String checkPodium() {
        if (players.isEmpty()) {
            return "Vacante";
        }
        return "* Mejores puntajes *" +
                "\n1er lugar:" + compareTo(players) +
                "\n2do lugar:" +
                "\n3er lugar:";
    }

    /**
     * @param arrayList Dado el arraylist de Scores,
     * @return devuelve el mejor Score
     * TODO devolver los tres mejores
     */
    public static String compareTo(ArrayList<Player> arrayList) {
        Player mayor = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getScore() > mayor.getScore()) {
                mayor = arrayList.get(i);
            }
        }
        return mayor.toString();
    }


    public static boolean checkAnswer(int answer, int questionNumber) {
        return answer == questionNumber;
    }

    // TODO Chequea en qué nivel está, si es menor a 5 avanza al siguiente. Si es igual a 5,
    //  graba el Score y vuelve al menú principal
    public static void checkLevel() {
    }
}
