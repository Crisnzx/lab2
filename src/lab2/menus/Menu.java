package lab2.menus;

public class Menu {

  public static void printarEspacamento() {
    System.out.println("");
  }

  public static void mostrarMenu(String[] opcoesMenu) {
    printarEspacamento();
    for (String opcaoMenu : opcoesMenu) {
      System.out.println(opcaoMenu);
    }
  }
}
