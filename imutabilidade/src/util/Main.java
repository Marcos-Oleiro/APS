package util;

public class Main {
  public static void main(String[] args) {
    // estado
    // composição
    Pessoa p = new Pessoa();
    // set/get
    p.setNome("Esnardo");
    System.out.println(p.getNome().equals("Esnardo"));

    p.setNome("Esnardo Silveira");
    System.out.println(p.getNome().equals("Esnardo Silveira"));

    Data d = new Data(3, 9, 1975);

    // assertivas
    System.out.println(d.getDia() == 3);
    System.out.println(d.getMes() == 9);
    System.out.println(d.getAno() == 1975);

    p.setDataNascimento(d);
    System.out.println(p.getNome() + " - " + p.getDataNascimento());

    Pessoa p2 = new Pessoa();
    p2.setNome("Everton");
    p2.setDataNascimento(d);
    System.out.println(p2.getNome() + " - " + p2.getDataNascimento());

    p2.setDataNascimento(new Data(23, 12, 1992));
    System.out.println(p2.getNome() + " - " + p2.getDataNascimento());
    System.out.println(p.getNome() + " - " + p.getDataNascimento());

    Data d3 = new Data(1,12,2015);
    System.out.println(d3); // 1/1/2015
    Data d4 = d3.proximoMes(); // e quando o mês é 12?
    System.out.println(d3); // 1/1/2015
    System.out.println(d4); // 1/2/2015
    Data d5 = d3.proximoMes(10); // 1/11/2015
    Data d6 = d3.proximoMes(15); // 1/4/2016


  }
}
