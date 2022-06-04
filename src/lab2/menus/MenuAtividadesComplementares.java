package lab2.menus;

import java.util.Scanner;

import lab2.AtividadesComplementares;

public class MenuAtividadesComplementares {
  private static AtividadesComplementares atividadesComplementares;
  private static Scanner sc = new Scanner(System.in);

  private static final String[] OPCOES_MENU = {
      "------ MENU ATIVIDADES COMPLEMENTARES ------",
      "1 - Adicionar estágio",
      "2 - Adicionar projeto",
      "3 - Adicionar curso",
      "4 - Exibir quantidade de créditos",
      "5 - Exibir todas as atividades",
      "6 - Voltar",
  };

  public static void setAtividadesComplementares(AtividadesComplementares atividadesComplementares) {
    MenuAtividadesComplementares.atividadesComplementares = atividadesComplementares;
  }

  public static void abrir() {
    while (true) {
      Menu.printarEspacamento();
      Menu.mostrarMenu(OPCOES_MENU);
      String acaoUsuario = sc.nextLine();
      Menu.printarEspacamento();

      switch (acaoUsuario) {
        case "1":
          adicionarEstagio();
          break;
        case "2":
          adicionarProjeto();
          break;
        case "3":
          adicionarCurso();
          break;
        case "4":
          exibirQuantidadeCreditos();
          break;
        case "5":
          exibirTodasAtividades();
          break;
        case "6":
          // Voltar para o menu principal
          return;
        default:
          System.out.println("Entrada inválida");
          break;
      }

    }
  }

  private static void adicionarEstagio() {
    System.out.print("Quantidade de horas: ");
    int horasEstagio = Integer.parseInt(sc.nextLine());
    atividadesComplementares.adicionarEstagio(horasEstagio);
  }

  private static void adicionarProjeto() {
    System.out.print("Quantidade de meses: ");
    int mesesProjeto = Integer.parseInt(sc.nextLine());
    atividadesComplementares.adicionarProjeto(mesesProjeto);
  }

  private static void adicionarCurso() {
    System.out.print("Quantidade de horas: ");
    double horasCurso = Double.parseDouble(sc.nextLine());
    atividadesComplementares.adicionarCurso(horasCurso);
  }

  private static void exibirQuantidadeCreditos() {
    System.out.println(atividadesComplementares.contaCreditos());

  }

  private static void exibirTodasAtividades() {
    String[] atividades = atividadesComplementares.pegaAtividades();
    for (String atividade : atividades) {
      System.out.println(atividade);

    }
  }

}
