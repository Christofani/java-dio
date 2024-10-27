package org.dio;

public class ExemploForEach {
  public static void main(String[] args) {
    String nomes[] = {"Rodrigo", "Karina", "Michael", "Ana"};

    for (String nome: nomes) {
      System.out.println("Nome da pessoa é: " + nome);
    }
  }
}
