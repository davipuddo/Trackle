// Trackle

package util;

public class Task {
	
	private int UserID;
	private int ID;
	private String taskName;
	private String taskDescription;
	private int priority;
	private String date;
	
	// Constructor with params
	public Task (int i, String name, String desc, int prio, String d, int ui)
	{
		UserID = -1;
		ID = -1;
		taskName = "";
		taskDescription = "";
		priority = -1;
		date = null;
		
		if (ui >= 0 && i >= 0 && name != null && desc != null && prio >= 0 && d != null && d.length() > 0)
		{
			UserID = ui;
			ID = i;
			taskName = name;
			taskDescription = desc;
			priority = prio;
			date = d;
		}
	}
	
	// Constructor without params
	public Task ()
	{
		this(-1, null, null, -1, null, -1);
	}
	
	public String toString ()
	{
		String buffer = "";
		
		buffer = ("(" + ID + ",'" + taskName + "','" 
					  + taskDescription + "'," + priority + ",'" 
					  + date + "'," + UserID + ")");
		
		return (buffer);
	}
}
