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
     * Puntaje obtenido
     */
    private int score;

    /**
     * Nivel
     */
    private int level;

    /**
     * Constructor del Objeto Player
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.level = 0;
        GameLogic.activePlayerIndex++;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void levelUp() {
        this.level++;
    }

    /**
     * @return Devuelve el puntaje del jugador
     */
    public int getScore() {
        return score;
    }

    /**
     * @return Devuelve el nivel del jugador
     */
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "\nJugador: " + name +
                "\nPuntaje" + score;
    }
}
