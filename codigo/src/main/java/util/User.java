package util;

import java.io.*;
import java.security.*;

public class User 
{
	private int id;
	private String name;
	private String password;
	private int[] tasksID;

	// Construtor com parametros
	public User (int ID, String n, String p, int[] t)
	{
		id = -1;
		name = null;
		password = null;
		tasksID = null;
		
		if (ID >= 0 && n != null && n.length() > 0 && p != null & p.length() > 0 && t != null && t.length >= 0)
		{
			id = ID;
			name = n;
			tasksID = t;

			// Criptografar senha
			try
			{
				byte[] buffer = p.getBytes("UTF-8");
				
				try
				{
					MessageDigest md = MessageDigest.getInstance("MD5");
					password = "" + md.digest(buffer);
				}
				catch (NoSuchAlgorithmException e)
				{
					System.err.println ("ERRO: Falha na conversão da senha. ");
				}
			}
			catch (UnsupportedEncodingException e)
			{
				System.err.println ("ERRO: Falha na conversão da senha. ");
			}
		}
	}
	
	// Constructor sem parametros
	public User ()
	{
		this(-1, null, null, null);
	}
	
	// Converter dados do usuario para texto
	public String toString ()
	{
		String res = "";
		String buffer = "";
		
		for (int i = 0; i < tasksID.length; i++)
		{
			buffer += tasksID[i];
			if (i+1 < tasksID.length)
			{
				buffer += ",";
			}
		}
		
		res = id + "," + name + "," + password + "," + tasksID.length + ",{" + buffer + "}";
		
		return (res);
	}
}
