package org.dio;

public enum EstadoBrasileiro {
  SAO_PAULO ("SP", "São Paulo", 11),
  RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12),
  PIAUI ("PI", "Piauí", 13),
  MARANHAO ("MA", "Maranhão", 14),;

  private String nome;
  private String sigla;
  private int ibge;

  private EstadoBrasileiro(String nome, String sigla, int ibge) {
    this.nome = nome;
    this.sigla = sigla;
    this.ibge = ibge;
  }

  public int getIbge() {
    return ibge;
  }

  public String getNome() {
    return nome;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }
}
