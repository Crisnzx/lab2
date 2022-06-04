package lab2.menus;

import java.util.Scanner;

import lab2.Disciplina;

public class MenuDisciplina {
  private static Disciplina disciplina;
  private static Scanner sc = new Scanner(System.in);

  private static final String[] OPCOES_MENU = {
      "------ MENU DISCIPLINA ------",
      "1 - Cadastrar horas de estudo",
      "2 - Cadastrar nota",
      "3 - Checar se está aprovado",
      "4 - Exibir informações",
      "5 - Voltar"
  };

  public static void setDisciplina(Disciplina disciplina) {
    MenuDisciplina.disciplina = disciplina;
  }

  public static void abrir() {
    while (true) {
      Menu.printarEspacamento();
      Menu.mostrarMenu(OPCOES_MENU);
      String acaoUsuario = sc.nextLine();
      Menu.printarEspacamento();

      switch (acaoUsuario) {
        case "1":
          cadastrarHorasEstudo();
          break;
        case "2":
          cadastrarNota();
          break;
        case "3":
          checarEstaAprovado();
          break;
        case "4":
          exibirInformacoes();
          break;
        case "5":
          return;
        default:
          System.out.println("Entrada inválida");
          break;
      }
    }
  }

  private static void cadastrarHorasEstudo() {
    System.out.print("Horas de estudo: ");
    int horasEstudo = Integer.parseInt(sc.nextLine());
    disciplina.cadastraHoras(horasEstudo);
  }

  private static void cadastrarNota() {
    System.out.print("Número da nota: ");
    int numeroNota = Integer.parseInt(sc.nextLine());
    System.out.print("Nota obtida: ");
    double nota = Double.parseDouble(sc.nextLine());

    disciplina.cadastraNota(numeroNota, nota);
  }

  private static void checarEstaAprovado() {
    if (disciplina.aprovado()) {
      System.out.println("Aprovado!");

    } else {
      System.out.println("Reprovado!");
    }
  }

  private static void exibirInformacoes() {
    System.out.println(disciplina.toString());
  }

}
