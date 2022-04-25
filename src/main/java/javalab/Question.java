package javalab;

public class Question {
    private String enunciado;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private int respuesta;

    public Question(String enunciado, String opcion1, String opcion2, String opcion3, String opcion4, int respuesta) {
        this.enunciado = enunciado;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuesta = respuesta;
    }

    public void printQuestions() {
        System.out.println("\n 1. " + opcion1 + "\n 2. " + opcion2 +
                "\n 3. " + opcion3 + "\n 4. " + opcion4);
    }

    public int respuesta() {
        return respuesta;
    }
}
