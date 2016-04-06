package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL     = "jdbc:postgresql://localhost/cobaia";
	private static final String USUARIO = "postgres";
	private static final String SENHA   = "senha";
	
	private Connection conexao;
	
	
	
	// primeiro passo para criar um singleton:
	// privatizar o construtor
	
	// segundo passo:
	// criar um atributo dele mesmo
	
	private static ConnectionFactory singleton;
	
	
	
	private ConnectionFactory(){
		
		try {
			conexao =  DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// terceiro passo:
	// fornecer um método estático público para acessá-lo
	
	public static ConnectionFactory getInstance(){
		
		if (singleton == null) singleton = new ConnectionFactory();
		return singleton;		
	}
	
	
	
	
	public Connection getConnection(){
			
		return conexao;
		
	}
	
	
	
	
	
}
