package javalab;

/**
 * Clase Partida, se encarga de guardar el nro de partida, el nombre del juegador, nivel y su puntaje
 */
public class Game {
    /**
     * Nombre del jugador
     */
    private String player;

    /**
     * Puntaje obtenido
     */
    private int score;

    private int level;

    /**
     * Constructor del Objeto Partida
     * @param player Nombre del jugador
     * @param score Puntaje obtenido
     */
    public Game(String player, int score) {
        this.player = player;
        this.score = score;
        this.level = 1;
    }

    /**
     * @return Devuelve el nombre del jugador
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @return Devuelve el puntaje del jugador en esta partida
     */
    public int getScore() {
        return score;
    }

    /**
     * @return Devuelve el nivel actual del jugador en esta partida
     */
    public int getLevel() {
        return level;
    }

    /**
     * Subir de nivel
     */
    public void levelUp() {
        this.level++;
    }

    @Override
    public String toString() {
        return "Jugador: " + player +
                "\nPuntaje" + score;
    }
}
