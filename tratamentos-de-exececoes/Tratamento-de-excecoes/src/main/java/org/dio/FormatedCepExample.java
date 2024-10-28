package org.dio;

public class FormatedCepExample {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatedCep("2676506");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O cep não contém 8 dígitos ! ");
    }

  }

  static String formatedCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    return "26.765-064";
  }
}
