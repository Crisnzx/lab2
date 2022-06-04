package lab2;

import java.util.ArrayList;

public class AtividadesComplementares {

    private int[] estagios = new int[4];
    private int[] projetos = new int[16];
    private ArrayList<Double> cursos = new ArrayList<Double>();

    /**
     * Há um limite de quantidade de estágios, se o array estiver cheio, o dado não
     * é adicionado.
     *
     * @param horas
     */
    public void adicionarEstagio(int horas) {
        for (int i = 0; i < this.estagios.length; i++) {
            if (this.estagios[i] == 0) {
                this.estagios[i] = horas;
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

    private int pegaHorasEstagio() {
        int horasEstagio = 0;
        for (int estagio : this.estagios) {
            horasEstagio += estagio;
        }
        return horasEstagio;
    }

    private int pegaMesesProjeto() {
        int mesesProjeto = 0;
        for (int projeto : this.projetos) {
            mesesProjeto += projeto;
        }
        return mesesProjeto;
    }

    private double pegaHorasCursos() {
        double horasCursos = 0;
        for (double curso : this.cursos) {
            horasCursos += curso;
        }
        return horasCursos;
    }

    private int calculaCreditosEstagio() {
        final int HORAS = 300;
        final int CREDITOS = 5;
        int horasEstagio = pegaHorasEstagio();
        return (horasEstagio / HORAS) * CREDITOS;

    }

    private int calculaCreditosProjeto() {
        final int MESES = 3;
        final int CREDITOS = 2;
        int mesesProjeto = pegaMesesProjeto();
        return (mesesProjeto / MESES) * CREDITOS;
    }

    private int calculaCreditosCursos() {
        final int HORAS = 30;
        final int CREDITOS = 1;
        double horasCursos = pegaHorasCursos();
        return (int) (horasCursos / HORAS) * CREDITOS;
    }

    public int contaCreditos() {
        return calculaCreditosEstagio() + calculaCreditosProjeto() + calculaCreditosCursos();
    }

    public String[] pegaAtividades() {
        ArrayList<String> atividades = new ArrayList<>();

        for (int estagio : this.estagios) {
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
        atividades.add("Cursos " + pegaHorasCursos());

        atividades.add("Creditos_Estagio " + calculaCreditosEstagio());
        atividades.add("Creditos_Projeto " + calculaCreditosProjeto());
        atividades.add("Creditos_Cursos " + calculaCreditosCursos());

        return atividades.toArray(new String[0]);
    }

}