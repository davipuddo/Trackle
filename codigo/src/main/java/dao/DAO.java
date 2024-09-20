// Trackle

package dao;

import java.sql.*;

public class DAO 
{
	protected Connection connection;
	
	// Construtor
	public DAO() 
	{
		connection = null;
	}
	
	// Fazer conexao
	public boolean connect() 
	{	
		// Parametros da conexao
		String driverName = "org.postgresql.Driver";                    
		String serverName = "localhost";
		String mydatabase = "Trackle";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta +"/" + mydatabase;
		String username = "trackle";
		String password = "1234";	// Provisorio
		
		boolean status = false; 	// status de retorno

		try 
		{
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
			status = (connection == null);
			System.out.println("Conexão efetuada com o postgres!");
		} 
		catch (ClassNotFoundException e) 
		{ 
			System.err.println("Conexão NÃO efetuada com o postgres -- Driver não encontrado -- " + e.getMessage());
		} 
		catch (SQLException e) 
		{
			System.err.println("Conexão NÃO efetuada com o postgres -- " + e.getMessage());
		}
		return status;
	}

	// Fechar conexao
	public boolean close() 
	{
		boolean status = false;
		
		try 
		{
			connection.close();
			status = true;
		} 
		catch (SQLException e) 
		{
			System.err.println(e.getMessage());
		}
		return status;
	}
}