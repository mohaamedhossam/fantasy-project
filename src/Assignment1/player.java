package Assignment1;

import java.io.IOException;

public abstract class player 
{
	public String name;
	public String nationality;
	public String club;
	public String position;
	public String price;
	public abstract void Add_player(String name,String position,String club, String nationality, String price) throws IOException;
	public void retrive(String Name) 
	{
		
	}
}
