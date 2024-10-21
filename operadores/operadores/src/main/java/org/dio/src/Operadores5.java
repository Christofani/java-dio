package org.dio.src;

public class Operadores5 {
  public static void main(String[] args) {
    String nomeUm = "Rodrigo";
    String nomeDois = new String("Rodrigo");


    System.out.println(nomeUm == nomeDois);
    System.out.println(nomeUm.equals(nomeDois));

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 < numero2) {
      System.out.println("A nossa condição é verdadeira!");
    }

    System.out.println("NumeroUm é igual a numeroDois ? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);
  }
}
