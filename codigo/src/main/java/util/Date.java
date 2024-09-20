// Trackle

package util;

public class Date {
	
	private int[] date;
	
	/*
	date[0] = dia
	date[1] = mes
	date[2] = ano
	date[3] = hora
	date[4] = minuto
	date[5] = segundo
	*/
	
	protected boolean isValid ()
	{
		boolean res = false;
		if (date[0] > 0 && date[1] > 0 && date[2] > 0)
		{
			if (date[0] < 31 && date[1] < 12 && date[3] < 24 && date[4] < 60 && date[5] < 60)
			{
				res = true;
			}
		}
		return (res);
	}
	
	// Constructor with int params
	public Date (int d, int mo, int y, int h, int mi, int sec)
	{
		date[0] = d;
		date[1] = mo;
		date[2] = y;
		date[3] = h;
		date[4] = mi;
		date[5] = sec;
		
		if (!this.isValid())
		{
			for (int i = 0; i < 6; i++)
			{
				date[i] = -1;
			}
		}
		
	}
	
	// Constructor without params
	public Date ()
	{
		this(0,0,0,-1,-1,-1);
	}
	
	public int getDay ()
	{
		return (date[0]);
	}
	
	public int getMonth ()
	{
		return (date[1]);
	}
	
	public int getYear ()
	{
		return (date[2]);
	}
	
	public int getHours()
	{
		return (date[3]);
	}
	
	public int getMins()
	{
		return (date[4]);
	}
	
	public int getSec()
	{
		return (date[5]);
	}
	
	public String toString ()
	{
		String buffer = "";
		
		buffer = (date[0] + "/" + date[1] + "/" + date[2] + "-" + date[3] + ":" + date[4] + ":" + date[5]); 
		
		return (buffer);
	}
}
