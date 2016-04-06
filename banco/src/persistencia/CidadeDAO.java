package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidade.Cidade;


public class CidadeDAO implements DAO<Cidade> {
	// constantes
	private static final String URL     = "jdbc:postgresql://localhost/cobaia";
	private static final String USUARIO = "postgres";
	private static final String SENHA   = "postgres";
	
	@Override
	public void insert(Cidade c) {		
		try {
					
			String sql = "INSERT INTO cidades "
					   + "VALUES ('" + c.getNome() + "', '" + c.getEstado() + "');";
			
			System.out.println(sql);
			
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			int registros = comando.executeUpdate(sql);
			
			System.out.println(registros);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void delete(Cidade p) {
		try {
			
			String sql = "DELETE FROM Cidades "
					   + "WHERE nome = '" + p.getNome() 
					   + "' AND sobrenome = '" + p.getEstado() + "';";
			
			System.out.println(sql);
			
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			int registros = comando.executeUpdate(sql);
			
			System.out.println(registros);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Cidade> select() {
		List<Cidade> registros = new ArrayList<Cidade>();
		
		try {
			
			String sql = "SELECT nome, sobrenome FROM Cidades";
						
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			ResultSet resultado = comando.executeQuery(sql);
			
			while (resultado.next()) {
				Cidade p = new Cidade();
				p.setNome(resultado.getString("nome")); 
				p.setEstado(resultado.getString("sobrenome"));
				registros.add(p);
			}
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return registros;
	}

	@Override
	public void update(Cidade antigo, Cidade novo) {
		// TODO Auto-generated method stub	
		try{
			String antigo_nome = antigo.getNome();
			String antigo_sobrenome = antigo.getEstado();   
			String novo_nome =  novo.getNome();
			String novo_sobrenome = novo.getEstado();
			
			String sql = "UPDATE Cidades SET nome = '" + novo_nome + "' WHERE nome = '" + antigo_nome + "';" ; 
			String sql1 = "UPDATE Cidades SET sobrenome = '" + novo_sobrenome + "' WHERE sobrenome = '" +  
							antigo_sobrenome + "';";
			
//			System.out.println(sql);
//			System.out.println(sql1);

//			String sql = "INSERT INTO Cidades "
//					   + "VALUES ('" + p.getNome() + "', '" + p.getSobrenome() + "');";
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			Statement comando = conexao.createStatement();			
			int registros = comando.executeUpdate(sql);
			Statement comando1 = conexao.createStatement();
			int registros1 = comando1.executeUpdate(sql1);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
