package jdbc;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

	private static String url = "jdbc:postgresql://localhost:5432/3way";
	private static String usuario = "postgres";
	private static String senha = "honeypot";

	public static Connection getConexao() throws SQLException {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			return DriverManager.getConnection(url, usuario,senha);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
	
}
