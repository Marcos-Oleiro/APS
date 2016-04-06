package util;

public class Pessoa {
  // atributo
  private String nome;
  private Data dataNascimento;

  public void setDataNascimento(Data data) {
    this.dataNascimento = data;
  }

  public Data getDataNascimento() {
    return this.dataNascimento;
  }

  // propriedade
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

}
