// Trackle

import static spark.Spark.*;
import dao.*;
import util.*;
import service.TaskService;


public class App
{
	public static TaskService TS = new TaskService();
	
	public static int[] t = {1,2,3};
	
	public static User u = new User(0,"davi","1234", t);
	
	public static void main (String[] args)
	{
		System.out.println (TS.get(0));
		System.out.println (u.toString());
	}	
}
