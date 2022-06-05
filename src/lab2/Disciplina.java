package lab2;

import java.util.Arrays;

public class Disciplina {
    static final double MEDIA_APROVACAO = 7;

    private String nome;
    private double[] notas;
    private int[] pesoNotas;
    private int horasEstudo = 0;

    public Disciplina(String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.notas = new double[4];
        this.pesoNotas = new int[4];
        Arrays.fill(this.pesoNotas, 1);
    }

    public Disciplina(String nomeDisciplina, int numeroNotas) {
        this.nome = nomeDisciplina;
        this.notas = new double[numeroNotas];
        this.pesoNotas = new int[numeroNotas];
        Arrays.fill(this.pesoNotas, 1);
    }

    public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesoNotas) {
        this.nome = nomeDisciplina;
        this.notas = new double[numeroNotas];
        this.pesoNotas = pesoNotas;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
        calculaMedia();
    }

    public boolean aprovado() {
        return calculaMedia() >= MEDIA_APROVACAO;
    }

    public String toString() {
        return this.nome + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }

    private double calculaMedia() {
        double somaNotas = 0;
        int somaPeso = 0;
        for (int i = 0; i < this.notas.length; i++) {
            somaNotas += (this.notas[i] * this.pesoNotas[i]);
        }

        for (int pesoNota : this.pesoNotas) {
            somaPeso += pesoNota;
        }

        return somaNotas / somaPeso;
    }

}
