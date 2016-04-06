package persistencia;

import entidade.Cidade;
import entidade.Pessoa;

public class Cidade_Adapter implements DAO_Pessoa{
	
	DAO_Cidade cidade_dao;
	
	public Cidade_Adapter(DAO_Cidade cidade_dao) {
		this.cidade_dao = cidade_dao;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void insert(Pessoa p) {
		// TODO Auto-generated method stub
		PessoaDAO dao = new PessoaDAO();
		dao.insert(p);	
		
	}
	

}
