// Trackle

package dao;

import util.*;
import java.sql.*;

public class UserDAO extends DAO 
{
	// Iniciar conexao
	UserDAO ()
	{
		super();
		connect();
	}
	
	public void finalize ()
	{
		close();
	}
	
	// Inserir usuario
	public boolean insert (User user)
	{
		boolean status = false;
		
		if (user != null)
		{
			try
			{
				Statement st = connection.createStatement();
				
				String buffer = "INSERT INTO users (id, name, password, tasks)";
				
				st.executeQuery(buffer);
				st.close();
				status = true;
			}
			catch (SQLException e)
			{
				throw new RuntimeException(e);
			}
		}
		return (status);
	}
}
