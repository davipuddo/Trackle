// Trackle

package dao;

import util.*;
import java.sql.*;

public class TaskDAO extends DAO 
{
	// Iniciar conexao
	public TaskDAO ()
	{
		super();
		connect();
	}
	
	// Finalizar conexao
	public void finalize ()
	{
		close();
	}
	
	// Inserir tarefa
	public boolean insert (Task t)
	{
		boolean status = false;
		
		try
		{
			Statement st = connection.createStatement();
			
			String buffer = "INSERT INTO tasks (userid, id, name, description, priority, date) " 
												+ "Values " + (t.toString());
			
			st.executeQuery(buffer);
			st.close();
			status = true;
		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		return (status);
	}
	
	// Retornar uma tarefa pelo id
	public Task get (int id)
	{
		Task res = null;
		
		if (id >= 0)
		{
			try
			{
				Statement st = connection.createStatement();
				
				String buffer = "SELECT * FROM tasks WHERE ID =" + id;
				
				ResultSet rs = st.executeQuery(buffer);
				
				if (rs.next())
				{
					res = new Task(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5) , rs.getInt(6));
				}
				rs.close();
				st.close();
			}
			catch (SQLException e)
			{
				
				throw new RuntimeException (e);
			}
		}
		return (res);
	}
	
	public Task[] getAll()
	{
		Task[] res = new Task[2];
		
		return (res);
	}
}
