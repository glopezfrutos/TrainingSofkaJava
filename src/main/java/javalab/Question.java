package javalab;

public class Question implements IQuestion {
    private final String enunciado;
    private final String opcion1;
    private final String opcion2;
    private final String opcion3;
    private final String opcion4;
    private final int respuestaCorrecta;

    public Question(String enunciado, String opcion1, String opcion2, String opcion3, String opcion4, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public void printQuestions() {
        System.out.println(enunciado +
                "\n 1. " + opcion1 +
                "\n 2. " + opcion2 +
                "\n 3. " + opcion3 +
                "\n 4. " + opcion4);
    }

    @Override
    public int getCorrectAnswer() {
        return respuestaCorrecta;
    }
}
