package javalab;

/**
 * Clase Jugador, se encarga de guardar el nombre del jugador
 */
public class Player {
    /**
     * Nombre del jugador
     */
    private String name;

    /**
     * Constructor del Objeto Player
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return Devuelve el nombre del jugador
     */
    public String getName() {
        return name;
    }
}
