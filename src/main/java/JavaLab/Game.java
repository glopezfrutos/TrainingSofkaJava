package JavaLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    //Asignación manual de preguntas
    private static Question nivel1[] = new Question[5];
    private static Question nivel2[] = new Question[5];
    private static Question nivel3[] = new Question[5];
    private static Question nivel4[] = new Question[5];
    private static Question nivel5[] = new Question[5];


private static void declareQuestion(){

        nivel1[0] = new Question("¿Cuál es el nombre del río más largo del mundo?", "Río Nilo", "Río Amazonas", "Río Danubio", "Río Uruguay", 2);
        nivel1[1] = new Question("¿Cuál es el océano más grande del mundo?","Océano Antártico","Océano Atlántico","Océano Índico","Océano Pacífico",4);
        nivel1[2] = new Question("¿Cuál es el país más grande del mundo?","China","Brasil","Rusia","India",3);
        nivel1[3] = new Question("¿Cuál es el país más poblado de la tierra?","Estados Unidos","China","Rusia","India",2);
        nivel1[4] = new Question("¿En qué país se encuentra ubicada la Casa Rosada?","Argentina","Colombia","Chile","Perú",1);

        nivel2[0] = new Question("¿Cuándo terminó la II Guerra Mundial?","2001","1914","1953","1945",4);
        nivel2[1] = new Question("¿En qué año llegó Cristobal Colón a América?","1429","1492","1592","1942",2);
        nivel2[2] = new Question("¿Quién es el padre del psicoanálisis?","Freud","Jung","Skinner","Watson",1);
        nivel2[3] = new Question("¿Cuál es el libro sagrado de los musulmanes?","La biblia","El talmud","El corán","Las mil y una noches",3);
        nivel2[4] = new Question("¿En qué país se usó la primera bomba atómica?","Estados Unido","Japón","China","Korea",2);

        nivel3[0] = new Question("¿Cuántos litros de sangre tiene una persona adulta?","Entre 2 y 4 litros","Entre 4 y 6 litros","10 litros","0,5 litros",2);
        nivel3[1] = new Question("¿Quién es el autor de la frase \"Pienso, luego existo\"?","Platón","Galileo Galilei","Descartes","Sócrates",3);
        nivel3[2] = new Question("¿Cuál es el grupo de palabras escritas correctamente?","Metamorfosis, extranjero, diversidac, equilivrio","Metaformosis, estranjero, diversidad, ekilibrio","Metamorfosis, extrangero, dibersidad, equilibrio","Metamorfosis, extranjero, diversidad, equilibrio",4);
        nivel3[3] = new Question("¿Cuanto es 12 x 10 x 0","12","120","1","0",4);
        nivel3[4] = new Question("¿Cuál es el libro más vendido en el mundo después de la Biblia?","El Señor de los Anillos","Don Quijote de la Mancha","El Principito","Cien años de Soledad",2);

        nivel4[0] = new Question("¿Cuántos decimales tiene el número pi π?","Dos","Cien","Infinitos","Muchos",3);
        nivel4[1] = new Question("La sal común está formada por dos elementos, ¿cuáles son?","Sodio y potasio","Sodio y cloro","Sodio y carbono","Potasio y cloro",2);
        nivel4[2] = new Question("¿Cuántos jugadores por equipo participan en un partido de voleibol?","3","5","6","8",3);
        nivel4[3] = new Question("¿Quién pintó la obra \"Guernica\"?","Diego Rivera","Salvador Dalí","Paul Cézanne","Pablo Picasso",4);
        nivel4[4] = new Question("¿Cuánto tiempo tarda la luz del Sol en llegar a la Tierra?","8 minutos","12 minutos","8 segundos","12 horas",1);

        nivel5[0] = new Question("¿En qué orden se presentaron los modelos atómicos?","Thomson, Dalton, Rutherford, Bohr","Dalton, Thomson, Rutherford, cuántico","Bohr, Rutherford, cuántico, Einstein","Dalton, Einstein, cuántico, Sheldon Cooper",2);
        nivel5[1] = new Question("¿En qué país de África el español es la lengua oficial?","Cabo Verde","Sierra Leona","Guinea ecuatorial","Liberia",3);
        nivel5[2] = new Question("¿Cuales de las siguientes son enfermedades de transmisión sexual ETS?","Gonorrea, clamidia, sífilis","Chikunguya, malaria, herpes genital","Botulismo, cistitis, chagas","Gonorrea, sida, gripe",1);
        nivel5[3] = new Question("¿Cuál es el animal terrestre más grande en la actualidad?","Diplodocus","Tiburón blanco","Ballena azul","Elefante africano",4);
        nivel5[4] = new Question("¿Cuál es el tipo sanguíneo considerado como donante universal?","Tipo A","Tipo B","Tipo 0","Ninguno de los anteriores",3);

    }
    public static void game() {


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;
        Game.declareQuestion();

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
