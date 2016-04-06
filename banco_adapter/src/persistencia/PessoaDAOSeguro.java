package persistencia;

import java.util.List;

import entidade.Pessoa;

public class PessoaDAOSeguro implements DAO<Pessoa>{

	
	private DAO<Pessoa> dao;

	public  PessoaDAOSeguro(DAO<Pessoa> dao) {
		this.dao = dao;	
	}
	
	public void limpa (Pessoa o){
		o.setNome(o.getNome().replace("'", "''"));
		o.setSobrenome(o.getSobrenome().replace("'", "''"));
		
	}
	
	@Override
	public void insert(Pessoa o) {
		limpa(o);
		dao.insert(o);
	}

	@Override
	public void delete(Pessoa o) {
		limpa(o);
		dao.delete(o);
	}

	@Override
	public List<Pessoa> select() {
		return dao.select();
	}

	@Override
	public void update(Pessoa antigo, Pessoa novo) {
		
		dao.update(antigo, novo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
