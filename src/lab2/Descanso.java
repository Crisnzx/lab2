package lab2;

public class Descanso {
    static final int IDEAL_HORAS_DESCANSO_POR_SEMANA = 26;

    private int horasDescanso;
    private int numeroSemanas = 1;
    private String emoji;
    private String estado = "cansado";

    public Descanso() {

    }

    public void definirEmoji(String valor) {
        this.emoji = valor;
    }

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    private String tratarEmoji() {
        if (this.emoji != null) {
            return " - " + this.emoji;
        }
        return "";
    }

    public String getStatusGeral() {
        double horasDescansoPorSemana = horasDescanso / numeroSemanas;
        boolean estaCansado = horasDescansoPorSemana < IDEAL_HORAS_DESCANSO_POR_SEMANA;

        if (estaCansado && this.estado.equals("descansado")) {
            this.estado = "cansado";
            this.emoji = null;
        }
        if (!estaCansado && this.estado.equals("cansado")) {
            this.estado = "descansado";
            this.emoji = null;

        }

        return this.estado + tratarEmoji();
    }

}
