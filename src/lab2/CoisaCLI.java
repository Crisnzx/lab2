package lab2;

import java.util.Scanner;

import lab2.menus.Menu;
import lab2.menus.MenuAtividadesComplementares;
import lab2.menus.MenuDescanso;
import lab2.menus.MenuDisciplina;
import lab2.menus.MenuRegistroTempoOnline;

public class CoisaCLI {

  private static final String[] OPCOES_MENU = {
      "------ MENU ------",
      "1 - Descanso",
      "2 - Registro Tempo Online",
      "3 - Disciplina",
      "4 - Atividades Complementares",
      "5 - Sair"
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Descanso descanso = new Descanso();
    MenuDescanso.setDescanso(descanso);

    RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2");
    MenuRegistroTempoOnline.setRegistroTempoOnline(tempoLP2);

    Disciplina lp2 = new Disciplina("LP2");
    MenuDisciplina.setDisciplina(lp2);

    AtividadesComplementares minhasAtividades = new AtividadesComplementares();
    MenuAtividadesComplementares.setAtividadesComplementares(minhasAtividades);

    while (true) {
      Menu.printarEspacamento();
      Menu.mostrarMenu(OPCOES_MENU);
      String acaoUsuario = sc.nextLine();
      Menu.printarEspacamento();

      switch (acaoUsuario) {
        case "1":
          MenuDescanso.abrir();
          break;
        case "2":
          MenuRegistroTempoOnline.abrir();
          break;
        case "3":
          MenuDisciplina.abrir();
          break;
        case "4":
          MenuAtividadesComplementares.abrir();
          break;
        case "5":
          return;
        default:
          System.out.println("Entrada inválida");
          break;
      }

    }

  }
}
