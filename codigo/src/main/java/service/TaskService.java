// Trackle

package service;

import dao.*;
import util.Task;

public class TaskService 
{
	
	private DAO dao;
	private TaskDAO TDAO;
	
	public TaskService ()
	{
		dao = new DAO();
		dao.connect();
		
		TDAO = new TaskDAO();
	}
	
	public String insert (Task task)
	{
		String res = "";
		
		try
		{
			TDAO.insert(task);
			res = "sisi";
		}
		catch (RuntimeException e)
		{
			res = e + "";
		}
		return (res);
	}
	
	public String get (int ID)
	{
		String res = "";
		
		try
		{
			res = TDAO.get(ID).toString();
		}
		catch (RuntimeException e)
		{
			res = "ERRO: Os dados não puderam ser obtidos! | Codigo de erro: " + e;
		}
		return (res);
	}
	
	public String getAll ()
	{
		String res = "";
		
		try
		{
			res = TDAO.getAll().toString();
		}
		catch (RuntimeException e)
		{
			res = "ERRO: Os dados não puderam ser obtidos! | Codigo de erro: " + e;
		}
		return (res);
	}

}
