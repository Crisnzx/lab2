package lab2.menus;

import java.util.Scanner;

import lab2.RegistroTempoOnline;

public class MenuRegistroTempoOnline {

  private static RegistroTempoOnline registroTempoOnline;
  private static Scanner sc = new Scanner(System.in);

  private static final String[] OPCOES_MENU = {
      "------ MENU REGISTRO TEMPO ONLINE ------",
      "1 - Adicionar tempo online",
      "2 - Verificar se a meta de tempo online foi atingida",
      "3 - Exibir informações",
      "4 - Voltar",
  };

  public static void setRegistroTempoOnline(RegistroTempoOnline registroTempoOnline) {
    MenuRegistroTempoOnline.registroTempoOnline = registroTempoOnline;
  }

  public static void abrir() {
    while (true) {
      Menu.printarEspacamento();
      Menu.mostrarMenu(OPCOES_MENU);
      String acaoUsuario = sc.nextLine();
      Menu.printarEspacamento();
      try {
        switch (acaoUsuario) {
          case "1":
            adicionarTempoOnline();
            break;
          case "2":
            verificarSeAtingiuMetaTempoOnline();
            break;
          case "3":
            exibirInformacoes();
            break;
          case "4":
            return;
          default:
            System.out.println("Entrada inválida");
            break;
        }
      } catch (Exception e) {
        System.out.println("Entrada inválida");

      }
    }
  }

  private static void adicionarTempoOnline() {
    System.out.print("Tempo: ");
    int tempoOnline = Integer.parseInt(sc.nextLine());
    registroTempoOnline.adicionaTempoOnline(tempoOnline);
  }

  private static void verificarSeAtingiuMetaTempoOnline() {
    if (registroTempoOnline.atingiuMetaTempoOnline()) {
      System.out.println("Meta atingida!");
    } else {
      System.out.println("Meta não atingida!");
    }
  }

  private static void exibirInformacoes() {
    System.out.println(registroTempoOnline.toString());
  }

}
