package lab2;

public class CoisaBonus {
  public static void main(String[] args) {
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
}
