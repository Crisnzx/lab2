package lab2;
public class Disciplina {
    static final double MEDIA_APROVACAO = 7;

    private String nome;
    private double[] notas = new double[4];
    private int horasEstudo = 0;

    public Disciplina(String nomeDisciplina) {
        this.nome = nomeDisciplina;
    }

    private double calculaMedia() {
        double sumNotas = 0;
        for (double nota: this.notas) {
            sumNotas += nota;
        }
        return sumNotas / notas.length;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        notas[nota - 1] = valorNota;
        calculaMedia();
    }

    public boolean aprovado() {
        return calculaMedia() >= MEDIA_APROVACAO;
    }

    public String toString() {
        StringBuilder notasString = new StringBuilder();
        notasString.append("[");

        for (int i = 0; i < this.notas.length - 1; i++) {
            notasString.append(this.notas[i] + ", ");
        }

        notasString.append(this.notas[notas.length - 1] + "]");
        
        return this.nome + " " + this.horasEstudo + " " + calculaMedia() + " " + notasString;
    }

}
