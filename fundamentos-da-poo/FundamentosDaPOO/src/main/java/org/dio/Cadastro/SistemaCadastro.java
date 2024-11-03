package org.dio.Cadastro;

public class SistemaCadastro {
  public static void main(String[] args) {
    Pessoa rodrigo = new Pessoa("Rodrigo" , "123");

    rodrigo.setEndereco("Rua das papoulas");

    System.out.println(rodrigo.getNome()  + " - " + rodrigo.getCpf());
  }
}
