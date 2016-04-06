package util;

public class Data {

  private int dia, mes, ano;

  public Data(int d, int m, int a) {
    dia = d;
    mes = m;
    ano = a;
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  public Data proximoMes() {
    return new Data(dia, mes + 1, ano);
  }

  public String toString() {
    return dia + "/" + mes + "/" + ano;
  }

}
