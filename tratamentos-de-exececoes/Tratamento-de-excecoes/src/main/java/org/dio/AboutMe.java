package org.dio;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o seu nome: ");
      String nome = scanner.next();

      System.out.println("Digite o seu sobrenome: ");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();

      //Imprimindo dados obtidos pelo usuário

      System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos.");
      System.out.println("Minha altura é " + altura + " cm.");
      scanner.close();
    } catch (Exception e) {
      System.out.println("Coloque as informações conforme é pedido númerico ou texto");
    }

  }

}
