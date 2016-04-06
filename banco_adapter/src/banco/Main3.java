package banco;

import persistencia.PessoaDAO;
import entidade.Pessoa;

public class Main3 {

	 public static void main(String[] args) {
		
		 long inicio = System.currentTimeMillis();
		 
		 PessoaDAO dao = new PessoaDAO();
		 Pessoa p = new Pessoa();
		 p.setSobrenome("um sobrenome");
		 for (int i = 0;  i < 1000; i ++ ){			 
			 	p.setNome("Pessoa" + i );
			 	dao.insert(p);
		 }
		 
		 long termino = System.currentTimeMillis();
		 
		 
		 System.out.println( (termino - inicio ) +"ms");
		 
		 
		 
	}
}
