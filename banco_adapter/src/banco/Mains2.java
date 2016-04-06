package banco;

import persistencia.PessoaDAO;
import persistencia.PessoaDAOSeguro;
import entidade.Pessoa;
import gui.ExcluiForm;

public class Mains2 {

	public static void main(String[] args) {
		
		// aula dia 13/11 -  padrão proxy/wrapper/delegate
		
		
		// Tipo de ataque (explorar vulnerabilidade)
		// que se baseia incluir comandos SQL no lugar de parâmetros convencionais
		
		
//		Pessoa p = new Pessoa();
//		p.setNome("Felipe");
//		p.setSobrenome("Santos");
		
		//o objeto "proxiado" (PessoaDAO) deve ter uma interface
	
//		dao.insert(p);
//		
//		Pessoa p = new Pessoa();
//		p.setNome("Marcos");
//		p.setSobrenome("Oleiro");// faz deletar tdo o banco (sql injction)
//	
//		dao.insert(p);
		
//		dao.delete(p);	
		
		// Mecânica do proxy:
		// criar uma classe que implemente a mesma classe do 'proxiado;
		// tenha oo 'proxiado' como atributo;
		// e intercepte a chamada de métodos
		
		
		PessoaDAO  daoReal = new PessoaDAO();
		PessoaDAOSeguro proxy = new PessoaDAOSeguro(daoReal);
		
		ExcluiForm form =  new ExcluiForm(proxy);
		
		
		
		
		
		
	}
}
