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
    private int actualScore;

    /**
     * Puntaje más alto obtenido
     */
    private int historicalScore;

    /**
     * Nivel
     */
    private int level;

    /**
     * Constructor del Objeto Player
     *
     * @param name nombre ingresado por el jugador
     */
    public Player(String name) {
        this.name = name;
        this.actualScore = 0;
        this.historicalScore = 0;
        this.level = 0;
        GameLogic.activePlayerIndex++;
    }

    /**
     * Sube un nivel
     */
    public void levelUp() {
        this.level++;
    }

    /**
     * Actualiza el puntaje
     */
    public void scoreUp() {
        this.actualScore = this.actualScore + 100 * this.level;
    }

    /**
     * Vuelve el puntaje y el nivel a 0
     */
    public void resetLevelAndScore() {
        this.level = 0;
        this.actualScore = 0;
    }

    /**
     * Guarda el puntaje más alto obtenido
     */
    public void setHistoricalScore() {
        if (this.historicalScore < this.actualScore)
            this.historicalScore = this.actualScore;
    }

    /**
     * @return Devuelve el puntaje actual del jugador
     */
    public int getActualScore() {
        return actualScore;
    }

    /**
     * @return Devuelve el puntaje histórico más alto del jugador
     */
    public int getHistoricalScore() {
        return historicalScore;
    }

    /**
     * @return Devuelve el nivel actual del jugador
     */
    public int getLevel() {
        return level;
    }

    /**
     * @return devuelve un String con el nombre del jugador y su puntaje histórico más alto
     */
    @Override
    public String toString() {
        return "\nJugador: " + name +
                "\nPuntaje: " + historicalScore +
                "\n";
    }
}
