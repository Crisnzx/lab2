package lab2.menus;

import java.util.Scanner;

import lab2.Descanso;

public class MenuDescanso {

  private static Descanso descanso;
  private static Scanner sc = new Scanner(System.in);

  private static final String[] OPCOES_MENU = {
      "------ MENU DESCANSO ------",
      "1 - Exibir status geral",
      "2 - Definir emoji",
      "3 - Atualizar horas de descanso",
      "4 - Atualizar número de semanas",
      "5 - Voltar"
  };

  public static void setDescanso(Descanso descanso) {
    MenuDescanso.descanso = descanso;
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
            printarStatusGeral();
            break;
          case "2":
            definirEmoji();
            break;
          case "3":
            atualizarHorasDescanso();
            break;
          case "4":
            atualizarNumeroSemanas();
            break;
          case "5":
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

  private static void printarStatusGeral() {
    System.out.println(descanso.getStatusGeral());
  }

  private static void definirEmoji() {
    System.out.print("Emoji: ");
    String emoji = sc.nextLine();
    descanso.definirEmoji(emoji);
  }

  private static void atualizarHorasDescanso() {
    System.out.print("Horas de descanso: ");
    int horasDescanso = Integer.parseInt(sc.nextLine());
    descanso.defineHorasDescanso(horasDescanso);
  }

  private static void atualizarNumeroSemanas() {
    System.out.print("Número de semanas: ");
    int numeroSemanas = Integer.parseInt(sc.nextLine());
    descanso.defineNumeroSemanas(numeroSemanas);
  }

}