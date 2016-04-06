package banco;

import persistencia.CidadeDAO;
import persistencia.Cidade_Adapter;
import persistencia.DAO_Pessoa;
import persistencia.PessoaDAO;
import entidade.Cidade;
import entidade.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		
//		
//		System.out.println(p);
//		
//		// p.insert(); // Active Record		
//		// Padrão de Arquitetura DAO
//		// http://corej2eepatterns.com/DataAccessObject.html
//		PessoaDAO dao = new PessoaDAO();
//		// insert, save, create, persist, ...		
//		dao.insert(p);
//		System.out.println("feito");
//		Cidade c = new Cidade();
//		c.setNome("Rio Grande");
//		c.setEstado("RS");
		
//		cid_cao.insert(c);

//		c1.setNome("Rio Grande");
//		c1.setEstado("RS");
	// Exemplo do design Adapater 
	// INICIO
		
		CidadeDAO cid_cao = new CidadeDAO();
	
		DAO_Pessoa exemplo = new Cidade_Adapter(cid_cao); 
		
		Pessoa p = new Pessoa();
		
		p.setNome("Marcos");
		
		p.setSobrenome("Oleiro");
		
		exemplo.insert(p);
		
	// FINAL
//		
		
//		dao.update(p, new Pessoa("Felps", "Santos"));
//		
//		Pessoa p2 = new Pessoa();
//		p2.setNome("Tiago");
//		p2.setSobrenome("Telecken' OR '1'='1"); // SQL INJECTION
//		
//		dao.delete(p2);
//				
//		List<Pessoa> registros = dao.select();
//		
//		System.out.println(registros);
//		
//		for (Pessoa r : registros) {
//			System.out.println(r.getNome());
//		}
//		
		// salvar (persistir) essa pessoa
		// persistir: gravar em media persistente (hd, ssd, ...)
		// formatos: txt, csv, xml, json, yaml, nosql, sql
		// o mais usado é o modelo relacional (SQL)
		// normalmente se usa um SGBD (Sistema Gerenciador de Bases de Dados):
		// populares: PostgreSQL, MySQL, Oracle, IBM DB2, 
		// Microsoft SQL Server (mais os noSQL - Mongo, Dynamo, DataStore)
		
//		Pessoa p9 = new Pessoa("Marcos", "Olheiro");
		
//		dao.insert(p9);
		
//		Pessoa p10 = new Pessoa("Marcos", "Olheiro");
//		Pessoa p11 = new Pessoa("Marcos", "Oleiro");
//		
//		dao.update(p10, p11);
		

		
		
		
	}	
}








