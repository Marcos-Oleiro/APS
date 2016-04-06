package banco;

import java.util.List;

import entidade.Pessoa;
import persistencia.PessoaDAO;

public class Main {

	public static void main(String[] args) {
		
//		Pessoa p = new Pessoa();
//		p.setNome("Felipe");
//		p.setSobrenome("Santos");
//		
//		System.out.println(p);
//		
//		// p.insert(); // Active Record		
//		// Padrão de Arquitetura DAO
//		// http://corej2eepatterns.com/DataAccessObject.html
		PessoaDAO dao = new PessoaDAO();
//		// insert, save, create, persist, ...		
//		dao.insert(p);
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








