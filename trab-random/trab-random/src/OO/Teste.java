package OO;

public class Teste {

	public static void main(String[] args) {

		// 1000000
		// como o teste não é preciso, precisamos gerar 1 milhão de vezes
		// e checar se os números gerados estão no intervalo:


		System.out.println("Testando intervalo ...");
		Randomizer r = new MiddleSquareRandomizer();
		for (int i = 0; i < 1000000; i++) {
		    double n = r.random();
		    if (n < 0 || n >= 1.0) System.out.println("false: " + n);
		}

		System.out.println("Testando variação ...");
		Randomizer r2 = new MiddleSquareRandomizer();
		int[] variacao = new int[10];
		for (int i = 0; i < 1000000; i++) {
		    variacao[((int) (r2.random() * 10))]++;
		}
		// deve ter +ou- 100000 em cada slot:
		System.out.println(java.util.Arrays.toString(variacao));
// 

		// long aux_num = System.currentTimeMillis();
  //       String str_aux = String.valueOf(aux_num);
  //       str_aux = str_aux.substring(7,13);
  //       System.out.println(str_aux);
  //       double seed = Double.parseDouble(str_aux);
  //       System.out.println(seed);

		// Randomizer r = new MiddleSquareRandomizer();
		// int i = 0;

		// while (i <5){
		// 	System.out.println("random: " +r.random());
		// 	System.out.println("-------------");
		// 	i++;
		// }
            


	}
// 

}