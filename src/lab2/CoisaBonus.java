package lab2;

public class CoisaBonus {
    public static void main(String[] args) {
        emojisDescanso();
        System.out.println("-----");
        mediaPonderadaDisciplinas();
        System.out.println("-----");
        registroDetalhadoEstagios();

    }

    private static void emojisDescanso() {
        Descanso descanso = new Descanso();
        descanso.definirEmoji("*-*");
        System.out.println(descanso.getStatusGeral());
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
        System.out.println(descanso.getStatusGeral());
        System.out.println(descanso.getStatusGeral());
        descanso.definirEmoji(":(");
        System.out.println(descanso.getStatusGeral());
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(2);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
    }

    private static void mediaPonderadaDisciplinas() {
        Disciplina lp2 = new Disciplina("LabProg2", 9);
        System.out.println(lp2.aprovado());
        for (int i = 1; i <= 9; i++) {
            lp2.cadastraNota(i, 7);
        }
        System.out.println(lp2.toString());
        System.out.println(lp2.aprovado());

        int[] pesoNotas = { 2, 4, 4, 4, 5 };
        Disciplina calculo1 = new Disciplina("Calculo1", 5, pesoNotas);
        System.out.println(calculo1.aprovado());
        for (int i = 1; i <= 5; i++) {
            calculo1.cadastraNota(i, i * 2);
        }
        System.out.println(calculo1.toString());
        System.out.println(calculo1.aprovado());

    }

    private static void registroDetalhadoEstagios() {
        AtividadesComplementares minhasAtividades = new AtividadesComplementares();
        minhasAtividades.adicionarEstagio(400);
        minhasAtividades.adicionarEstagio(400, 8);
        minhasAtividades.adicionarEstagio(200, 3);
        minhasAtividades.adicionarEstagio(900, 8);
        String[] minhasAtividadesInfo = minhasAtividades.pegaAtividades();
        for (int i = 0; i < minhasAtividadesInfo.length; i++) {
            System.out.println(minhasAtividadesInfo[i]);
        }
        System.out.println(minhasAtividades.contaCreditos());
    }

}
