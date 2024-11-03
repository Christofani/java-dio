package org.dio.escola;

public class Escola {
  public static void main(String[] args) {
    Aluno rodrigo = new Aluno();
    rodrigo.setNome("Rodrigo");
    rodrigo.setIdade(26);

    System.out.println("O aluno " + rodrigo.getNome() + " tem " + rodrigo.getIdade() + " anos");
  }
}
