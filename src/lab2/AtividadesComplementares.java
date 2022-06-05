package lab2;

import java.util.ArrayList;

public class AtividadesComplementares {

    private int[] horasEstagios = new int[4];
    private int[] mesesEstagios = new int[4];
    private int[] projetos = new int[16];
    private ArrayList<Double> cursos = new ArrayList<Double>();

    public void adicionarEstagio(int horas) {
        for (int i = 0; i < this.horasEstagios.length; i++) {
            if (this.horasEstagios[i] == 0) {
                this.horasEstagios[i] = horas;
                this.mesesEstagios[i] = 4;
                break;
            }
        }
    }

    public void adicionarEstagio(int horas, int meses) {
        for (int i = 0; i < this.horasEstagios.length; i++) {
            if (this.horasEstagios[i] == 0) {
                this.horasEstagios[i] = horas;
                this.mesesEstagios[i] = meses;
                break;
            }
        }
    }

    public void adicionarProjeto(int meses) {
        for (int i = 0; i < this.projetos.length; i++) {
            if (this.projetos[i] == 0) {
                this.projetos[i] = meses;
                break;
            }
        }
    }

    public void adicionarCurso(double horas) {
        this.cursos.add(horas);
    }

    public int contaCreditos() {
        return calculaCreditosEstagio() + calculaCreditosProjeto() + calculaCreditosCursos();
    }

    public String[] pegaAtividades() {
        ArrayList<String> atividades = new ArrayList<>();

        for (int estagio : this.horasEstagios) {
            boolean atingiuUltimoEstagioAdicionado = estagio == 0;
            if (atingiuUltimoEstagioAdicionado) {
                break;
            }
            atividades.add("Estagio " + estagio);
        }
        for (int projeto : this.projetos) {
            boolean atingiuUltimoProjetoAdicionado = projeto == 0;
            if (atingiuUltimoProjetoAdicionado) {
                break;
            }
            atividades.add("Projeto " + projeto);
        }
        atividades.add("Cursos " + pegaTotalHorasCursos());

        atividades.add("Creditos_Estagio " + calculaCreditosEstagio());
        atividades.add("Creditos_Projeto " + calculaCreditosProjeto());
        atividades.add("Creditos_Cursos " + calculaCreditosCursos());

        return atividades.toArray(new String[0]);
    }

    private int calculaCreditosEstagio() {
        final int HORAS_NECESSARIAS = 300;
        final int MESES_NECESSARIOS = 4;
        final int CREDITOS = 5;
        int somaPontos = 0;

        for (int i = 0; i < this.horasEstagios.length; i++) {
            int pontosHoras = this.horasEstagios[i] / HORAS_NECESSARIAS;
            int pontosMeses = this.mesesEstagios[i] / MESES_NECESSARIOS;
            if (pontosHoras < pontosMeses) {
                somaPontos += pontosHoras;
            } else {
                somaPontos += pontosMeses;
            }
        }
        int totalCreditos = somaPontos * CREDITOS;
        return totalCreditos;

    }

    private int calculaCreditosProjeto() {
        final int MESES = 3;
        final int CREDITOS = 2;
        int mesesProjeto = pegaTotalMesesProjeto();
        return (mesesProjeto / MESES) * CREDITOS;
    }

    private int calculaCreditosCursos() {
        final int HORAS = 30;
        final int CREDITOS = 1;
        double horasCursos = pegaTotalHorasCursos();
        return (int) (horasCursos / HORAS) * CREDITOS;
    }

    private int pegaTotalMesesProjeto() {
        int mesesProjeto = 0;
        for (int projeto : this.projetos) {
            mesesProjeto += projeto;
        }
        return mesesProjeto;
    }

    private double pegaTotalHorasCursos() {
        double horasCursos = 0;
        for (double curso : this.cursos) {
            horasCursos += curso;
        }
        return horasCursos;
    }

}