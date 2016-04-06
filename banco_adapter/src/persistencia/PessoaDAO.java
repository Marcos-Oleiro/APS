package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class PessoaDAO implements DAO_Pessoa {

	

	@Override
	public void insert(Pessoa p) {		
		try {
					
			String sql = "INSERT INTO pessoas "
					   + "VALUES ('" + p.getNome() + "', '" + p.getSobrenome() + "');";
			
//			System.out.println(sql);
			
//			Connection conexao = 
//					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = ConnectionFactory.getInstance().getConnection().createStatement();
			
			int registros = comando.executeUpdate(sql);
			
//			System.out.println(registros);
			
//			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

//	@Override
//	public void delete(Pessoa p) {
//		try {
//			
//			String sql = "DELETE FROM pessoas "
//					   + "WHERE nome = '" + p.getNome() 
//					   + "' AND sobrenome = '" + p.getSobrenome() + "';";
//			
////			System.out.println(sql);
//			
//			
//			Statement comando = ConnectionFactory.getInstance().getConnection().createStatement();
//			
//			int registros = comando.executeUpdate(sql);
//			
//			System.out.println(registros);
//			
////			conexao.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public List<Pessoa> select() {
//		List<Pessoa> registros = new ArrayList<Pessoa>();
//		
//		try {
//			
//			String sql = "SELECT nome, sobrenome FROM pessoas";
//						
////			Connection conexao = 
////					DriverManager.getConnection(URL, USUARIO, SENHA);
//			
//			Statement comando = ConnectionFactory.getInstance().getConnection().createStatement();
//			
//			ResultSet resultado = comando.executeQuery(sql);
//			
//			while (resultado.next()) {
//				Pessoa p = new Pessoa();
//				p.setNome(resultado.getString("nome")); 
//				p.setSobrenome(resultado.getString("sobrenome"));
//				registros.add(p);
//			}
//			
////			conexao.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return registros;
//	}

//	@Override
//	public void update(Pessoa antigo, Pessoa novo) {
//		// TODO Auto-generated method stub	
//		try{
//			String antigo_nome = antigo.getNome();
//			String antigo_sobrenome = antigo.getSobrenome();   
//			String novo_nome =  novo.getNome();
//			String novo_sobrenome = novo.getSobrenome();
//			
//			String sql = "UPDATE pessoas SET nome = '" + novo_nome + "' WHERE nome = '" + antigo_nome + "';" ; 
//			String sql1 = "UPDATE pessoas SET sobrenome = '" + novo_sobrenome + "' WHERE sobrenome = '" +  
//							antigo_sobrenome + "';";
//			
////			System.out.println(sql);
////			System.out.println(sql1);
//
////			String sql = "INSERT INTO pessoas "
////					   + "VALUES ('" + p.getNome() + "', '" + p.getSobrenome() + "');";
////			Connection conexao = 
////					DriverManager.getConnection(URL, USUARIO, SENHA);
//			Statement comando = ConnectionFactory.getInstance().getConnection().createStatement();			
//			int registros = comando.executeUpdate(sql);
//			Statement comando1 = ConnectionFactory.getInstance().getConnection().createStatement();
//			int registros1 = comando1.executeUpdate(sql1);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}


}
